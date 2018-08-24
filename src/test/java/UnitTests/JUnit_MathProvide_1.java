package UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import junitDemo.MathProviderDemo.MathProvider;
import util.Log;

public class JUnit_MathProvide_1 {
	MathProvider provider;
public   JUnit_MathProvide_1()
	{
	provider=new MathProvider();
	}

	@Test
	public void add()
	{
		Log.info("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber));
		Log.info("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	@Test
	public void subtract()
	{
		Log.info("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 60;
		int secondNumber = 20;
		assertEquals(firstNumber - secondNumber, provider.Substract(firstNumber, secondNumber));
		Log.info("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
