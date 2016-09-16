
public class SudokuVerifier {
	public int[] candidateSolutionIntArray;
	String candidateSolution;
	public int verify(String candidateSolution) {
		this.convertToIntArray(candidateSolution);
		
		// test R1: all numbers are positive
		if(!(this.allNumbersPositive())) {
			return -1;
		} 
		
		return 0;
	}
	
	public boolean allNumbersPositive() {
		while()
	}
	
	public void convertToIntArray(String candidateSolutionString) {
			char[] candidateSolutionCharArray = candidateSolutionString.toCharArray();
			this.candidateSolutionIntArray = new int[candidateSolutionCharArray.length];
			
			for(int i = 0; i < candidateSolutionCharArray.length; i++) {
				this.candidateSolutionIntArray[i] = Character.getNumericValue(candidateSolutionCharArray[i]);
			}
	}
}
