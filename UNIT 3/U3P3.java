public class U3P3 {
    public static void main(String[] args) {
        try {
            System.out.println("Tony's opening Database");
            int data = 25 / 5;
            System.out.println("Data calculation " + data);

        } catch (Exception e) {
            System.out.println("Error occured " + e.getMessage());

        } finally {
            System.out.println("Finally Block : Closing Tony's Database Connection guaranteed! ");
        }
    }

}
