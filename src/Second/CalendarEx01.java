package Second;

import java.util.*;

public class CalendarEx01 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1;
        int day = today.get(Calendar.DATE);
        String[] dayList = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String dayOfWeek = dayList[today.get(Calendar.DAY_OF_WEEK)];
//        System.out.println(today.get(Calendar.WEEK_OF_MONTH));
//        System.out.println(today.get(Calendar.WEEK_OF_YEAR));
//        System.out.println(today.get(Calendar.DAY_OF_MONTH));
//        System.out.println(today.get(Calendar.DAY_OF_YEAR));
        System.out.println(year + " " + month + " " + day + " " + dayOfWeek);

        int AM_PM_INT = today.get(Calendar.AM_PM);
        String AM_PM = " ";
        if (AM_PM_INT == 1) {
            AM_PM = "PM";
        }
        if (AM_PM_INT == 0) {
            AM_PM = "AM";
        }
        int hour = today.get(Calendar.HOUR);
        int hourOfDay = today.get(Calendar.HOUR_OF_DAY);
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);
        System.out.println(AM_PM + " " + hourOfDay + " " + minute + " " + second);
        System.out.println(AM_PM + " " + hour + " " + minute + " " + second);


        Calendar Date1 = Calendar.getInstance();
        Date1.set(2020, Calendar.AUGUST, 15, 22,22,22);

        int year1 = Date1.get(Calendar.YEAR);
        int month1 = Date1.get(Calendar.MONTH) + 1;
        int day1 = Date1.get(Calendar.DATE);
        String[] dayList1 = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String dayOfWeek1 = dayList1[Date1.get(Calendar.DAY_OF_WEEK)];
//        System.out.println(today.get(Calendar.WEEK_OF_MONTH));
//        System.out.println(today.get(Calendar.WEEK_OF_YEAR));
//        System.out.println(today.get(Calendar.DAY_OF_MONTH));
//        System.out.println(today.get(Calendar.DAY_OF_YEAR));
        System.out.println(year1 + " " + month1 + " " + day1 + " " + dayOfWeek1);

        int AM_PM_INT1 = Date1.get(Calendar.AM_PM);
        String AM_PM1 = " ";
        if (AM_PM_INT1 == 1) {
            AM_PM1 = "PM";
        }
        if (AM_PM_INT1 == 0) {
            AM_PM1 = "AM";
        }
        int hour1 = Date1.get(Calendar.HOUR);
        int hourOfDay1 = Date1.get(Calendar.HOUR_OF_DAY);
        int minute1 = Date1.get(Calendar.MINUTE);
        int second1 = Date1.get(Calendar.SECOND);
        System.out.println(AM_PM1 + " " + hourOfDay1 + " " + minute1 + " " + second1);
        System.out.println(AM_PM1 + " " + hour1 + " " + minute1 + " " + second1);
    }
}