
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
			ArrayList<String> localCandidateSolutionIntList = new;
			
			for(int j = 0; j < candidateSolutionCharArray.length; j++) {
				if(candidateSolutionCharArray[j] == '-') {
					// add - and number together to get a single number
					localCandidateSolutionIntArray[j] = Character.getNumericValue(candidateSolutionCharArray[j] + candidateSolutionCharArray[j+1]);
					j++;
				} else {
					localCandidateSolutionIntArray[j] = Character.getNumericValue(candidateSolutionCharArray[j]);
				}
				
			}
	}
}
