package models;

import java.awt.*;
import java.util.ArrayList;

public class Person
{
    protected String firstName, lastName, email, username, password, phoneNo;
    protected String Id;
    protected Role role;

    // Agency Admin, Agency Sales Person
    protected Agency agency = null;

    // Airline Manager, Airline Admin, Airline Sales Person, Airline Accountant
    private Airline airline = null;

    // Airline and Agency Sales Person
    protected double point;
    protected Image profilePic;

    // Customer
    private String nationality = null;
    private ArrayList<Booking> bookingList = null; // Customer & Airline+Agency Sales Person


    public Person(String firstName, String lastName, String email, String username, String password, String Id, String phoneNo, Role role, Airline airline, Agency agency, String nationality, ArrayList<Booking> bookingList, Double point, Image profilePic)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Id = Id;
        this.phoneNo = phoneNo;
        this.role = role;

        if (role.role.contains("AIRLINE")) //Checking if the role contains AIRLINE (i.e. AIRLINE_MANAGER, AIRLINE_ADMIN, AIRLINE_SALES_PERSON, AIRLINE_ACCOUNTANT)
            this.airline = airline;

        if (role.role.contains("AGENCY")) //Checking if the role contains AIRLINE (i.e. AGENCY_ADMIN, AGENCY_SALES_PERSON)
            this.agency = agency;

        if (role.role.contains("SALES_PERSON")) //Checking if the role contains SALES_PERSON (i.e. AGENCY_SALES_PERSON, AIRLINE_SALES_PERSON)
        {
            this.point = point;
            this.profilePic = profilePic;
            this.bookingList = bookingList;
        }

        if (role.role.equals("CUSTOMER")) //Checking if the role contains is CUSTOMER
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
