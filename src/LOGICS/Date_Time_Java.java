package LOGICS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time_Java {
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy HH:mm:ss");
		String dateTime =sdf.format(d);
		System.out.println(dateTime);
	}

}
