public class Functions {

    //NON-RECURSIVE FUNCTIONS
    public double area(double dbRadius){
        return Math.PI * Math.pow(dbRadius, 2);
    }

    public int sum(int intTerm){
        int intSum = 0;
        int intSeries = 2;
        
        for (int intCounter = 1; intCounter <= intTerm; ++intCounter){
            intSum += intSeries;
            intSeries += 2;
        }

        return intSum;
    }

    public int count(int intNum){
        int intCounter = 0;
        
        if (intNum == 0)
            return 1;
        else{
            while (intNum != 0){
                intCounter++;
                intNum /= 10;
            }

            return intCounter;
        }

    }

    public int reverse(int intNum){
        int intReversed = 0;

        while (intNum != 0){
            intReversed = intReversed * 10 + (intNum % 10);
            intNum /= 10;
        }
        return intReversed;
    }

    public boolean find(char chArray[], char chKey){
        for (int intCounter = 0; intCounter < chArray.length; intCounter++)
            if (chArray[intCounter] == chKey)
                return true;
        return false;
    }


    //RECURSIVE FUNCTIONS
    // public double areaRecursion(double dbRadius){
    //     if (dbRadius == 0)
    //         return 0;
    //     else
    //         return areaRecursion(dbRadius - 1) + Math.PI;
    // }


    public int sumRecursion(int intTerm){
        if (intTerm == 0)
            return 0;
        else
            return sumRecursion(intTerm - 1) + (2 * intTerm);
    }

    public int countRecursion(int intNum){
        if (intNum == 0)
            return 0;
        else 
            return countRecursion(intNum / 10) + 1;
    }

    public int reverseRecursion(int intNum, int intReversed){
        if (intNum == 0)
            return intReversed;
        else
            return reverseRecursion(intNum / 10, intReversed * 10 + (intNum % 10));
    }

    public boolean findRecursion(char chArr[], char chKey, int intCtr){
        if (intCtr >= chArr.length)
            return false;
        else if (chArr[intCtr] == chKey)
            return true;
        else
            return findRecursion(chArr, chKey, ++intCtr);
    }

}
