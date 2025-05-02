class main{
    public static void main(String [] args){
        Car c1 = new Car("v16");
    }
}
class Engine{
    //Properties and methods of Engine 
}

//whole class
class Car{
    //aggregation Car has a engine
    private Engine engine;

    //constructor
    public Car(Engine engine){
        this.engine = engine;
    }

    //other methods of class
}