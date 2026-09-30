/*
11. Write a java program to demonstrate encapsulation
*/

public class U2P11 {
    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        U2P11 obj = new U2P11();
        obj.setRollNo(101);
        obj.setName("Keshar");

        System.out.println("Roll Number: " + obj.getRollNo());
        System.out.println("Name: " + obj.getName());
    }
}
