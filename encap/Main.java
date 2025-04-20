class Main{
    public static void main(String [] args){
        Person p1 = new Person();
        p1.setName("Smith");
        p1.setAge(20);
        p1.disp();
    }
}
class Person{
    private String Name;
    private int age;

    //getter methods
    public String getName(){
        return Name;
    }
    public int getAge(){
        return age;
    }

    //setter methods
    public void setName(String n){
        //validation logic
        if (n != null && !n.isEmpty()){
            this.Name = n;
        }
    }
    public void setAge(int a){
        //validation logic
        if (a > 0){
            this.age = a;
        }
    }

    public void disp(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

}