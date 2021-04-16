package com.hotelregistration;

import comm.hotelregistration.HotelRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelRegistrationTest {
   HotelRegistration hotelRegistration = new HotelRegistration();

    @Test
    public void givenHotelNameAndRateForRegularCustomerShouldBeTrue() {
        boolean result = hotelRegistration.addHotel("Sai",955.0);
        Assertions.assertTrue(result);
    }
}
