package main;

import java.util.Arrays;

public class BerlinClock {

	public String[] getBerlinTime(String time)
	{
		int[] timeParts=Arrays.asList(time.split(":")).stream().mapToInt(Integer::parseInt).toArray();
		return new String[]{
				getSeconds(timeParts[2]),getTopHours(timeParts[0]),getBottomHours(timeParts[0]),getTopMinutes(timeParts[1]),getBottomMinutes(timeParts[1])};

	}

	public String getSeconds(int time)
	{
		if (time%2==0)
			return "Y";
		else
			return "O";	
	}

	public String getTopHours(int time)
	{
		return getTopRowTime(4,time/5,"R");
	}

	public String getBottomHours(int time)
	{
		return "O";
	}

	public String getTopMinutes(int time)
	{
		return "O";
	}

	public String getBottomMinutes(int time)
	{
		return "O";
	}
	private String getTopRowTime(int rowLength,int time,String onValue)
	{
		String topRowTime="";
		for (int i=0;i<rowLength;i++)
			if (i<time)
			topRowTime+=onValue;
			else
			topRowTime+="O";	
		
			
		return topRowTime;
	}

}
