
public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	
	public int verify(String candidateSolution) {
		this.convertToIntArray(candidateSolution);
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	public boolean allNumbersPositive() {
		for(int i = 0; i < candidateSolutionIntArray.length; i++) {
			candidateSolutionIntArray[i] > 0;
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
