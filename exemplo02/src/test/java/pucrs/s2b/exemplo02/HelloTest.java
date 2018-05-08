package pucrs.s2b.exemplo02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class HelloTest {

	@Test	
	@Parameters({"20, 30, 50", 
                  "0, 0, 0" })
	public void testSomarP(int a, int b, int r) {
		int expected = r;
		int actual = Hello.somar(a, b);
		assertEquals(expected, actual);	
	}
	
}








