import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double base, height, area;
        System.out.print("\nEnter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();

        area = (base * height) / 2;

        System.out.print("\nThe area of the triangle with a base of " + base + " and a height of " + height + " is " + area);
        System.out.println();

        sc.close();
    }
}
