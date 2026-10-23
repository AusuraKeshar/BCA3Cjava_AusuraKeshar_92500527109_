import java.sql.*;
import java.util.*;

class Pupdate {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javadb",
                    "root",
                    "");

            String sql = "UPDATE stud SET name=? WHERE grno=?";
            PreparedStatement pstmt = cn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            int grno = 0;
            String name = "";

            System.out.println("Enter Gr no. to update");
            grno = sc.nextInt();

            System.out.println("Enter New Name");
            name = sc.next();

            pstmt.setString(1, name);
            pstmt.setInt(2, grno);

            try {
                int x = pstmt.executeUpdate();
                System.out.println("No of rows updated :" + x);
            } catch (Exception e) {
                System.out.println("Exception :" + e);
            }

            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}