import java.util.Scanner;

public class ProgMP5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, n5, sum, prod, diff, ave;

        System.out.println("Input 5 numbes: ");
        System.out.print("\tNumber 1 => ");
        n1 = sc.nextDouble();
        System.out.print("\tNumber 2 => ");
        n2 = sc.nextDouble();
        System.out.print("\tNumber 3 => ");
        n3 = sc.nextDouble();
        System.out.print("\tNumber 4 => ");
        n4 = sc.nextDouble();
        System.out.print("\tNumber 5 => ");
        n5 = sc.nextDouble();

        sum = n1 + n2 + n3 + n4 + n5;
        prod = n1 * n2 * n3 * n4 * n5;
        diff = n1 - n2 - n3 - n4 - n5;
        ave = sum / 5.0;

        System.out.println("Sum:        " + sum);
        System.out.println("Product:    " + prod);
        System.out.println("Difference: " + diff);
        System.out.println("Average:    " + ave);
        System.out.println();

        sc.close();

    }
}
