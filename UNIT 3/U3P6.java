import java.io.*;
public class U3P6 {
    static void readfile() throws IOException
    {
        FileReader file = new FileReader("tony.txt");
       BufferedReader br = new BufferedReader(file); 
        System.out.println(br.readLine());
    }
    public static void main(String[] args) {
        try
        {
            readfile();
        }
        catch(IOException e)
        {
          System.out.println("Caller handled File error for Tony: "+e.getMessage());
        }
    }
}
