import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name, course, add;
        int yr, age;
        
        System.out.println("\nProvide the following information:");
        System.out.print("\tName: ");
        name = sc.nextLine();
        System.out.print("\tCourse: ");
        course = sc.nextLine();
        System.out.print("\tYear Level: ");
        yr = sc.nextInt();
        System.out.print("\tAddress: ");
        sc.nextLine();
        add = sc.nextLine();
        System.out.print("\tAge: ");
        age = sc.nextInt();

        System.out.println("\nName:           " + name);
        System.out.println("Course:         " + course);
        System.out.println("Year Level:     " + yr);
        System.out.println("Address:        " + add);
        System.out.println("Age:            " + age);
        System.out.println();

        sc.close();
    }
}
