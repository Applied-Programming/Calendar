package calendar.test;

import java.util.*;

public class CalendarTest
{
	public static void main(String [] args)
	{

		GregorianCalendar gc = new GregorianCalendar();
		int today = gc.get(Calendar.DAY_OF_MONTH);
		int month = gc.get(Calendar.MONTH);

		// set gc to start date of the month
		gc.set(Calendar.DAY_OF_MONTH,1);

		int weekday = gc.get(Calendar.DAY_OF_WEEK);

		// print heading
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		System.out.println("   ");

		do
		{
			// print day
			int day = gc.get(Calendar.DAY_OF_MONTH);
			if (day < 10) System.out.print(" ");
			System.out.print(day);

			// mark current day with *
			if (day == today)
				System.out.print("* ");
			else
				System.out.print(" ");

			// start a new line after every Saturday
			if(weekday == Calendar.SATURDAY)
				System.out.println();

			// advance gc to the next day
			gc.add(Calendar.DAY_OF_MONTH,1);
			weekday = gc.get(Calendar.DAY_OF_WEEK);
		}
		while(gc.get(Calendar.MONTH) == month);
		// the loop exits when gc is day 1 of the next month

		// print final end of line if necessary
		if(weekday != Calendar.SUNDAY)
			System.out.println();
	}
}
