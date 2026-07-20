// write a java program to make a result card .
import java.util.Scanner;

class program8 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int marks, obtainmarks, c, advanceC, JAVA, HTML, DS;
        String Name, result, grade, gr;
        float percentage, Final = 0;
        int total = 500;

        // User input
        // max marks limit is 100 in subjects
        // Gr No.
        System.out.println("Enter you GR Number : ");
        gr = scanner.nextLine();

        // Name
        System.out.println("Enter your name :");
        Name = scanner.next();

        // Marks obtained C
        System.out.println("Marks obtained in C : ");
        c = scanner.nextInt();

        if (c > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        // Marks obtained C++
        System.out.println("Marks obtained in C++ : ");
        advanceC = scanner.nextInt();

        if (advanceC > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        // Marks obtained Java
        System.out.println("Marks obtained in Java : ");
        JAVA = scanner.nextInt();

        if (JAVA > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        // Marks obtained HTML
        System.out.println("Marks obtained in HTML : ");
        HTML = scanner.nextInt();

        if (HTML > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        // Marks obtained DS
        System.out.println("Marks obtained in DS : ");
        DS = scanner.nextInt();

        if (DS > 100) {
            System.out.println("Invalid Marks");
            return;
        }

        // Total Obtained Marks
        obtainmarks = c + advanceC + JAVA + HTML + DS;
        System.out.println("Total obtained marks : " + obtainmarks);

        // Final Percentage
        Final = obtainmarks * 100 / total;
        System.out.println("Total percentage : " + Final + "%");

        Final = obtainmarks * 100 / total;
        System.out.println("Total percentage : " + Final + "%");

        // final percentage max is 100%
        if (Final > 100) {
            System.out.println("Invalid Percentage");
            return;
        }

        // Result Calculation
        if (obtainmarks >= 175) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        // Grade Calculation
        if (Final >= 90) {
            grade = "O";
        } else if (Final >= 80) {
            grade = "A+";
        } else if (Final >= 70) {
            grade = "A";
        } else if (Final >= 60) {
            grade = "B";
        } else if (Final >= 50) {
            grade = "C";
        } else if (Final >= 36) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Report Card Printing
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("|                       Report Card                         |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("| GR Number : " + gr + "                                           |");
        System.out.println("| Name      : " + Name + "                                          |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("| Subjects     |       Total Marks       |    Obtain Marks  |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("|    C         |          100            |     " + c + "          |");
        System.out.println("|    advanceC  |          100            |     " + advanceC + "          |");
        System.out.println("|    JAVA      |          100            |     " + JAVA + "          |");
        System.out.println("|    HTML      |          100            |     " + HTML + "          |");
        System.out.println("|    DS        |          100            |     " + DS + "          |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("|              |          500            |     " + obtainmarks + "          |");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println(
                "| Result : " + result + " | " + "         " + grade + "             |    " + Final + "         |");
        System.out.println("|-----------------------------------------------------------|");
    }
}