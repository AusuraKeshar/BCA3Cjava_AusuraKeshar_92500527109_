class MyExce extends Exception {
    public MyExce(String Message) {
        super(Message);
    }
}

class Exceptionchaining {

    void method1() throws MyExce {
        throw new MyExce("Exception from method 1");
    }

    void method2() throws Exception {
        try {
            method1();
        } catch (Exception e) {
            throw new Exception("Exception from method 2", e);
        }
    }

    void method3() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Caught Exception in method 3: " + e.getMessage());

            if (e.getCause() != null) {
                System.out.println("Chained Exception: " + e.getCause().getMessage());
            }
        }
    }
}

public class U3P10 {
    public static void main(String Args[]) {
        Exceptionchaining ec = new Exceptionchaining();
        ec.method3();
    }
}