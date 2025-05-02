import java.util.*;
class main{
    public static void main(String [] args){
        Room h1 = new Room(102,"single",true,"active",1000.00);
        //add room 102 to available rooms
        h1.availRoom(102);
        //check available rooms
        h1.checkRooms();
        //check availability of one room
        h1.checkRoomAvailability(102);
        h1.checkRoomAvailability(10);
        //book a room
        h1.bookroom(102);
        h1.checkRooms();
        
    }
}
class Hostel{
    List<Integer> rooms = new ArrayList<>();
    {
        rooms.add(11);
        rooms.add(12);
        rooms.add(14);
        rooms.add(23);
        rooms.add(34);
    }
    
    void checkRooms(){
        System.out.println(rooms);
    }

    void availRoom(int num){
        rooms.add(num);
    }

    //methods
    void bookroom(int num){
        //check if room num is available
        checkRoomAvailability(num);
        //book room
        rooms.remove(Integer.valueOf(num));
    }

    void checkRoomAvailability(int num){
        //check if room is not booked
        if(rooms.contains(num)){
            System.out.println("Room available");
        }else{
            System.out.println("Room Not available");
        }
    }
}

class Room extends Hostel{
    private int roomNum;
    private String roomtype;
    private int capacity;
    private boolean availability;
    private String status;
    private double price;

    //constructor
    public Room(int num, String type, boolean avail,String status,double price){
        this.roomNum = num;
        this.roomtype = type;
        this.availability = avail;
        this.status = status;
        this.price = price;
    }    

    
}