import java.util.Scanner;

public class Act3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        int[] sumRow = new int[2];
        int[] sumCol = new int[2];
        int[] diffRow = new int[2];
        int[] diffCol = new int[2];
        int[] prodRow = new int[2];
        int[] prodCol = new int[2];
        int i, j, size = 2;

        System.out.println("Please enter integer values for the 2x2 2D array:");
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix[i].length; j++){
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        sumRow[0] = matrix[0][0] + matrix[0][1];
        sumRow[1] = matrix[1][0] + matrix[1][1];
        sumCol[0] = matrix[0][0] + matrix[1][0];
        sumCol[1] = matrix[0][1] + matrix[1][1];
        diffRow[0] = matrix[0][0] - matrix[0][1];
        diffRow[1] = matrix[1][0] - matrix[1][1];
        diffCol[0] = matrix[0][0] - matrix[1][0];
        diffCol[1] = matrix[0][1] - matrix[1][1];
        prodRow[0] = matrix[0][0] * matrix[0][1];
        prodRow[1] = matrix[1][0] * matrix[1][1];
        prodCol[0] = matrix[0][0] * matrix[1][0];
        prodCol[1] = matrix[0][1] * matrix[1][1];
        
        System.out.println("Array entered:");
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Sum of rows:");
        for (i = 0; i < size; i++){
            System.out.println("Row " + (i+1)+ ": " +sumRow[i]);
        }

        System.out.println("Sum of columns:");
        for (i = 0; i < size; i++){
            System.out.println("Row " + (i+1)+ ": " +sumCol[i]);
        }

        System.out.println("Difference of rows:");
        for (i = 0; i < size; i++){
            System.out.println("Row " + (i+1)+ ": " +diffRow[i]);
        }

        System.out.println("Difference of columns:");
        for (i = 0; i < size; i++){
            System.out.println("Row " + (i+1)+ ": " +diffCol[i]);
        }

        System.out.println("Product of rows:");
        for (i = 0; i < size; i++){
            System.out.println("Row " + (i+1)+ ": " +prodRow[i]);
        }

        System.out.println("Product of columns:");
        for (i = 0; i < size; i++){
            System.out.println("Row " + (i+1)+ ": " +prodCol[i]);
        }
    }
}
