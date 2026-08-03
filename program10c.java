/* WRITE A JAVA PROGRAM OF 1D ARRAY AND ASSIGN VALUES MANUALLY. */

class program10c
{
    public static void main(String args[])
    {
        int marks[] = new int[5];

        int i;

        marks[0] = 90;
        marks[1] = 70;
        marks[2] = 80;
        marks[3] = 95;
        marks[4] = 85;

        System.out.println("MANUALLY ASSIGNED ARRAY ELEMENTS:");

        for(i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
