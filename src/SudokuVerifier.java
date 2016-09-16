import java.util.ArrayList;

public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	String candidateSolutionString;
	int offset = 0;
	
	public int verify(String candidateSolution) {
		this.candidateSolutionString = candidateSolution;
		
		// test R1: all numbers are positive
		if(!(this.allNumbersPositive())) {
			return -1;
		} 
		this.convertToIntArray(candidateSolution); // only convert if every number is positive
		return 0;
	}
	
	public void noReplicaInEveryRow() {
		
	
	}
	
	public void noReplicaInSingleRow() {
		int[] singleRow = new int[9]; 
		
		// build a row to test
		for(int i = 0; i < 9; i++) {
			singleRow[i] = candidateSolutionIntArray[offset + i];
		}
		
		//test row for duplicates
		
	}
	
	public boolean allNumbersPositive() {
		char[] candidateSolutionCharArray = this.candidateSolutionString.toCharArray();
		for(int i = 0; i < candidateSolutionCharArray.length; i++) {
			if(candidateSolutionCharArray[i] == '-') {
				return false;
			}
		}
		return true;
	}
	
	public void convertToIntArray(String candidateSolutionString) {
			char[] candidateSolutionCharArray = candidateSolutionString.toCharArray();
			this.candidateSolutionIntArray = new int[candidateSolutionCharArray.length];
			
			for(int j = 0; j < candidateSolutionCharArray.length; j++) {
				if(candidateSolutionCharArray[j] == '-') {
					this.candidateSolutionIntArray[j] = Character.getNumericValue(candidateSolutionCharArray[j]);
				}
			}
	}
}
