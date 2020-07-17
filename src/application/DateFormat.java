package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateFormat {
	
	public static void main(String [] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date x1 = new Date();
		
		System.out.println("x1 : " + x1);
		System.out.println("sdf1 : " + sdf1.format(x1));
		System.out.println("sdf2 : " + sdf2.format(x1));
		System.out.println("sdf3 : " + sdf3.format(x1));
		
		
		
		Date y1 = sdf1.parse("16/07/2020");
		Date y2 = sdf2.parse("16/07/2020 10:36:18");

		
		System.out.println("x1 " + x1);
		System.out.println("y1 " + y1);
		System.out.println("y2 " + y2);
		 
		System.out.println("-----------------------");
		System.out.println("x1 " + sdf2.format(x1));
		System.out.println("y1 " + sdf2.format(y1));
		System.out.println("y2 " + sdf2.format(y2));
		System.out.println("-----------------------");
		System.out.println("x1 " + sdf3.format(x1));
		System.out.println("y1 " + sdf3.format(y1));
		System.out.println("y2 " + sdf3.format(y2));
		
		System.out.println();
		Date x2 = new Date();
		System.out.println("x2: " +sdf2.format(x2));
		Calendar cal = Calendar.getInstance();
		cal.setTime(x2);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		x2 = cal.getTime();
		System.out.println("x2 pos: " +sdf2.format(x2));
				
		
	}

}
