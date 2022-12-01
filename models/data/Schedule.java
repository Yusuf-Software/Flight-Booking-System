package models.data;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

//public record Schedule(Flight flight, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Status status, List<FlightSeat> fare) {
//
//}

public class Schedule implements Serializable {
    Flight flight;
    Airport departureAirport;
    Airport arrivalAirport;
    Date departureDateTime;
    Date arrivalDateTime;
    Status status;
//    List<FlightSeat> fare;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public Date getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(Date arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

//    public List<FlightSeat> getFare() {
//        return fare;
//    }
//
//    public void setFare(List<FlightSeat> fare) {
//        this.fare = fare;
//    }

    public Schedule(Flight flight, Airport departureAirport, Airport arrivalAirport, Date departureDateTime, Date arrivalDateTime, Status status){
        this.flight = flight;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.status = status;
    }

    public enum Status{
        DELAY, ONTIME, CANCELLED
    }
}




//    Schedule (R)
//    Flight
//    Departure Airport ID
//    Arrival Airport ID
//    Departure DateTime
//    Arrival DateTime
//    Status
//    List<FlightSeat> fare



//    DELAY
//    ONTIME
//    CANCELLED