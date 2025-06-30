import java.io.FileReader;
import java.io.IOException;

public class InputStream{
    public static void main(String[] args){
        String filename = "asciiArt.txt";
        try{
            FileReader reader = new FileReader(filename);
            int character;
            System.out.println("Content of " +filename+":");
            while ((character = reader.read()) != -1){
                System.out.print((char)character);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}