import java.util.Scanner;

public class ProgMP4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num > 0){
            System.out.print("Positive number");
        }
        System.out.println();
            
        sc.close();
    }
}
