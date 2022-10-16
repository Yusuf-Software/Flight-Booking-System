package models;
import java.awt.*;
import java.util.ArrayList;

public class AgencySalesPerson extends SalesPerson
{
    private Agency agency;
    public AgencySalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Double point, ArrayList<Booking> bookingList, Image profilePic, Agency agency)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role, point, bookingList, profilePic);
        this.agency = agency;
    }
}






