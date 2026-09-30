/*
5. Write a java program to use Hierarchical inheritance
*/

class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class U2P5 extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        U2P5 c = new U2P5();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
