package comm.hotelregistration;

public class Hotel {
    private String hotel;
    private  Double rate;

    public Hotel(String hotelName, Double rate) {
        this.hotel =hotelName;
        this.rate = rate;
    }

    public Double getRates() {
        return rate;
    }

    public String getName() {
        return hotel;
    }
}
