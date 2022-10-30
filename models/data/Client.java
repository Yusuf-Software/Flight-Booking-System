package models.data;

import java.io.Serializable;

public record Client(int ID, String type) implements Serializable {}



// Client types to be created to be created

//    enum Client{AGENCY_SALES_PERSON, AIRLINE_SALES_PERSON, CUSTOMER}

//    Agency Sales Person
//    Airline Sales
//    Customer