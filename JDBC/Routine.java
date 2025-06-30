import java.sql.*;
import java.util.Scanner;

public class Routine {

    static final String URL = "jdbc:mysql://localhost:3306/morning_routine";
    static final String ROOT = "root";
    static final String PASS = "jian";
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection(URL, ROOT, PASS);
            if (con != null){
                System.out.println();
                System.out.println("Connected to the Database!");
                insertTask(con);
                viewList(con);
                updateList(con);
                System.out.println("*****Updating List...Update Complete!*****");
                viewList(con);
            }
        } catch(SQLException e){
            System.out.println("Cannot connect to the Database");
            e.printStackTrace();
        }
    }

    public static void insertTask(Connection con){
        Scanner sc = new Scanner(System.in);
        int i;
        String step;
        String sql = "INSERT INTO morning_routine (Task) VALUES (?)";

        try (PreparedStatement stat = con.prepareStatement(sql)){
            System.out.println();
            System.out.println("=== My Morning Routine ===");
            System.out.println("Enter your 5-step morning routine");
            for (i = 0; i < 5; i++){
                System.out.print("Step "+(i+1)+": ");
                step = sc.nextLine();
                stat.setString(1, step);

                stat.executeUpdate();
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        sc.close();
    }

    public static void viewList(Connection con){
        String sql = "SELECT `Step Number`, `Task` FROM morning_routine";
        int step;
        String task;

        try{
            PreparedStatement stat = con.prepareStatement(sql);
            ResultSet res = stat.executeQuery();

            System.out.println();
            System.out.println("=== MY 5-STEP MORNING ROUTINE ===");
            while (res.next()){
                step = res.getInt("Step Number");
                task = res.getString("Task");
                System.out.println("Step " +step+ ": " +task);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void updateList(Connection con){
        int delId = 5;
        String newTask = "mag overthink kung tama ba 'tong pinasok ko";
        String sqlUp = "UPDATE morning_routine SET Task = ? WHERE `Step Number` = ?";
        String sqlDel = "DElETE FROM morning_routine WHERE `Step Number` = ?";
        
        try(PreparedStatement upTask = con.prepareStatement(sqlUp);
        PreparedStatement delTask = con.prepareStatement(sqlDel);){
            upTask.setString(1, newTask);
            upTask.setInt(2, 4);
            upTask.executeUpdate();

            delTask.setInt(1, delId);
            delTask.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}