import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class User{
    private String name;
    private LocalDate dateOfBirth;

    //constructor
    public User(String name, LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    
    }

    //getters 
    public String getName(){
        return name;        
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    //to String Method
    @Override
    public String toString(){
        return "User{"+
        "Name='"+name+'\''+
        " datOfBirth="+dateOfBirth +
        "}";
    }

    //Main method to test
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       
        System.out.println("Enter Name ");
        String name = scanner.nextLine();
       
        System.out.println("Enter date of birth (yyyy-MM-dd):");
        String dobInput = scanner.nextLine();
       
        LocalDate dateOfBirth = LocalDate.parse(dobInput, formatter);

        User user = new User(name, dateOfBirth);
        System.out.println("User Created :-"+ user);
    }
}