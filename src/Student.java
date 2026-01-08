import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        System.out.println("------Update  the Student marks----------");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Id:");
        int Id = s.nextInt();
        System.out.println("Enter Marks:");
        int Marks= s.nextInt();
        insertData(Id, Marks);
        s.close();
    }

    public static void insertData( int Id , int Marks) {

        try {
            String MySqlDriver = "com.mysql.cj.jdbc.Driver";
            String MySqlUrl = "jdbc:mysql://localhost:3306/test";
            System.out.println("Connecting to database...");

            Class.forName(MySqlDriver);
            Connection con = DriverManager.getConnection(MySqlUrl, "root", "root");
            PreparedStatement ps = con.prepareStatement("create table if not exists students (Id int ,name varchar(50), age int)");
            int count = ps.executeUpdate();

           /* PreparedStatement ps2 = con.prepareStatement(" ALTER TABLE students ADD Marks int ");
           int count2 =  ps2.executeUpdate();
            System.out.println(" colume added");*/


            PreparedStatement ps3= con.prepareStatement( "UPDATE students SET Marks = ? WHERE Id = ?");

            ps3.setInt(1,Marks);
            ps3.setInt(2,Id);
            int count4 = ps3.executeUpdate();
            System.out.println("Update the Marks");

            con.close();

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
