package models; //package models;

import java.util.List;

public record Booking(int ID, String PNR, List<Ticket> tickets, Client client) {

}

//    Booking (R)
//    Booking ID
//    PNR
//    Ticket<List>
//    Client

//    Moved to Client Class
//    enum Client{AGENCY_SALES_PERSON, AIRLINE_SALES_PERSON, CUSTOMER}
//
//    //    Agency Sales Person
//    //    Airline Sales
//    //    Customer