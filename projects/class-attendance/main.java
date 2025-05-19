class Student{
    private String id;
    private String name;

    public Student(String id,String name){
        this.name =name;
        this.id = id;
    }

    public String getname(){
        return name;
    }
    public String getid(){
        return id;
    }

    public void setname(String name){
        this.name = name;
    }
    public void setid(String id){
        this.id = id;
    }
}

class Undergrad extends Student{
    //undergraduate student

}
class Postgrad extends Student{
    //Postgraduate student

}
class Attendance extends Student{ 

}