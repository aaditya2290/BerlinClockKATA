package main;

import java.util.Arrays;

public class BerlinClock {
	
	public String[] getBerlinTime(String time)
	{
		int[] timeParts=Arrays.asList(time.split(":")).stream().mapToInt(Integer::parseInt).toArray();
		return new String[]{
				getSeconds(timeParts[2]),getTopHours(timeParts[0]),getBottomHours(timeParts[0]),getTopMinutes(timeParts[1]),getBottomMinutes(timeParts[1])};
		
	}
	
	public String getSeconds(int seconds)
	{
		if (seconds%2==0)
		return "Y";
		else
		return "O";	
	}
	
	public String getTopHours(int seconds)
	{
		return "O";
	}
	
	public String getBottomHours(int seconds)
	{
		return "O";
	}
	
	public String getTopMinutes(int seconds)
	{
		return "O";
	}
	
	public String getBottomMinutes(int seconds)
	{
		return "O";
	}
	
}
