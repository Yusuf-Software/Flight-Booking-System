package models.data;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable
{
    private String firstName, lastName, email, username, password, phoneNo;
    private String Id;
    private Role role;

    // Agency Admin, Agency Sales Person
    private Agency agency = null;

    // Airline Manager, Airline Admin, Airline Sales Person, Airline Accountant
    private Airline airline = null;

    // Airline and Agency Sales Person
    private double point;
    private Image profilePic;

    // Customer
    private String nationality = null;
    private ArrayList<Booking> bookingList = null; // Customer & Airline+Agency Sales Person


    public Person(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Agency agency, String nationality, Double point, Image profilePic)
//    public Person(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Agency agency, String nationality, ArrayList<Booking> bookingList, Double point, Image profilePic)
//    ArrayList<Booking> is removed due to redundency
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Id = Id;
        this.phoneNo = phoneNo;
        this.role = role;

        if (role.name().contains("AIRLINE")) //Checking if the role contains AIRLINE (i.e. AIRLINE_MANAGER, AIRLINE_ADMIN, AIRLINE_SALES_PERSON, AIRLINE_ACCOUNTANT)
            this.airline = airline;

        if (role.name().contains("AGENCY")) //Checking if the role contains AIRLINE (i.e. AGENCY_ADMIN, AGENCY_SALES_PERSON)
            this.agency = agency;

        if (role.name().contains("SALES_PERSON")) //Checking if the role contains SALES_PERSON (i.e. AGENCY_SALES_PERSON, AIRLINE_SALES_PERSON)
        {
            this.point = point;
            this.profilePic = profilePic;
            this.bookingList = bookingList;
        }

        if (role.name().equals("CUSTOMER")) //Checking if the role contains is CUSTOMER
        {
            this.nationality = nationality;
            this.bookingList = bookingList;
        }
    }
}
//enum Role
//{
//    CUSTOMER, AIRLINE_MANAGER, AIRLINE_ADMIN,
//    AIRLINE_SALES_PERSON, AIRLINE_ACCOUNTANT,
//    AGENCY_ADMIN, AGENCY_SALES_PERSON
//}
