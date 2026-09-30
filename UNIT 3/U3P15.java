/*
5 Write a java program to display date in different format
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class U3P15 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        SimpleDateFormat f4 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("Format 1: " + f1.format(date));
        System.out.println("Format 2: " + f2.format(date));
        System.out.println("Format 3: " + f3.format(date));
        System.out.println("Format 4: " + f4.format(date));
    }
}
