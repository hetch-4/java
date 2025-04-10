public class Employee{
    private String name;
    private String regno;
    private int age;
    
    //constructor
    public Employee(String name, String regno, int age){
        this.name = name;
        this.regno = regno;
        this.age = age;
    }

    //accessor methods (getters)
    public String getName(){
        return name;
    }
    public String getRegno(){
        return regno;
    }
    public int getAge(){
        return age;
    }

    //Methods
    public void display(){
        System.out.println("Employee name: " + this.getName());
        System.out.println("Employee Id: " + this.getRegno());
        System.out.println("Employee Age: " + this.getAge());
    }

    // Mutator Methods
    public void setName(String name){
        this.name = name;
    }
    public void setRegno(String regno){
        this.regno = regno;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String [] args){
        Employee mp1 = new Employee("Joker Smoker", "BMG5", 30);
        mp1.display();
        mp1.setName("Adit3acha joker");
        mp1.setRegno("BMS3");
        mp1.setAge(21);
        mp1.display();

    }

}