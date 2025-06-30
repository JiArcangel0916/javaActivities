package ThirdItem;

public class test {
    public static void main(String[] args) {
        Circle abCircle = new Circle();
        abCircle.desciption();
        abCircle.shapename();
        abCircle.sides();
        
        Triangle abTriangle = new Triangle();
        abTriangle.desciption();
        abTriangle.shapename();
        abTriangle.sides();

        Rectangle interRectangle = new Rectangle();
        interRectangle.shapename();
        interRectangle.sides();

        Pentagon interPentagon = new Pentagon();
        interPentagon.shapename();
        interPentagon.sides();
    }
}
