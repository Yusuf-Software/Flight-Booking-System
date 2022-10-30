package models.data;
import java.io.Serializable;
import java.util.Date;

public class Passenger implements Serializable
{
    private String Id ,nationality, passportNo, firstName, surname, phoneNo, email, gender;
//    private final Gender gender;
    private final Date DOB;

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
    public String getFirstName()
    {
        return firstName;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getPhone()
    {
        return phoneNo;
    }
    public String getEmail()
    {
        return email;
    }
    public String getGender()
    {
        return gender;
    }
    public Date getDOB()
    {
        return DOB;
    }
    public Passenger(String firstName, String surname, String email, String username, String password, String Id, String phoneNo, Role role, String nationality, String passportNo, String gender, Date DOB)
    {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.Id = Id;
        this.phoneNo = phoneNo;
        this.nationality = nationality;
        this.passportNo = passportNo;
        this.gender = gender;
        this.DOB = DOB;
    }
}

//enum Gender{MALE, FEMALE}
