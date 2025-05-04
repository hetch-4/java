import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Main{
    public static void main(String [] args){
        Hostel hostel = new Hostel();
        hostel.addRoom(new Room(101,1,"Single",50.0));
        hostel.addRoom(new Room(102,1,"Sinlge",50.0));
        hostel.addRoom(new Room(201,2,"double",80.0));
        hostel.addRoom(new Room(202,2,"double",80.0));
        hostel.addRoom(new Room(301,4,"Domitory",30.0));

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        boolean running = true;

        while(running){
            System.out.println("\nHostel booking System");
            System.out.println("1.View Available Rooms.");
            System.out.println("2.Book a room.");
            System.out.println("3.Cancel a booking. ");
            System.out.println("4.View Booking History");
            System.out.println("5.Exit");
            System.out.println("\nChoose an option: ");
            
            int choice;
            try{
                choice = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Invalid Input. Please Enter a number");
                scanner.nextLine();
                continue;
            }

            switch(choice){
                case 1:
                    System.out.println("Enter Check-in date (YYYY-MM-DD):");
                    String vCheckinstr = scanner.next();
                    System.out.println("Enter Check-out date (YYYY-MM-DD):");
                    String vCheckoutstr = scanner.next();
                    try{
                        LocalDate vCheckin = LocalDate.parse(vCheckinstr);
                        LocalDate vCheckout = LocalDate.parse(vCheckoutstr);
                        hostel.viewAvailableRooms(vCheckin,vCheckout);
                    }catch (Exception e){
                        System.out.println("Invalid date format.Please use YYYY-MM-DD.");
                    }
                    break;
                case 2:
                    // Book a room
                    System.out.println("Enter Check-in date (YYYY-MM-DD):");
                    String vinstr = scanner.next();
                    System.out.println("Enter Check-out date (YYYY-MM-DD):");
                    String voutstr = scanner.next();
                    try{
                        LocalDate vin = LocalDate.parse(vinstr);
                        LocalDate vout = LocalDate.parse(voutstr);
                        hostel.viewAvailableRooms(vin,vout);
                        System.out.println("Enter Room Number:");
                        int room = scanner.nextInt();
                        System.out.println("Enter User ID:");
                        int user = scanner.nextInt();
                        hostel.bookRoom(room,vin,vout,user);
                       // hostel.removeRoom(new Room(room,vin,vout,user));
                       System.out.println(hostel.getRoom(101));
            
                    }catch (Exception e){
                        System.out.println("Invalid date format.Please use YYYY-MM-DD.");
                    }
                    break;
                case 3:
                    //Cancel booking
                    System.out.println("Cancel Booking ");
                    System.out.println("Enter Check-in date (YYYY-MM-DD):");
                    String instr = scanner.next();
                    System.out.println("Enter Check-out date (YYYY-MM-DD):");
                    String outstr = scanner.next();
                    try{
                        LocalDate vin = LocalDate.parse(instr);
                        LocalDate vout = LocalDate.parse(outstr);
                        hostel.viewAvailableRooms(vin,vout);
                        System.out.println("Enter Room Number:");
                        int room = scanner.nextInt();
                        System.out.println("Enter User ID:");
                        int user = scanner.nextInt();
                        hostel.cancelBooking(room,vin,vout,user);
            
                    }catch (Exception e){
                        System.out.println("Invalid date format.Please use YYYY-MM-DD.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;

            }
        }
    }
    //scanner.close();
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
    public String displayRoomDetails(){
        System.out.println(getRoomNo()+" "+getCapacity()+" "+getType()+" "+getPrice());
        return getRoomNo()+" "+getCapacity()+" "+getType()+" "+getPrice();
    }
}

//booking class 

class Booking{
    private int bookingId, roomNum;
    private LocalDate checkin, checkout;
    private int userId;

    public Booking(int bookingId, int room,LocalDate checkin, LocalDate checkout, int userId){
        this.bookingId = bookingId;
        this.roomNum = room;
        this.checkin = checkin;
        this.checkout = checkout;
        this.userId = userId;
    }

    public int getBookingId(){
        return bookingId;
    }
    public int getRoomNo(){
        return roomNum;
    }
    public LocalDate getCheckIn(){
        return checkin;
    }
    public LocalDate getCheckOut(){
        return checkout;
    }
    public int getUserId(){
        return userId;
    }

    void displayBooking(){
        System.out.println("Booking id"+getBookingId()+" Room Number: "+getRoomNo()+" Checkin:"+getCheckIn()+" Checkout: "+getCheckOut()+" user ID: "+getUserId());
    }
}

class Hostel{
    private List<Room> rooms;
    private List<Booking> bookings;
    private int nextBookingId;

    public Hostel(){
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        nextBookingId = 1;
    }

    //Method to add room to rooms list
    void addRoom(Room room){
        rooms.add(room);
    }
    void removeRoom(Room room){
        rooms.remove(room);
    }
    public Room getRoom(int n){
        for(Room room:rooms){
            int vroom = room.getRoomNo();
            if(vroom == n){
                return room;
            }
            else{
                break;
            }
        }
        return null;
    }
    //Check for available rooms
    public void viewAvailableRooms(LocalDate checkin, LocalDate checkout){
        System.out.println("Available Rooms from "+checkin+" to "+checkout+":");
        for (Room room:rooms){
            //check if room is available
            if(isRoomAvailable(room.getRoomNo(),checkin,checkout)){
                System.out.println("Room Number: "+room.getRoomNo()+", Type: "+room.getType()+", Capacity: "+room.getCapacity()+" Price: $"+room.getPrice());
            }
        }
    }

    public boolean isRoomAvailable(int roomNum, LocalDate checkin, LocalDate checkout){
        for(Booking booking:bookings){
            if(booking.getRoomNo() == roomNum){
                LocalDate existingCheckin = booking.getCheckIn();
                LocalDate existingCheckout = booking.getCheckOut();
                if(checkin.isBefore(existingCheckout) && checkout.isAfter(existingCheckin)){
                    return false;
                }
            }
        }
        return true;
    }
    //method to remove room
    //public boid removeRoom(int roomNum,LocalDate checkin,LocalDate checkout,int userId){

    //}
    //Method to Book a room 
    public void bookRoom(int roomNum, LocalDate checkIn, LocalDate checkout,int userId){
        if (checkout.isBefore(checkIn) || checkout.isEqual(checkIn)){
            System.out.println("Check out date must be after checkin Date");
            return;
        }
        Room selectedRoom = null;
        for (Room room:rooms){
            if(room.getRoomNo() == roomNum){
                selectedRoom = room;
                break;
            }
        }
        if(selectedRoom == null){
            System.out.println("Room does not exist");
            return;
        }
        if(isRoomAvailable(roomNum,checkIn,checkout)){
            Booking booking = new Booking(nextBookingId, roomNum, checkIn,checkout,userId);
            bookings.add(booking);
            rooms.remove(roomNum);
            System.out.println("Booking successful, BookingID: "+nextBookingId);
            booking.displayBooking();
            nextBookingId++;
        }else{
            System.out.println("Room is not available for the selected date.");
        }
        
    }
    //Method to cancel booking
    public void cancelBooking(int roomNum, LocalDate checkin,LocalDate checkout,int userId){
        Room selectedRoom = null;
        for (Room room:rooms){
            if(room.getRoomNo() == roomNum){
                selectedRoom = room;
                break;
            }
        }
        if(selectedRoom == null){
            System.out.println("Room does not exist");
            return;
        }
        if(!isRoomAvailable(roomNum,checkin,checkout)){
            Booking booking = new Booking(nextBookingId, roomNum, checkin,checkout,userId);
            bookings.remove(booking);
            //rooms.add(roomNum);
            System.out.println("Cancel Booking successful, BookingID: "+nextBookingId);
            booking.displayBooking();
            nextBookingId--;
        }else{
            System.out.println("Room is not available for the selected date.");
        }
    }
}

class User{
    private int userId;
    private String name;

    public User(int userId, String name){
        this.userId = userId;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getUserId(){
        return userId;
    }
}