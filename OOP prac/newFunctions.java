public class newFunctions{

    //NON RECURSIVE FUNCTIONS
    public double Area(double dbRadius){
        return intRadius * Math.PI;
    }

    public int Sum(int intTerm){
        int intSum = 0;
        int intAdd = 2;

        if (intSum == 0)
            return 0;

        else
            (for int intCtr = 1; intCtr <= intTerm; ++intCtr){
                intSum += intAdd;
                intAdd += 2;
            }

        return intSum;
    }

    public int digits(int intNum){
        int intDigits = 0;

        while (intNum != 0){ 
            intNum = intNum / 10;
            ++intDigits;
        }

        return intDigits;
    }

    public int reverse(int intNum){
        int intReverse = 0;

        while (intNum != 0){
            intReverse = intReverse * 10 + (intNum % 10);
            intNum = intNum / 10;
        }
        return intReverse;
    }

    public boolean find(char chArr[], char chKey){
        for (int intCtr = 0; intCtr < chArr.length; ++intCtr)
            if (chArr[intCtr] == (chKey))
                return true;

        return false;
    }
}