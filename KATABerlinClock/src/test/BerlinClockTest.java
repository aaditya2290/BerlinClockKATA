package test;

import static org.junit.Assert.*;
import main.BerlinClock;

import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {
	
	BerlinClock berlinClock;

	@Before
	public void initializeBerlinClock()
	{
		berlinClock=new BerlinClock();
	}
	
	@Test
	public void testBerlinClockSeconds()
	{
	  assertEquals("Y",berlinClock.getSeconds(40));
	  assertEquals("O",berlinClock.getSeconds(21));
	}
}
