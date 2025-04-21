class Main{
    public static void main(String [] args){
        dog d1 = new dog();
        d1.eat();
        d1.bark();
    }
}
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
