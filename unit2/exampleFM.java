// final method example //
class fruit {
    final void apple() {
        System.out.println("the apple is fruit ");
    }
}

class vegetable extends fruit {
    final void apple() {
        System.out.println("");
    }
}

public class exampleFM {
    public static void main(String[] args) {
        vegetable V = new vegetable();
        V.apple();
    }
}
