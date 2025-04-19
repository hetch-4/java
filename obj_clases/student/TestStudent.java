class TestStudent{
    public static void main(String [] args){
        Student st1 = new Student();
        st1.insert_record(30,"Joker");
        st1.disp();

        Student s1 = new Student();
        s1.insert_record(111,"karan");
        s1.disp();
    }
}

class Student{
    int rollno;
    String name;

    void insert_record(int r, String n){
        rollno = r;
        name = n;
    }

    void disp(){
        System.out.println(rollno + " " + name );
    }
}

