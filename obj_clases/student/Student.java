class Student{
    private int id ;
    private String name ;

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

    public static void main(String [] args){
        Student st1 = new Student();
        st1.setName("Joker");
        st1.setId(203298);
        st1.disp();
    }
}