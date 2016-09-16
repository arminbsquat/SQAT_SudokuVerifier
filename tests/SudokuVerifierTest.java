import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891


	
	@Test
	public void test_convertToIntArray() {
		// do this better
		SudokuVerifier sV = new SudokuVerifier(); 
		String candidateSolutionString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		sV.convertToIntArray(candidateSolutionString);
		assertEquals(sV.candidateSolutionIntArray[0], Integer.parseInt("4"));
	}
	
	@Test
	public void test_allNumbersPositive() {
		SudokuVerifier sV = new SudokuVerifier(); 
		String candidateSolutionString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(sV.allNumbersPositive(candidateSolutionString), true);
	}
	
	@Test 
	public void test_noReplicaInEveryRow() {
		SudokuVerifier sV = new SudokuVerifier(); 
		String candidateSolutionString = "117369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertThat(sV.verify(candidateSolutionString), anyOf(is(-1), is(-3)));
	}
	
	@Test
	public void test_noReplicaInSingleRow() {
		
	}
	
	@Test
	public void test_noReplicaInEveryColumn() {
		SudokuVerifier sV = new SudokuVerifier(); 
		String candidateSolutionString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertThat(sV.verify(candidateSolutionString), anyOf(is(-1), is(-3), is(-4)));
	}
	
	
	@Test
	public void testVerify() {
		fail("Not yet implemented");
	}

}
