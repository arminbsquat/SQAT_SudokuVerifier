
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
		int[] results = new int[candidateSolutionString.getBytes().length];
		
		for (int i = 0; i < candidateSolutionString.getBytes().length; i++) {
		    try {
		        results[i] = Integer.parseInt(items[i]);
		    } catch (NumberFormatException nfe) {
		        //NOTE: write something here if you need to recover from formatting errors
		    };
		}
	}
}
