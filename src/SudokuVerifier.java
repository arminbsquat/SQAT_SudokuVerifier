
public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	String candidateSolutionString;
	
	public int verify(String candidateSolution) {
		this.candidateSolutionString = candidateSolution;
		this.convertToIntArray(candidateSolution);
		
		// test R1: all numbers are positive
		if(!(this.allNumbersPositive())) {
			return -1;
		} 
		
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
			
			// add - and number together to 1 number
			for(int j = 0; j < candidateSolutionCharArray.length; j++) {
				
				
			}
			
			this.candidateSolutionIntArray = new int[candidateSolutionCharArray.length];
			
			for(int i = 0; i < candidateSolutionCharArray.length; i++) {
				this.candidateSolutionIntArray[i] = Character.getNumericValue(candidateSolutionCharArray[i]);
			}
	}
}
