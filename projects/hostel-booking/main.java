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
            System.out.println("5.Add Room");
            System.out.println("6.Exit"); 

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your choice:");
            int choice = scanner.nextInt();
            Hostel h1 = new Hostel();
            room r1 = new room();
            switch(choice){
                case 1:
                    try{
                        System.out.println("Available rooms");
                        //get available rooms
                        //h1.getRooms();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Enter room number");
                        int roomNum = scanner.nextInt();
                        System.out.println(roomNum);
                    }catch(Exception e){
                        System.out.println(e);
                    }
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
                    System.out.println("Add room to list of rooms");
                    room adroom=r1("101");
                    h1.addRoom(adroom);
                case 6:
                    running =false;
                    break;
            }

        }
        
    }
}

class room{
    int roomNum;

    public void mkroom(int num){
        public room(int num){
            this.roomNum = num;
        } 
    }
}
class Hostel{
    List <room> rooms;

    public void addRoom(room rm){
        rooms.add(rm);
    }
    public void getRooms(){
        Iterator itr = new Iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
