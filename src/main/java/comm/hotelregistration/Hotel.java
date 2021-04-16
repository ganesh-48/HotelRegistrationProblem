package comm.hotelregistration;

public class Hotel {
    private final Double weekendRates;
    private final int ratings;
    private String hotelName;
    private  Double rate;



    public Hotel(String hotelName, Double rate) {
        this.hotelName =hotelName;
        this.rate = rate;
        this.weekendRates = null;
        ratings = 0;
    }

    public Hotel(String hotelName, Double rate, Double weekendRates, int ratings) {
        this.hotelName = hotelName;
        this.rate = rate;
        this.weekendRates = weekendRates;
        this.ratings = ratings;
    }

        public Double getRates() {
        return rate;
    }

    public String getName() {
        return hotelName;
    }

    public Double getWeekendRates() {
        return weekendRates;
    }
}
