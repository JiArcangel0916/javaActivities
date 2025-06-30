class Square extends Shape{
    public void calculateArea(int side){
        System.out.println("Square");
        float area = side * side;
        System.out.println("Area:   "+area);
    }
}