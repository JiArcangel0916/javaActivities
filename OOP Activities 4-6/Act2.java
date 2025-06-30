abstract class Animal{
    public abstract void makeSound();
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof Woof!");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow Meow!");
    }
}

public class Act2{
    public static void main(String[] args){
        Dog brownie = new Dog();
        Cat whitey = new Cat();

        System.out.println();
        System.out.print("The dog goes: ");
        brownie.makeSound();
        System.out.print("While the cat goes: ");
        whitey.makeSound();
        System.out.println();
    }
}