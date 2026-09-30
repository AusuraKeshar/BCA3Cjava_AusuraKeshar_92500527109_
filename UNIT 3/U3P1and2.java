import javax.naming.spi.DirStateFactory.Result;

public class U3P1and2{
    public static void main(String[] args) {
        String studentname ="Tony";
        System.out.println(studentname+" started math calculation");
        try{
            int totalmarks = 100;
            int subject = 0;
            int result = totalmarks/subject;
            System.out.println("result"+result);
        }
        catch(Exception e){
            System.out.println("Exception caught division by Zero is not Allowed "+studentname+" !");
            System.out.println("Exception error"+e.getMessage());


        }
        System.out.println(studentname+"s program continues execution smoothly");

    }
    
}
