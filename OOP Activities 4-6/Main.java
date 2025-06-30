public class Main {
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle();
        Square sq1 = new Square();
        Triangle tri1 = new Triangle();

        System.out.println();
        rec1.calculateArea(5, 10);
        sq1.calculateArea(6);
        tri1.calculateArea(5, 4);
        System.out.println();
    }
}
