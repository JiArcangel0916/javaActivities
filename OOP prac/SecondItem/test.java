package SecondItem;

public class test {
    public static void main(String[] args) {

        Area cCircArea1 = new Area("Circle", 10);
        System.out.println(cCircArea1.Area("Circle", 10));

        Area cCircArea2 = new Area("Circle", 10.0);
        System.out.println(cCircArea2.Area("Circle", 10.0));

        Area cRectArea1 = new Area("Rectangle", 10, 10);
        System.out.println(cRectArea1.Area("Rectangle", 10, 10));

        Area cRectArea2 = new Area("Rectangle", 10.0, 10);
        System.out.println(cRectArea2.Area("Rectangle", 10.0, 10));

        Area cRectArea3 = new Area("Rectangle", 10, 10.0);
        System.out.println(cRectArea3.Area("Rectangle", 10, 10.0));
        
        Area cRectArea4 = new Area("Rectangle", 10.0, 10.0);
        System.out.println(cRectArea4.Area("Rectangle", 10.0, 10.0));

    }
}
