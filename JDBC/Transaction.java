import java.sql.*;
import java.util.ArrayList;

public class Transaction {
    public static final String URL = "jdbc:mysql://localhost:3306/transaction";
    public static final String ROOT = "root";
    public static final String PASS = "jian";
    public static void main(String[] args){
        ArrayList<String> persons = new ArrayList<String>();
        ArrayList<Integer> balances = new ArrayList<Integer>();

        try{
            Connection con = DriverManager.getConnection(URL, ROOT, PASS);
            PreparedStatement stat = con.prepareStatement("SELECT * FROM transaction");
            ResultSet res = stat.executeQuery();

            while (res.next()){
                persons.add(res.getString("Person"));
                balances.add(res.getInt("Chip Balance"));
            }
            if (con != null){
                System.out.println();
                System.out.println("Connected to the Database");
                System.out.println();
                viewBalance(con);
                transact(con, persons, balances);
                System.out.println();
                System.out.println("Transferring 500 chips from Person A to Person B...Complete!");
                System.out.println();
                viewBalance(con);
            }
        } catch (SQLException e){
            System.out.println("Cannot connect to the Database");
            e.printStackTrace();
        }
    }

    public static void viewBalance(Connection con){
        String sql = "SELECT `Person`, `Chip Balance` FROM transaction";
        String person;
        int chipBal;
        try{
            PreparedStatement stat = con.prepareStatement(sql);
            ResultSet res = stat.executeQuery();

            System.out.println("Person           Chip Balance");
            while (res.next()){
                person = res.getString("Person");
                chipBal = res.getInt("Chip Balance");
                System.out.println(person+"         "+chipBal); 
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void transact(Connection con, ArrayList<String> persons, ArrayList<Integer> balances){
        int deducted = (balances.get(0) - 500);
        String deductedPerson = persons.get(0);
        String deducBal = "UPDATE transaction SET `Chip Balance` = ? WHERE `Person` = ?";

        int added = (balances.get(1) + 500);
        String addedPerson = persons.get(1);
        String addBal = "UPDATE transaction SET `Chip Balance` = ? WHERE `Person` = ?";

        try(PreparedStatement deduc = con.prepareStatement(deducBal); PreparedStatement add = con.prepareStatement(addBal);){
            deduc.setInt(1, deducted);
            deduc.setString(2, deductedPerson);
            deduc.executeUpdate();

            add.setInt(1, added);
            add.setString(2, addedPerson);
            add.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}