package aufgabe3;

import org.junit.Test;

public class VektorTests {
	
	@Test(expected=VectorLengthException.class)
	public void lengthTest() throws VectorLengthException {
		int[] a = {2,  3, 4};
		int[] b = {7, 6, 5, 4, 3};
		VektorShit.addVektoren(a, b);
	}
}
