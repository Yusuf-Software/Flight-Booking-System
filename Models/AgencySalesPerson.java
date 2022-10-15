package models;
import java.awt.*;

public class AgencySalesPerson extends AirlineSalesPerson
{
    private String agencyId;

    public AgencySalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, String airlineId, double point, ArryaList<Booking> bookingList, Image profilePic, String agencyId)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role, airlineId, point, bookingList, profilePic);
        this.agencyId = agencyId;
    }

    public String get()
    {
        return agencyId;
    }
}

