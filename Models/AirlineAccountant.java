package models;
public class AirlineAccountant extends Person
{
    private String airlineId;

    public AirlineAccountant(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, String airlineId)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role);
        this.airlineId = airlineId;
    }

    public String getAirlineId()
    {
        return airlineId;
    }
}
