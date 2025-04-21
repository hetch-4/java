class Main{
    public static void main(String [] args){
        Cat c1 = new Cat();
        c1.eat();
        c1.meow();
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}