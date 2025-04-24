class Person{
    private String name; 
    private int age;
    private String contact_num;
    private String id;

    //constructor 
    public Person(String contact,int age){
        setAge(age);
        setContact_num(contact);
    }
    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid input");
        }
    }
    public void setContact_num(String contact){
        if(contact.matches("\\d{10}")){
            this.contact_num = contact;
        }else{
            System.out.println("input 10 character");
        }
    }
    public void setId(String id){
        this.id = id;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getContact_num(){
        return contact_num;
    }
    public int getAge(){
        return age;
    }

    public static void main(String [] args){
        Person p1 = new Person("8097456321",20);        
        System.out.println(p1.getContact_num()+" "+p1.getAge());

    }
}