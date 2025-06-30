import java.util.Scanner;

public class Prog1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, prod;

        System.out.println("\nInput three numbers:");
        System.out.print("\tInput first number: ");
        num1 = scanner.nextDouble();
        System.out.print("\tInput second number: ");
        num2 = scanner.nextDouble();
        System.out.print("\tInput third number: ");
        num3 = scanner.nextDouble();

        prod =  num1 * num2 * num3;

        System.out.println("\nThe product of " + num1 + " " + num2 + " and " + num3 + " is " + prod);
        System.out.println();

        scanner.close();

    }
}