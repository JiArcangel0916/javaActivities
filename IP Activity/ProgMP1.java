import java.util.Scanner;

public class ProgMP1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int entry;

        System.out.print("Enter a year entry number [1-4]: ");
        entry = sc.nextInt();

        if (entry == 1){
            System.out.println("You are a Freshman");
        }
        else if (entry == 2){
            System.out.println("You are a Sophomore");
        }
        else if (entry == 3){
            System.out.println("You are a Junior");
        }
        else if (entry == 4){
            System.out.println("You are a Senior");
        }
        else{
            System.out.println("Invalid Input!!!");
        }

        System.out.println();
        sc.close();
    }
}