package safwa_project;
import java.util.ArrayList;
import java.util.List;
public class Guest {
    protected String guest_name;
    protected String guest_phone_number;
    protected List<Reservation> reservation_histo;          //Rservation da 2sm elclass bta3 el7agz 

    public Guest(String guest_name, String guest_phone_number) {
        this.guest_name = guest_name;
        this.guest_phone_number = guest_phone_number;
        this.reservation_histo=new ArrayList<>();
    }
    public void registerReservation(Reservation reservation) {
        reservation_histo.add(reservation);                 // hena b3ml save le taree5 el guest  
    }

    public void checkIn(Room room) {
        room.check_in();
        System.out.println(guest_name + " has checked in to room " + room.room_num);
    }

    public void checkOut(Room room) {
        room.check_out();
        System.out.println(guest_name + " has checked out of room " + room.room_num);
    }
}
