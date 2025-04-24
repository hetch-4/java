class Person{
    private String name; 
    private int age;
    private String contact_num;
    private String id;

    //constructor 
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
        if(!contact.matches("\\d{10}")){
            throw new IllegalArgumentException("Contact must be a 10 digit String");
        }else{
            this.contact_num = contact;
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

    
}

class Member extends Person{
    private int borrowed_books;

    public Member(String id,String name, int age, String contact_num, int borrowed_books){
        setName(name);
        setAge(age);
        setContact_num(contact_num);
        setId(id);
        this.borrowed_books = borrowed_books;
    }

    public void display(){
        System.out.println("\nLibrary Member ");
        System.out.println("Member Id - "+getId()+"\nName - "+getName()+"\nAge - "+getAge()+"\nContact Number - "+getContact_num()+"\nBorrowed books - "+borrowed_books);
    }

}

class Librarian extends Person{
    private int managed_books ;

    public Librarian(String id,String name, int age, String contact_num, int managed_books){
        setName(name);
        setAge(age);
        setContact_num(contact_num);
        setId(id);
        this.managed_books = managed_books;
    }

    public void display(){
        System.out.println("\nLibarian ");
        System.out.println("Member Id - "+getId()+"\nName - "+getName()+"\nAge - "+getAge()+"\nContact Number - "+getContact_num()+"\nBorrowed books - "+managed_books);
    }
}
