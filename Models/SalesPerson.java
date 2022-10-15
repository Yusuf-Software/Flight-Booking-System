import java.awt.*;

public class SalesPerson extends AirlineSalesPerson
{

    public SalesPerson(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, String airlineId, double point, ArryaList<Booking> bookingList, Image profilePic)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role, airlineId, point, bookingList, profilePic);
    }
}
