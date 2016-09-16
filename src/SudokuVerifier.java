
public class SudokuVerifier {
	int[] candidateSolutionIntArray;
	
	public int verify(String candidateSolution) {
		this.convertToIntArray(candidateSolution);
		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	
	public boolean allNumbersPositive() {

		return true;
	}
	
	public void convertToIntArray(String candidateSolutionString) {
			int[] localCandidateSolutionIntArray = new int[candidateSolutionString.length()];
			
	}
}
