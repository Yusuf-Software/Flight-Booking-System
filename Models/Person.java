package models;

public abstract class Person
{
    protected String firstName, lastName, email, username, password, phoneNo;
    protected String Id;
    protected Role role;

    public Person(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Id = Id;
        this.phoneNo = phoneNo;
        this.role = role;
    }
}
enum Role
{
    CUSTOMER, AIRLINE_MANAGER, AIRLINE_ADMIN,
    AIRLINE_SALES_PERSON, AIRLINE_ACCOUNTANT,
    AGENCY_ADMIN, AGENCY_SALES_PERSON
}
