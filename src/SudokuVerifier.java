
public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	
	public int verify(String candidateSolution) {
		this.convertToIntArray(candidateSolution);
		
		// test R1: all numbers are positive
		if(this.allNumbersPositive()) {
			return 0;
		} else {
			return -1;
		}
		// returns 0 if the candidate solution is correct
		return 0;
		
	
	}
	
	public boolean allNumbersPositive() {
		
		
		for(int i = 0; i < candidateSolutionIntArray.length; i++) {
			if(candidateSolutionIntArray[i] < 0) {
				return false;
			} 
		}
		
		return true;
	}
	
	public void convertToIntArray(String candidateSolutionString) {
			char[] candidateSolutionCharArray = candidateSolutionString.toCharArray();
			this.candidateSolutionIntArray = new int[candidateSolutionCharArray.length];
			
			for(int i = 0; i < candidateSolutionCharArray.length; i++) {
				this.candidateSolutionIntArray[i] = Character.getNumericValue(candidateSolutionCharArray[i]);
			}
	}
}
