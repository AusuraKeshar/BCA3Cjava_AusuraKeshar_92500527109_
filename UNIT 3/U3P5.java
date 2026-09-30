public class U3P5 {
    static void checkVotingEligilibility(int age, String studentname) {
        if (age < 18) {
            throw new ArithmeticException(studentname + "is not eligible for voting (age mus be 18+)");

        } else {
            System.out.println(studentname + " is eligiblle for voting");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Check Registration for Tony");
            checkVotingEligilibility(16, "Tony");
        } catch (ArithmeticException e) {
            System.out.println("Caught Explicit Exception " + e.getMessage());
        }
    }

}
