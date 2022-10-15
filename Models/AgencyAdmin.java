package models;
public class AgencyAdmin extends Person
{
    private String agencyId;
    public AgencyAdmin(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, String agencyId)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role);
        this.agencyId = agencyId;
    }

    public String getAgencyId()
    {
        return agencyId;
    }
}
