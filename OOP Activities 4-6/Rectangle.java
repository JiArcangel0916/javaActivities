class Rectangle extends Shape{
    public void calculateArea(int length, int width){
        System.out.println("Rectangle");
        float area = length * width;
        System.out.println("Area:   "+area);
    }    
}