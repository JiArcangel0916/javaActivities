import java.util.Scanner;

public class ProgMP2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, n5;
        double max;
        
        System.out.println("Input five numbers:");
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

        if (n1 > n2){
            if (n1 > n3){
                if (n1 > n4){
                    if (n1 > n5){
                        max = n1;
                    }
                    else{
                        max = n5;
                    }
                }
                else{
                    if (n4 > n5){
                        max = n4;
                    }
                    else{
                        max = n5;
                    }
                }
            }
            else{
                if (n3 > n4){
                    if (n3 > n5){
                        max = n3;
                    }
                    else{
                        max = n5;
                    }
                }
                else{
                    if (n4 > n5){
                        max = n4;
                    }
                    else{
                        max = n5;
                    }
                }
            }
        }
        else{
            if (n2 > n3){
                if (n2 > n4){
                    if (n2 > n5){
                        max = n2;
                    }
                    else{
                        max = n5;
                    }
                }
                else{
                    if (n4 > n5){
                        max = n4;
                    }
                    else{
                        max = n5;
                    }
                }
            }
            else{
                if (n3 > n4){
                    if (n3 > n5){
                        max = n3;
                    }
                    else{
                        max = n5;
                    }
                }
                else{
                    if (n4 > n5){
                        max = n4;
                    }
                    else{
                        max = n5;
                    }
                } 
            }
        }

        System.out.println(max + " is the highest number!");
        System.out.println();
        sc.close();
    }
}
