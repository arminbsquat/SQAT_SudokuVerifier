import java.util.ArrayList;

public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	String candidateSolutionString;
	
	public int verify(String candidateSolution) {
		this.candidateSolutionString = candidateSolution;
		
		// test R1: all numbers are positive
		if(!(this.allNumbersPositive())) {
			return -1;
		} 
		this.convertToIntArray(candidateSolution); 
		return 0;
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
					this.candidateSolutionIntArray[j] = Character.getNumericValue(candidateSolutionCharArray[j] + candidateSolutionCharArray[j+1]);
					j++;
				} else {
					this.candidateSolutionIntArray[j] = Character.getNumericValue(candidateSolutionCharArray[j]);
				}
			}
	}
}
