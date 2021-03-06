package comm.hotelregistration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*@Description-Welcome to the hotel registration problem
* Add hotel name and rate
* Find cheapest hotel in all hotels list
* from given date find a cheapest hotel for reservation
* Add the Weekday and weekend rates for each hotel
* Add rating to each hotel
*/
public class HotelRegistration {

    /*Starting with Welcome to to hotel registration */
    public static void main(String[] args) {
        System.out.println("Welcome to hotel registration");
    }

    List<Hotel> hotelList = new ArrayList<>();
    /*Add hotel name and rate
    */
    public boolean addHotel(String name, Double rate) {
        Hotel hotel = new Hotel(name, rate);
        return hotelList.isEmpty();
    }

    /*find cheapest hotel for a given date range */
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

    /*Add the Weekday and weekend rates for each hotel*/
    public boolean addHotelRating(String hotelName, Double weekday, Double weekend) {
        Hotel hotel = new Hotel(hotelName, weekday);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }

    /*Add rating to each hotel*/
    public boolean addHotelRatings(String hotelName, int ratings) {
        Hotel hotel = new Hotel(hotelName, (double) ratings);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }
}
