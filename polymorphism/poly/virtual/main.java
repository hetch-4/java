public class main{
    public static void main(String[]args){
        Salary s = new Salary("Mohd Mohtashim","Ambehta,UP",3,3600.00);
        Employee e = new Salary("John Adams", "Boston,MA",2,2400.00);
        System.out.println("Call mailCheck using Salary reference--");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference--");
        e.mailCheck();
    }
}
class Employee{
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        System.out.println("Constructing an Employee...");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Mailing a check to "+this.name+" "+this.address);
    }
    public String toString(){
        return name+" "+address+" "+number;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String addr){
        address = addr;
    }
    public int getNumber(){
        return number;
    }
}

public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary){
        super(name,address,number);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Within mailCheck of salary class");
        System.out.println("Mailing Check to"+getName()+" With Salary "+salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary > 0){
            salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("Computing salary pay for"+getName());
        return salary/52;
    }
}