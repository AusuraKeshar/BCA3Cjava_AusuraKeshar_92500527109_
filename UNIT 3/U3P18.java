/*
8 Write a java program to use Gregorian calendar to display calendar information
*/

import java.util.GregorianCalendar;
import java.util.Calendar;

public class U3P18 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Leap Year: " + cal.isLeapYear(cal.get(Calendar.YEAR)));
        System.out.println("First Day of Week: " + cal.getFirstDayOfWeek());
        System.out.println("Weeks in Current Year: " + cal.getWeeksInWeekYear());
    }
}
