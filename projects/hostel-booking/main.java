import java.util.*;
class Room extends Hostel{
    private int roomnum;
    private String roomtype,status;
    private double price;
    private boolean availability;

    void checkAvailability(){
        
    }
    void bookroom(){

    }
}
class Booking{
    private int bookingId, roomnum;
    private int checkin,checkout;
    User user;
}
class Hostel{
    List<int> rooms = new ArrayList<>();
    
    
}
class User{
    String name, idno;
    int age;

    void checkHistory(){

    }
    void cancelBooking(){

    }
}