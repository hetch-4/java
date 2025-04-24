import java.util.ArrayList;
import java.util.List;

class Book{
    private String bookId; String title; String currentBorrowerId; String author; String status;
    private int isbn; int publicationYear;
    List<String> bookIds = new ArrayList<>(8);


    public void addBooks(String c){
        bookIds.add("Apple");
        bookIds.add("Pineapple");
        bookIds.add("Mango");
        bookIds.add(c);
    }

    public Book(String bookId, String title, String currentBorrowerId,String author, String status,int isbn, int publicationYear){
        setBookid(bookId);
        this.title = title;
        this.currentBorrowerId = currentBorrowerId;
        this.author = author;
        this.status = status;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        addBooks("cs101");
    }

    public void setBookid(String id){
        if(!bookIds.add(id)){
            System.out.println("book ID "+ bookId+" already exists");
        }
        this.bookId = id;
    }



    public void display(){
        System.out.println("Book list:- "+bookIds);
        System.out.println("Book Id - "+bookId+" \nTitle - "+title+" \nBorrower Id - "+currentBorrowerId+" \nAuthor - "+author+" \nStatus - "+status+" \nISBN - "+isbn+" \npublication Year - "+publicationYear);
    }

    public static void main(String [] args){

        Book b1 = new Book("cs101","jokers","jk101","smitherin","active",86757532,2001);
        b1.display();
    }
}

public class DuplicateBookIDException extends Exception{
    public DuplicateBookIDException(String message){
        super(message);
    }
}
