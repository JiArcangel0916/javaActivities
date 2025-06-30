import java.io.*;

public class Operations {
    public static void main(String[] args) {
        String fileName = "Arcangel.txt";
        String fileContent = "Arcangel, Albrecht Zildjian A. BSCS 1-3 at Pamantasan ng Lungsod ng Maynila"; 

        //Writing a File
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            byte[] bytes = fileContent.getBytes();
            fos.write(bytes);
            System.out.println("Successfully created \""+ fileName +"\"\n");
        } catch(IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }

        //Reading a File
        try(FileInputStream fis = new FileInputStream(fileName)){
            int character;
            System.out.println("Content of "+fileName+": ");
            while ((character = fis.read()) != -1){
                System.out.print((char) character);
            }
        } catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        //Writing to a File
        try(FileWriter writer = new FileWriter(fileName, true)){
            writer.write("\n\nTHIS IS A NEW TEXT ADDED TO THE FILE");
            writer.close();
            System.out.println("\n\nSuccessfully writtent to the file!\n");
        } catch(IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }

        //Reading a File
        try(FileInputStream fis = new FileInputStream(fileName)){
            int character;
            System.out.println("Content of "+fileName+": ");
            while ((character = fis.read()) != -1){
                    System.out.print((char) character);
                }
        } catch(IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    } 
}
