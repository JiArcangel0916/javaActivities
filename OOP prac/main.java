public class Main{
    public static void main(String[] args){
       Functions clFunction = new Functions();

    //    NON-RECURSIVE FUNCTIONS
       System.out.println("The are of the circle is " + clFunction.area(1.5));
    //    System.out.println("The are of the circle is " + clFunction.areaRecursion(Math.pow(1.5, 2))); 

       System.out.println("The sum of the of the series is " + clFunction.sum(5));
       System.out.println("The sum of the of the series is " + clFunction.sumRecursion(5));             //RECURSIVE FUNCTION

       System.out.println("The number of digits are " + clFunction.count(1241));
       System.out.println("The number of digits are " + clFunction.countRecursion(1241));                //RECURSIVE FUNCTION

       System.out.println("The reversed digit is " + clFunction.reverse(2345));
       System.out.println("The reversed digit recursion is " + clFunction.reverseRecursion(2345, 0));   //RECURSIVE FUNCTION

        if (clFunction.find(new char[]{'h', 'e', 'l', 'l', 'o'}, 'f'))
            System.out.println("Character is found in the array");  
        else
            System.out.println("No such character is found");

        if (clFunction.findRecursion(new char[]{'h', 'e', 'l', 'l', 'o'}, 'f', 0) == true)              //RECURSIVE FUNCTION
            System.out.println("Character is found in the array");
        else
            System.out.println("No such character is found");

    }
}