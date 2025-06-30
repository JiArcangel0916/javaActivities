import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, sum, diff, prod, quo;

        System.out.println("\nEnter three numbers: ");
        System.out.print("\tNumber 1: ");
        num1 = sc.nextDouble();
        System.out.print("\tNumber 2: ");
        num2 = sc.nextDouble();
        System.out.print("\tNumber 3: ");
        num3 = sc.nextDouble();

        sum = num1 + num2 + num3;
        diff = num1 - num2 - num3;
        prod = num1 * num2 * num3;
        quo = num1 / num2 / num3;

        System.out.println("\nSum:            " + sum);
        System.out.println("Difference:     " + diff);
        System.out.println("Product:        " + prod);
        System.out.println("Quotient:       " + quo);
        System.out.println();

        sc.close();
    }
}
