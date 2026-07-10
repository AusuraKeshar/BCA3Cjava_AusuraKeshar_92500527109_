/*Write a Java program to print a name 10 times using a do-while loop.*/
public class Program6g{
    public static void main(String[] args) {

        String name = "Keshar";
        int i = 1;

        do {
            System.out.println(i + ". " + name);
            i++;
        } while (i <= 10);

    }
}