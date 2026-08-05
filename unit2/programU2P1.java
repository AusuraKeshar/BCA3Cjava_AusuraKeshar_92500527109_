//write program of inheritance//
class animal{
    String name = "animal";
    void eat(){
        System.out.println("this animal eats food ");
    }
}

class Dog extends animal{
    void bark(){
        System.out.println("the dogs barks woof woof ");
    }
}


public class programU2P1 {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.eat();
        mydog.bark();
    }
    
}
