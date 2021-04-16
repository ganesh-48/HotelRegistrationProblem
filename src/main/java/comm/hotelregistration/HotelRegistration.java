package comm.hotelregistration;

import java.util.ArrayList;
import java.util.List;

public class HotelRegistration {
    List<Hotel> hotelList = new ArrayList<>();
    public boolean addHotel(String name, Double rate) {
        Hotel hotel = new Hotel(name, rate);
        return hotelList.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to hotel registration");
    }
}
