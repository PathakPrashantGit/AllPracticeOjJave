package LOGICS;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
         public static void main(String[] args) {
			
        	 Calendar cal = Calendar.getInstance();
        	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        	 
        	 System.out.println(sdf.format(cal.getTime()));
        	 
        	 //some additional feature in calendar
        	 System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        	 System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        	 System.out.println(cal.get(Calendar.AM_PM));
        	 System.out.println(cal.get(Calendar.DATE));
		}
}
