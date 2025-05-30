import java.util.*;
class Main{
    public static void main(String []args){
        boolean running = true;
        while(running){
            System.out.println("Hostel Booking System:");
            System.out.println("1.View available rooms");
            System.out.println("2.Book room");
            System.out.println("3.Cancel booking");
            System.out.println("4.View booking history");
            System.out.println("5.Exit"); 

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your choice:");
            int choice = scanner.nextInt();
            Hostel h1 = new Hostel();

            switch(choice){
                case 1:
                    System.out.println("Available rooms");
                    //get available rooms
                    Hostel h1 = new Hostel();
                    h1.getRooms();
                    break;
                case 2:
                    System.out.println("Book a room");
                    //bookroom()
                    String bookroom = scanner.nextLine();
                    h1.bookRoom(bookroom);
                    break;
                case 3:
                    System.out.println("Cancel booking");
                    //cancel booking()
                    break;
                case 4:
                    System.out.println("View booking history");
                    //list of all booked rooms
                    break;
                case 5:
                    running =false;
                    break;
            }

        }
        
    }
}

class Hostel{
    List <String> rooms = new ArrayList<String>();
    {
        rooms.add("room1");
        rooms.add("room2");
        rooms.add("room3");
        rooms.add("room4");
    }
    public String getRooms(){
        Iterator itr = rooms.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        return null;
    }
    public void bookRoom(room){
        if(rooms.contains(room)){
            rooms.remove(room);
        }
    }
}