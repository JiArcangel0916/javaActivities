import java.sql.*;
import java.util.Scanner;

public class Database {
    static final String URL = "jdbc:mysql://localhost:3306/grocerylist";
    static final String ROOT = "root";
    static final String PASS = "jian"; 
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection(URL, ROOT, PASS);
            if (con != null){
                System.out.println();
                System.out.println("Connected to the database");
                insertItems(con);
                readList(con);
            }
        } catch (SQLException e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }

    public static void insertItems(Connection con){
        Scanner sc = new Scanner(System.in);
        int i = 1, quan;
        char resp;
        String foodItem;
        String sql = "INSERT INTO grocerylist (`Grocery Item`, Quantity) VALUES (?, ?)";

        try (PreparedStatement stat = con.prepareStatement(sql)){
            System.out.println();
            System.out.println("=== Enter items to add in the grocery list ===");
            do{
                System.out.print("Enter food item " +(i)+":   ");
                foodItem = sc.nextLine();
                stat.setString(1, foodItem);

                System.out.print("Enter quantity:      ");
                quan = sc.nextInt();
                sc.nextLine();
                stat.setInt(2, quan);
                
                stat.executeUpdate();

                System.out.print("Enter another food item? [Y/N]: ");
                resp = sc.nextLine().charAt(0);
                resp = Character.toUpperCase(resp);
                i++;
            } while (resp == 'Y');
            System.out.println("Items added successfuly!");
        } catch(SQLException e){
            e.printStackTrace();
        }
        sc.close();
    }

    public static void readList(Connection con){
        String sql = "SELECT `id`, `Grocery Item`, `Quantity` FROM grocerylist";
        int id, quan;
        String item;
        try{
            PreparedStatement stat = con.prepareStatement(sql);
            ResultSet res = stat.executeQuery();

            while (res.next()){
                id = res.getInt("id");
                item = res.getString("Grocery Item");
                quan = res.getInt("Quantity");
                System.out.println(id+". " +item+ " - " +quan);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
