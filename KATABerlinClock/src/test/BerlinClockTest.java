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

	@Test
	public void testBerlinClockTopHours()
	{
		assertEquals("RRRR",berlinClock.getTopHours(22));
		assertEquals("ROOO",berlinClock.getTopHours(7));
	}

	@Test
	public void testBerlinClockBottomHours()
	{
		assertEquals("RRRR",berlinClock.getBottomHours(24));
		assertEquals("RROO",berlinClock.getBottomHours(12));
	}

	@Test
	public void testBerlinClockTopMinutes()
	{
		assertEquals("YYRYYRYYOOO",berlinClock.getTopMinutes(43));
		assertEquals("YYROOOOOOOO",berlinClock.getTopMinutes(17));
	}

	@Test
	public void testBerlinClockBottomMinutes()
	{
		assertEquals("YYYO",berlinClock.getBottomMinutes(43));
		assertEquals("YYOO",berlinClock.getBottomMinutes(17));
	}

	@Test
	public void testBerlinTime()
	{
		String digitalTime="20:48:10";
		assertEquals(5,berlinClock.getBerlinTime(digitalTime).length);
		assertArrayEquals(new String[]{"Y","RRRR","OOOO","YYRYYRYYROO","YYYO"},berlinClock.getBerlinTime(digitalTime));
	}
}
