public class main{
    public static void main(String [] args){
        Vehicle v1 = new BMW();
        Vehicle v2 = new bike();
        v1.disp();
        v2.disp();
    }
}
class Vehicle{
    void disp(){
        System.out.println("Some vehicle are there.");
    }
}

class BMW extends Vehicle{
    @Override
    void disp(){
        System.out.println("I hava a Beamer.");
    }
}

class bike extends Vehicle{
    @Override 
    void disp(){
        System.out.println("I have a bike.");
    }
}
