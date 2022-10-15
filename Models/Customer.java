package models;
import java.util.ArrayList;

public class Customer extends Person
{
    public String getNationality()
    {
        return nationality;
    }

    public ArrayList<Booking> getBookingList()
    {
        return bookingList;
    }

    private String nationality;
    private ArrayList<Booking> bookingList;
    public Customer(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, String nationality, ArrayList<Booking> bookingList)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role);
        this.nationality = nationality;
        this.bookingList = bookingList;
    }


}
