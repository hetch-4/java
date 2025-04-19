public class Main{
    public static void main(String [] args){
        Student st1 = new Student();
        st1.setName("joker");
        st1.setId(239979);
        st1.disp();
        Student st2 = new Student();
        st2.setName("Stolid");
        st2.setId(3275654);
        st2.disp();
    }
}

class Student{
    private int id;
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public void disp(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

}

