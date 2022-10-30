package models.dataStructure;

import models.data.Booking;
import models.data.Client;
import models.data.Ticket;

import java.util.List;

public class Bookings {
    List<Booking> bookings;

    void addBooking(int ID, String PNR, List<Ticket> tickets, Client client) {
        Booking b = new Booking(ID, PNR, tickets, client);
        bookings.add(b);
    }

    void deleteBookingByID(int bookingID) {
        bookings.removeIf(booking -> booking.ID() == bookingID);
    }

    void updateBookingByID(int bookingID, Booking booking) {
        bookings.removeIf(b -> b.ID() == bookingID);
        bookings.add(booking);
    }

    List<Booking> getBookings() {
        return bookings;
    }

    int getBookingCount() {
        return bookings.size();
    }

    List<String> getBookingPNRs() {
        List<String> bookingPNRs = null;
        bookings.forEach(booking -> bookingPNRs.add(booking.PNR()));
        return bookingPNRs;
    }
}

