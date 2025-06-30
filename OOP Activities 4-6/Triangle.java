class Triangle extends Shape{
    public void calculateArea(int base, int height){
        System.out.println("Triangle");
        double area = (base * height) / 2.0; 
        System.out.println("Area:   "+area);
    }
}
