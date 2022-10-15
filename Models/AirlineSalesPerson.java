package models;
import java.awt.*;


public class AirlineSalesPerson extends Person
{
    private String airlineId;

    protected double point;
    protected ArrayList<Booking> bookingList;
    protected Image profilePic;

    public AirlineSalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, String airlineId, double point, ArryaList<Booking> bookingList, Image profilePic)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role);
        this.airlineId = airlineId;
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

