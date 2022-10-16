package models;
import java.awt.*;
import java.util.ArrayList;

public class SalesPerson extends Person
{

    protected double point;
    protected ArrayList<Booking> bookingList;
    protected Image profilePic;
    public SalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Double point, ArrayList<Booking> bookingList, Image profilePic)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role);
        this.point = point;
        this.bookingList = bookingList;
        this.profilePic = profilePic;
    }
    public double getPoint()
    {
        return point;
    }

    public ArrayList<Booking> getBookingList()
    {
        return bookingList;
    }

    public Image getProfilePic()
    {
        return profilePic;
    }

}

