import java.io.*;

public class OutputStream {
    public static void main(String[] args) {
        String name = "Albrecht Zildjian A. Arcangel";
        try{
            FileOutputStream file = new FileOutputStream("MyName.txt");

            byte[] dataBytes = name.getBytes();
            file.write(dataBytes);
            file.close();
            System.out.println("File created successfully!");
        }
        catch(IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
