import java.util.Scanner;

public class Prog4 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q1, q2, q3;
        double ave;

        System.out.println("\nInput three quiz scores:");
        System.out.print("\tQuiz 1: ");
        q1 = sc.nextInt();
        System.out.print("\tQuiz 2: ");
        q2 = sc.nextInt();
        System.out.print("\tQuiz 3: ");
        q3 = sc.nextInt();

        ave = (q1 + q2 + q3) / 3.0;

        System.out.println("\nThe average of the three input quizzes is " + ave);
        System.out.println();

        sc.close();
    }
}
