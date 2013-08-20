package aufgabe1;

import org.junit.Test;

public class VektorTests {

	@Test(expected = VectorOverflowException.class)
	public void lengthTest() throws VectorOverflowException {
		int[] a = { -2, 3, 4, 2, 2 };
		int[] b = { Integer.MIN_VALUE, 6, 5, 4, Integer.MAX_VALUE };
		try {
			VektorArithmetik.zeigeVektor(VektorArithmetik.addVektoren(a, b));
		} catch (VectorLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
