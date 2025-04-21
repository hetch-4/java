public class Main{
    public static void main(String [] args){
        Programmer p1 = new Programmer();
        System.out.println(p1.salary);
        System.out.println(p1.bonus);
    }
}
class Employee{
    float salary = 40000;
}

class Programmer extends Employee{
    int bonus = 20000;

}