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

class Puppy extends Dog{
    void weep(){
        System.out.println("the puppy weeps");
    }
}


public class multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
    
}