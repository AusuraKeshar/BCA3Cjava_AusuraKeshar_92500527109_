class InvalidStudentMarksException extends Exception {
    public InvalidStudentMarksException(String message) {
        super(message);
    }
}

public class U3P7 {
    static void validateTonyMarks(double Marks) throws InvalidStudentMarksException {
        if (Marks < 0.0 || Marks > 100.0) {
            throw new InvalidStudentMarksException("Marks must be between 0 and 100! Input was: " + Marks);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Submitting Exam Score for Tony...");
            validateTonyMarks(105.5);

        } catch (InvalidStudentMarksException e) {
            System.out.println("Custom Exception Caught : " + e.getMessage());

        }
    }
}
