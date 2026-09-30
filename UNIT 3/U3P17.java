/*
7 Write a java program to add, subtract a days/month into current date and time
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class U3P17 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current Date and Time: " + sdf.format(cal.getTime()));

        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After Adding 5 Days: " + sdf.format(cal.getTime()));

        cal.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("After Subtracting 10 Days: " + sdf.format(cal.getTime()));

        cal.add(Calendar.MONTH, 1);
        System.out.println("After Adding 1 Month: " + sdf.format(cal.getTime()));

        cal.add(Calendar.MONTH, -2);
        System.out.println("After Subtracting 2 Months: " + sdf.format(cal.getTime()));
    }
}
