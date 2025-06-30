abstract class AnimalAbstract{
    public int intAge = 10;
    public String strKind = "";

    public void animalsound(String strKind){}

    public void animalskin(String strKind){}

    public int animalage(int intAge){
        return intAge * 12;
    }

    public void animalfeet(String strKind){
        if (strKind.equalsIgnoreCase("Dog") || strKind.equals("Cat"))
            System.out.println("This animals has 4 feet.");

        else if (strKind.equalsIgnoreCase("Bird"))
            System.out.println("A bird has 2 feet.");

        else if (strKind.equalsIgnoreCase("Fish"))
            System.out.println("A fish has a tail.");

        else
            System.out.println("Cannot distinguish animal.");
    }
}