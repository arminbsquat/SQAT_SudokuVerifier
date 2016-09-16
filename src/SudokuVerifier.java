import java.util.ArrayList;

public class SudokuVerifier {
	public int[] candidateSolutionIntArray = new int[81];
	int offset = 0;
	
	
	/*
	 * 417369825	
	 * 632158947
	 * 958724316
	 * 825437169
	 * 791586432
	 * 346912758
	 * 289643571
	 * 573291684
	 * 164875293
	 * 
	 */
	public int verify(String candidateSolution) {
		
		// test R1: all numbers are positive
		if(!(this.allNumbersPositive(candidateSolution))) {
			return -1;
		} 
		this.convertToIntArray(candidateSolution); // only convert if every number is positive
		
		// test R3: noReplicaInRow
		if(!(this.noReplicaInEveryRow())) {
			System.out.println("-3");
			return -3;
		}
		
		//test R4: noReplicaInColumn
		if(!(this.noReplicaInEveryColumn())) {
			return -4;
		}
		
		
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
	
	private boolean noReplicaInSingleRow() {
		int[] singleRow = new int[9]; 
		
		// build a row to test
		for(int i = 0; i < 9; i++) {
			singleRow[i] = candidateSolutionIntArray[offset + i];
		}
		
		int searchForThisNumber;
		//test row for duplicates
		for(int singleRowCounter = 0; singleRowCounter < singleRow.length; singleRowCounter++) {
			int replica = 0;
			searchForThisNumber = singleRow[singleRowCounter];
			for(int j = 0; j < singleRow.length; j++ ) {
				if(singleRow[j] == searchForThisNumber) {
					replica++; 
					if(replica >= 2) {
						return false;	
					}
				}
			}
		}
		return true;
	}
	
	private boolean noReplicaInSingleColumn() {
		int[] singleColumn = new int[9]; 
		
		int p = 0;
		// build a column to test
		for(int i = 0; i < 9; i++) {
			singleColumn[i] = candidateSolutionIntArray[p];
			p = p + 9;
		}
		
		int searchForThisNumber;
		//test column for duplicates
		for(int singleColumnCounter = 0; singleColumnCounter < singleColumn.length; singleColumnCounter++) {
			int replica = 0;
			searchForThisNumber = singleColumn[singleColumnCounter];
			for(int j = 0; j < singleColumn.length; j++ ) {
				if(singleColumn[j] == searchForThisNumber) {
					replica++; 
					if(replica >= 2) {
						return false;	
					}
				}
			}
		}
		return true;
	}
	
	public boolean noReplicaInEveryColumn() {
		int successCounter = 0;
		
		while(successCounter < 9) 
		{
			if(!(this.noReplicaInSingleColumn())) {
				return false;
			} else 
			{
				successCounter++;
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
			//this.candidateSolutionIntArray = new int[candidateSolutionCharArray.length];
			
			for(int j = 0; j < candidateSolutionCharArray.length; j++) {
					this.candidateSolutionIntArray[j] = Character.getNumericValue(candidateSolutionCharArray[j]);
			}
	}
}
