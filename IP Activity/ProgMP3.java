import java.util.Scanner;

public class ProgMP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNo, day, year;
        String month = "";

        System.out.println("Enter date in numerical form:");
        System.out.print("\tMonth => ");
        monthNo = sc.nextInt();

        System.out.print("\tDay => ");
        day = sc.nextInt();

        System.out.print("\tYear => ");
        year = sc.nextInt();

        if (monthNo == 1){
            month = "January ";
        }
        else if (monthNo == 2){
            month = "February ";
        }
        else if (monthNo == 3){
            month = "March ";
        }
        else if(monthNo == 4){
            month = "Apirl ";
        }
        else if (monthNo == 5){
            month = "May ";
        }
        else if (monthNo == 6){
            month = "June ";
        }
        else if (monthNo == 7){
            month = "July ";
        }
        else if (monthNo == 8){
            month = "August ";
        }
        else if (monthNo == 9){
            month = "September ";
        }
        else if (monthNo == 10){
            month = "October ";
        }
        else if (monthNo == 11){
            month = "November ";
        }
        else if (monthNo == 12){
            month = "December ";
        }
        else{
            month = "No such month";
        }

        System.out.println("The date is " + month + day + ", " + year);
        System.out.println();
        sc.close();
    }
}
