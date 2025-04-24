public class Main{
    public static void main(String [] args){
        Member m1 = new Member("jk101","joe",20,"0759864527",3);
        m1.display();

        Librarian l1 = new Librarian("jh101", "Smith", 39, "0798686874", 234);
        l1.display();

        Record r1 = new Record("jk101","joker101","jhd101",2,15,12);
        r1.display();

        Book b1 = new Book("cs101","jokers","jk101","smitherin","active",86757532,2001);
        b1.display();
    }
}
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

class Record{
    private String recordId; String bookId; String memberId;
    private int borrowDate; int dueDate; int returnDate;

    public Record(String recordId, String bookId, String memberId, int borrowDate, int dueDate, int returnDate){
        this.recordId = recordId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    void display(){
        System.out.println("\nRecord");
        System.out.println("RecordId - "+recordId+"\nBook ID - "+bookId+"\nMember ID - "+memberId+"\nBorrowDate - "+borrowDate+"\nDue Date - "+dueDate+"\nReturn date - "+ returnDate );
    }

        
}

class Book{
    private String bookId; String title; String currentBorrowerId; String author; String status;
    private int isbn; int publicationYear;

    public Book(String bookId, String title, String currentBorrowerId,String author, String status,int isbn, int publicationYear){
        this.bookId = bookId;
        this.title = title;
        this.currentBorrowerId = currentBorrowerId;
        this.author = author;
        this.status = status;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    public void display(){
        System.out.println("\nBook");
        System.out.println("Book Id - "+bookId+" \nTitle - "+title+" \nBorrower Id - "+currentBorrowerId+" \nAuthor - "+author+" \nStatus - "+status+" \nISBN - "+isbn+" \npublication Year - "+publicationYear);
    }

    
}