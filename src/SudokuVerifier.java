
public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	
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
			this.candidateSolutionIntArray = new int[candidateSolutionString.length()];
			
			for(int j = 0; j < candidateSolutionString.length() )
			
			for(int i = 0; i < candidateSolutionString.length(); i++ ) {
				this.candidateSolutionIntArray[i] = Integer.parseInt(candidateSolutionString.substring(i, i+1));
			}		
	}
}
