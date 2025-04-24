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
        System.out.println("RecordId - "+recordId+"\nBook ID - "+bookId+"\nMember ID - "+memberId+"\nBorrowDate - "+borrowDate+"\nDue Date - "+dueDate+"\nReturn date - "+ returnDate );
    }

    public static void main(String [] args){
        Record r1 = new Record("jk101","joker101","jhd101",2,15,12);
        r1.display();
    }
}