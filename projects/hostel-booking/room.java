public class Main{
    public static void main(String [] args){
        Room r1 = new Room(101,2,"Single",20.00);
        r1.getRoom(101);
    }
}

class Room{
    private int roomNo,capacity;
    private String type;
    private double price;

    public Room(int num,int cap,String type,double price){
        this.roomNo = num;
        this.capacity = cap;
        this.type = type;
        this.price = price;
    }

    public int getRoomNo(){
        return roomNo;
    }
    public int getCapacity(){
        return capacity;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public Room getRoom(int n){
        for(Room room:rooms){
            int vroom = room.getRoomNo();
            if(vroom == n){
                System.out.println(room);
            }
            else{
                break;
            }
        }
        return room;      
    }
}
