class Main{
  public static void main(String [] args){
    System.out.println("Hello world");
    Book b1 = new Book();
    b1.Book("Atomic habits","James Clear", 2002);
    System.out.println(b1);
  }

}

class Book{
  String author,title;
  int year;

  public void Book(String title, String author, int year){
    this.author = author;
    this.title = title;
    this.year = year;
  }
  
  public String toString(){
    return "Author: "+ author +
      " Title: " + title +
      " Year: " + year + ".";
  }
}
