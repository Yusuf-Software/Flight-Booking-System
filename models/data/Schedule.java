package models.data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

//public record Schedule(Flight flight, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Status status, List<FlightSeat> fare) {
//
//}

public class Schedule implements Serializable {
    Flight flight;
    Airport departureAirport;
    Airport arrivalAirport;
    LocalDateTime departureDateTime;
    LocalDateTime arrivalDateTime;
    Status status;
    List<FlightSeat> fare;

    public Schedule(Flight flight, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Status status, List<FlightSeat> fare){
        this.flight = flight;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.status = status;
        this.fare = fare;
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