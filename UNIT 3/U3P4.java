public class U3P4 {
    public static void main(String[] args) {
        try{
            int[] Tonyscores  = new int[3];
            Tonyscores [0] = 95;
            Tonyscores [1] = 90;
            Tonyscores [2] = 85;

            Tonyscores [5] = 100;
        }

        catch(ArithmeticException e){
           System.out.println("Arithmetic Error occured");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index error");
        }
        catch(Exception e){
            System.out.println("General Handled Error"+e.getMessage());

        }
    }
    
}
