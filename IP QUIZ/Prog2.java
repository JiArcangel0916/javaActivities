import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double PI = 3.1416;
        double area, r;

        System.out.print("\nEnter the radius of the circle: ");
        r = sc.nextDouble();
        area = PI * r * r;

        System.out.println("\nThe area of the circle with a radius of " + r + " is " + area);
        System.out.println();

        sc.close();
    }
}
