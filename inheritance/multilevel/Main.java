public class Main{
    public static void main(String [] args){
        myDog dc = new myDog();
        dc.eat();
        dc.bark();
        dc.name();
        dc.weep();
    }
}
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class myDog extends Dog{
    String name = "Joker";
    void name(){
        System.out.println(name);
    }
    void weep(){
        System.out.println("Weeping...");
    }
}