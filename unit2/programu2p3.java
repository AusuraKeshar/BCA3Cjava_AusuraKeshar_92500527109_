class Animal{
    void eat(){
        System.out.println("the animal eats. ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("the dog barks woof woof ");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("the cat does meow meow");
    }
}
public class programu2p3 {
    public static void main(String[] args) {
        
    
    Dog D = new Dog();
    Cat C = new Cat();
    
    D.eat();
    D.bark();
    
    C.eat();
    C.meow();
    }
}
