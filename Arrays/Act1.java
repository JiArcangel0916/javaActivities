import java.util.Random;
import java.util.Arrays;

public class Act1 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] yourNum = new int[6];
        int[] winNum = new int[6];
        int i, j, ctr = 0;
        for (i = 0; i < yourNum.length; i++){
            yourNum[i] = rand.nextInt(49) + 1;
            winNum[i] = rand.nextInt(49) + 1;
        }

        for (i = 0; i < yourNum.length; i++){
            for (j = 0; j < yourNum.length; j++){
                if (yourNum[i] == winNum[j]){
                    ctr++;
                    break;
                }
            }
        }

        System.out.println("Your lottery numbers: " + Arrays.toString(yourNum));
        System.out.println("Winning numbers: " + Arrays.toString(winNum));

        System.out.println("\nCongratulations! Your matched " + ctr + " numbers!");
    }
} 