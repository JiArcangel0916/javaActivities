class Rectangle{
    protected int length = 10;
    protected int width = 5;
}

public class Box extends Rectangle{
    private int height = 15;

    public static void main(String[] args){
        Box box1 = new Box();
        int area = box1.length * box1.width;
        int volume = box1.length * box1.width * box1.height;
        
        System.out.println();
        System.out.println("Area of the rectangle:   "+area);
        System.out.println("Volume of the box:      "+volume);
        System.out.println();
    }
}
