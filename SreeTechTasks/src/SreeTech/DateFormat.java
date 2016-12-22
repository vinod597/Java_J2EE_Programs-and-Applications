package SreeTech;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println("Today is : " + today);
		
		SimpleDateFormat date_format = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss a");
		String date = date_format.format(today);
		System.out.println("Formated date is:" +date);
		
		date_format.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		String IST =date_format.format(today);
		System.out.println("Date in indian time:  " +IST);
		
		date_format.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		String MST = date_format.format(today);
		System.out.println("American time is:  "+MST);
		

	}

}
