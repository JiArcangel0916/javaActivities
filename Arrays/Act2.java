import java.util.Scanner;

public class Act2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows, cols, i, j;

        System.out.print("Enter the number of rows for the 2D array: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        cols = sc.nextInt();
        sc.nextLine();

        char[][] arr = new char[rows][cols];

        System.out.println("\nEnter the character for each index of the 2D array: \n");

        for (i = 0; i < rows; i++){
            System.out.println("Row " +(i+1)+": ");
            for (j = 0; j < cols; j++){
                System.out.print("Enter character for column " +(j+1)+ ": ");
                arr[i][j] = sc.nextLine().charAt(0);
            }
            System.out.println();
        }

        System.out.println("The 2D array you've created is: ");
        //System.out.println(Arrays.deepToString(arr));
        System.out.println("[");
        for (i = 0; i < arr.length; i++){
            System.out.print("[");
            for (j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println("],");
        }
        System.out.println("]");
    }
}