public class Student{
    //Attributes
    private String regno;
    private String name;
    private int age;
    
    //Constructor
    public Student(String name, String regno, int age){
        this.name = name;
        this.regno = regno;
        this.age = age;
    }

    public void register(){
        System.out.println("Registration successful!");
    }

    public void display(){
        System.out.println("Student Details:");
        System.out.println("Name:" + name);
        System.out.println("Registration Number:" + regno);
        System.out.println("Age:" + age);
    }

    public static void main(String [] args){
        Student no1 = new Student("Joker Smoker","BMCS/524J/2023", 20);    
        no1.register();
        no1.display();
    }
}