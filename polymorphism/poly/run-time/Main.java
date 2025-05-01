public class Main{
    public static void main(String [] args){
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.displayInfo();
        v2.displayInfo();
    }
}
class Vehicle{
    public void displayInfo(){
        System.out.println("There are some vehicles");
    }
}
class Car extends Vehicle{
    @Override
    public void displayInfo(){
        System.out.println("I hava a car.");
    }
}
class Bike extends Vehicle{
    @Override
    public void displayInfo(){
        System.out.println("I have a bike.");
    }
}
