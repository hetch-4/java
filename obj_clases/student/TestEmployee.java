class TestEmployee{
    public static void main(String [] args){
        Employee mp1 = new Employee();
        Employee mp2 = new Employee();
        Employee mp3 = new Employee();
        mp1.insert(23647, "joker" ,40000);
        mp2.insert(102,"halal",25000);
        mp3.insert(103, "nakul", 36000);
        mp1.disp();
        mp2.disp();
        mp3.disp();
    }
}
class Employee{
    int id;
    String name;
    float salary;

    void insert(int i, String n,float s){
        id = i;
        name = n;
        salary =s;
    }
    
    void disp(){
        System.out.println("Id: "+ id +" Name:" + name + " Salary:" + salary);
    }
}