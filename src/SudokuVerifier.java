import java.util.ArrayList;

public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	int offset = 0;
	
	public int verify(String candidateSolution) {
		
		// test R1: all numbers are positive
		if(!(this.allNumbersPositive(candidateSolution))) {
			return -1;
		} 
		this.convertToIntArray(candidateSolution); // only convert if every number is positive
		
		// test R3: noReplicaInRow
		if(!(this.noReplicaInEveryRow())) {
			return -3;
		}
		
		//test R4: noReplicaInColumn
		return 0;
	}
	
	public boolean noReplicaInEveryRow() {
		int successCounter = 0;
		
		while(successCounter < 9) 
		{
			if(!(this.noReplicaInSingleRow())) {
				return false;
			} else 
			{
				this.offset = this.offset + 9;
				successCounter++;
			}
		}
		
		return true;
	
	}
	
	public boolean noReplicaInSingleRow() {
		int[] singleRow = new int[9]; 
		
		// build a row to test
		for(int i = 0; i < 9; i++) {
			singleRow[i] = candidateSolutionIntArray[offset + i];
		}
		
		int searchForThisNumber;
		//test row for duplicates
		for(int singleRowCounter = 0; singleRowCounter < singleRow.length; singleRowCounter++) {
			searchForThisNumber = singleRow[singleRowCounter];
			for(int j = 0; j < singleRow.length; j++ ) {
				if(singleRow[j] == searchForThisNumber) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean noReplicaInSingleColumn() {
		int[] singleColumn = new int[9]; 
		
		// build a row to test
		for(int i = 0; i < 9; i++) {
			singleRow[i] = candidateSolutionIntArray[offset + i];
		}
		
		int searchForThisNumber;
		//test row for duplicates
		for(int singleRowCounter = 0; singleRowCounter < singleRow.length; singleRowCounter++) {
			searchForThisNumber = singleRow[singleRowCounter];
			for(int j = 0; j < singleRow.length; j++ ) {
				if(singleRow[j] == searchForThisNumber) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean allNumbersPositive(String candidateSolutionString) {
		char[] candidateSolutionCharArray = candidateSolutionString.toCharArray();
		for(int i = 0; i < candidateSolutionCharArray.length; i++) {
			if(candidateSolutionCharArray[i] == '-') {
				return false;
			}
		}
		return true;
	}
	
	// assumes that all numbers are positive
	public void convertToIntArray(String candidateSolutionString) {
			char[] candidateSolutionCharArray = candidateSolutionString.toCharArray();
			this.candidateSolutionIntArray = new int[candidateSolutionCharArray.length];
			
			for(int j = 0; j < candidateSolutionCharArray.length; j++) {
					this.candidateSolutionIntArray[j] = Character.getNumericValue(candidateSolutionCharArray[j]);
			}
	}
}
