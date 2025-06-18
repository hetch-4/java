import java.util.*;

class Main{
    public static void main(String [] args){

    }
}

class Room{
    private int roomNo, capacity;
    private String type;
    private double price;

    //Room constructor
    public Room(int num, int cap, String type,double price){
        this.roomNo = num;
        this.capacity = cap;
        this.type = type;
        this.price = price;
    }

    //getter methods
    public int getRoomNumber(){
        return roomNo;
    }
    public int getRoomCapacity(){
        return capacity;
    }
    public String getRoomType(){
        return type;
    }
    public double getRoomPrice(){
        return price;
    }

    //Display room details
    public void displayRoomDetails(){
        System.out.println("Room Number:"+getRoomNumber()+" \nCapacity: "+getRoomCapacity()+" \nType: "+getRoomType()+"\nPrice: "+getRoomPrice());
    }
}

class Hostel{
    private List<Room> rooms;
    
    public Hostel(){
        rooms = new ArrayList<>();
    }

    //
    public void addRoom(Room room){
        //logic to confirm if rooms contains room
        if(rooms.contains(room)){
            System.out.println("Room "+room.getRoomNumber()+" already exists");
        }else{
            rooms.add(room);
        }
    }

    //remove a room from rooms list
    public void removeRoom(Room room){
        //logic to check if room is listed in rooms
        if(rooms.contains(room)){
            rooms.remove(room);
        }else{
            System.out.println("Romm "+room.getRoomNumber()+" does not exist in the system database");
        }
    }

    //method to get a specific room
    public void getARoom(int roomNum){
        for(Room room: rooms){
            int controlRoom = room.getRoomNumber();
            //logic to find room number
            if(roomNum==controlRoom){
                System.out.println(room.getRoomNumber());
                //return room;
            }else{
                System.out.println("Room not found");
                break;
            }
            //return null;
        }
    }

    public void viewAvailableRooms(){
        System.out.println("Available Rooms: ");
        
    }
} 