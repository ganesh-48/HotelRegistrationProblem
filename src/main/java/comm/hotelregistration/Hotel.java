package comm.hotelregistration;

public class Hotel {
    private final Double weekendRates;
    private String hotel;
    private  Double rate;

    public Hotel(String hotelName, Double rate) {
        this.hotel =hotelName;
        this.rate = rate;
        this.weekendRates = null;

    }

    public Hotel(String hotelName, Double rate, Double weekendRates) {
        this.hotel = hotelName;
        this.rate = rate;
        this.weekendRates = weekendRates;
    }
    public Double getRates() {
        return rate;
    }

    public String getName() {
        return hotel;
    }

    public Double getWeekendRates() {
        return weekendRates;
    }
}
