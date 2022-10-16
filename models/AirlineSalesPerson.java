package models;
import java.awt.*;
import java.util.ArrayList;

public class AirlineSalesPerson extends SalesPerson
{
    private Airline airline;
    public AirlineSalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Double point, ArrayList<Booking> bookingList, Image profilePic, Airline airline)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role, point, bookingList, profilePic);
        this.airline = airline;
    }
}