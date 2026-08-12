// wajp for method overriding//
class abc{
    int x;
    abc(int x)
    {
    this.x=x;
}
    void display()
    {
        System.out.println("the output 1st is"+10);
    }
}
class xyz extends abc{
    int y;
    xyz(int x,int y)
    {
        super(x);
        this.y=y;
    }
    void display(){
        System.out.println("the sum is "+10+20);
        super.display();
    }
}
class exampleOR{
    public static void main(String[] args) {
        xyz x1 = new xyz(0, 0);
        x1.display();
     
    }
}
