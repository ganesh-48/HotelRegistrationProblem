package comm.hotelregistration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*@Description-Welcome to the hotel registration problem
* Add hotel name and rate
*/
public class HotelRegistration {

    List<Hotel> hotelList = new ArrayList<>();
    /*Add hotel name and rate
    */
    public boolean addHotel(String name, Double rate) {
        Hotel hotel = new Hotel(name, rate);
        return hotelList.isEmpty();
    }


    /*Starting with Welcome to to hotel registration */
    public static void main(String[] args) {
        System.out.println("Welcome to hotel registration");
    }

    public String findCheapestHotel(Date[] inputDate) {
        ArrayList<Double> cheapRateHotel =  new ArrayList<>();
        for(Hotel hotel : hotelList) {
            Double rate = 0.0;
            for (Date date : inputDate) {
                rate = hotel.getRates();
            }
            cheapRateHotel.add(rate);
        }
        Double cheap = cheapRateHotel.stream().min(Comparator.comparing(Double :: doubleValue)).orElse(null);
        int index = cheapRateHotel.indexOf(cheap);
        return hotelList.get(index).getName();
    }
}
