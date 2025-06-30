interface Car{
    void start();
    void stop();
}

class electricCar implements Car{
    @Override
    public void start(){
        System.out.println("Electric car has started!");
    }

    @Override
    public void stop(){
        System.out.println("Electric car has stopped!");
    }
}

class gasolineCar implements Car{
    @Override
    public void start(){
        System.out.println("Gasoline car has started!");
    }

    public void stop(){
        System.out.println("Gasoline car has stopped!");
    }
}

public class Act3{
    public static void main(String[] args){
        electricCar eCar = new electricCar();
        gasolineCar gCar = new gasolineCar();

        eCar.start();
        gCar.start();
        System.out.println();
        eCar.stop();
        gCar.stop();
    }
}