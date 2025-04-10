public class Car{
    // Attributes
    private String model;
    private int year;

    //constructors
    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    // Methods
    public void start(){
        System.out.println(model + " is running");

    }
    public void drive(){
        System.out.println("Driving a " + model);
    }
    public void stop(){
        System.out.println(model + " Stoping");
    } 

    public static void main(String [] args){
        Car mycar = new Car("BMW", 2001);
        mycar.start();
        mycar.drive();
        mycar.stop();
    }
    
}