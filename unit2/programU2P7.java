//write a program of Abstract class //
abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzzzzzz");
    }
}

class Dog extends Animal {
    public void animalSound(){
 System.out.println("The dog says : woof.... woof ");
}
}

class programU2P7 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.animalSound();
        d.sleep();
    }
}