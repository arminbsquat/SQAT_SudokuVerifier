
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
			char[] candidateSolutionCharArray = candidateSolutionString.toCharArray();
			this.candidateSolutionIntArray = new int[candidateSolutionString.length()];
			
			for(int i = 0; i < candidateSolutionCharArray.length)
	
	}
}
