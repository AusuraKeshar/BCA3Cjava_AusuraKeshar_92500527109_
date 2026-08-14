
class Vehicle{
    int speed = 120;
    Vehicle(){
        System.out.println("Vehicle Constructor Called");
    }
    void run(){
        System.out.println("Vehicle is Running ");
    }
}
class Car extends Vehicle{
    int speed = 180;
    Car(){
        super();
    }
    void display(){
        System.out.println("Car speed"+speed);
        System.out.println("Vehicle speed "+super.speed);
        super.run();
    }
}
public class exampleSUP {
    public static void main(String[] args) {
        
    Car c = new Car();
    c.display();
    }
    
}
