import java.sql.*;
import java.util.*;

class Pdelete {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javadb",
                    "root",
                    "");

            String sql = "DELETE FROM stud WHERE grno=?";
            PreparedStatement pstmt = cn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            int grno = 0;

            System.out.println("Enter Gr no. to delete");
            grno = sc.nextInt();

            pstmt.setInt(1, grno);

            try {
                int x = pstmt.executeUpdate();
                System.out.println("No of deleted :" + x);
            } catch (Exception e) {
                System.out.println("Exception :" + e);
            }

            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}