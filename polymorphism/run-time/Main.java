public class Main{
    public static void main(String [] args){
        Salary s = new Salary("Joker","Mombasa", 3, 36000.00);
        Employee e = new Salary("Adams","nairobi", 2, 24000.00);

        System.out.println("\n call mail using Salary reference ");
        s.mailCheck();
        System.out.println("\n Call mail check using employee reference ");
        e.mailCheck();
    }

    
}
class Employee{
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to "+this.name+" "+this.address);
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getNumber(){
        return number;
    }
}

class Salary extends Employee{
    private double salary;
    public Salary(String name,String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Within mailCheck of salary class");
        System.out.println("Mailing check to "+getName()+" with salary "+salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    public double computePay(){
       System.out.println("Computing salary for "+getName());
        return salary/52;
    }
}
