package com.hotelregistration;

import comm.hotelregistration.HotelRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelRegistrationTest {
   HotelRegistration hotelRegistration = new HotelRegistration();

    @Test
    public void givenHotelNameAndRateForRegularCustomerShouldBeTrue() {
        boolean result = hotelRegistration.addHotel("Lakewood",955.0);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFindCheapestHotelShouldReturnBookingDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy");
        String date[] = {"10Sep2020", "11Sep2020"};

        Date[] inputDate = null;

        try {
            inputDate = new Date[]{simpleDateFormat.parse(date[0]),simpleDateFormat.parse(date[1])};
        } catch (ParseException exception) {
            System.out.println("Invalid Format");
            if (!simpleDateFormat.format(date).equals(inputDate)) {
                System.out.println("Date is invalid ");
            } else {
                System.out.println("Date is valid");

                boolean result = hotelRegistration.addHotel("Lakewood", 950.0) &&
                                 hotelRegistration.addHotel("Ridgewood", 1000.0);
                if (result)
                    Assertions.assertEquals("Lakewood",hotelRegistration.findCheapestHotel(inputDate));
            }
        }
    }

    @Test
    public void givenWeekdayAndWeekendRatesForHotelsWhenAddedShouldReturnTrue() {
            boolean result = hotelRegistration.addHotelRating("Lakewood", 110.0, 90.0) &&
                             hotelRegistration.addHotelRating("Bridgewood", 150.0, 50.0) &&
                             hotelRegistration.addHotelRating("Ridgewood", 220.0, 150.0);
            Assertions.assertTrue(result);
    }

    @Test
    public void givenRatingsForHotelsWhenAddedThenReturnTrue() {
            boolean result = hotelRegistration.addHotelRatings("Lakewood", 3) &&
                             hotelRegistration.addHotelRatings("Bridgewood", 4) &&
                             hotelRegistration.addHotelRatings("Ridgewood", 5);
            Assertions.assertTrue(result);
    }
}
