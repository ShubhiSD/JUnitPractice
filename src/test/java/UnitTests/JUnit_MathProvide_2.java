package UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import junitDemo.MathProviderDemo.MathProvider;
import util.Log;

public class JUnit_MathProvide_2 {
	MathProvider provider;
public   JUnit_MathProvide_2()
	{
	provider=new MathProvider();
	}

	@Test
	public void multiply()
	{
		Log.info("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		Log.info("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
}