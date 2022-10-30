package models.dataStructure;

import models.data.Flight;
import models.data.Passenger;
import models.data.Ticket;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tickets implements Serializable {
    List<Ticket> tickets = new ArrayList<>();

    void addTicket(int ID, List<Flight> flights, List<Passenger> passengers) {
        Ticket t = new Ticket(ID, flights, passengers);
        tickets.add(t);
    }

    void deleteTicketByID(int ticketID) {
        tickets.removeIf(ticket -> ticket.ID() == ticketID);
    }

    void updateTicketByID(int ticketID, Ticket ticket) {
        tickets.removeIf(t -> t.ID() == ticketID);
        tickets.add(ticket);
    }
}
