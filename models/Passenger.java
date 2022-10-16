package models;
import java.util.Date;

public class Passenger extends Person
{
    private String Id ,nationality, passportNo;

    public String getId()
    {
        return Id;
    }

    public String getNationality()
    {
        return nationality;
    }

    public String getPassportNo()
    {
        return passportNo;
    }

    public Gender getGender()
    {
        return gender;
    }

    public Date getDOB()
    {
        return DOB;
    }

    private Gender gender;
    private Date DOB;

    public Passenger(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, String Id, String nationality, String passportNo, Gender gender, Date DOB)
    {
        super(firstName, lastName, email, username, password, Id, phoneNo, role);
        this.Id = Id;
        this.nationality = nationality;
        this.passportNo = passportNo;
        this.gender = gender;
        this.DOB = DOB;
    }
}

enum Gender{MALE, FEMALE}
