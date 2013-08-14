package aufgabe4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinomTest  {
	@Test(expected=BinomInvArg.class)
	public void argTest() throws BinomInvArg {
		Binom.calcBinom(3, 4);
		Binom.calcBinom(-3, 4);
		Binom.calcBinom(3, -4);
	}
	
	@Test
	public void miauTest() {
		try {
			assertEquals(Binom.calcBinom(5,4), Binom.calcBinom(5, 1));
		} catch (BinomInvArg e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
