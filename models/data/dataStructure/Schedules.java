package models.dataStructure;

import models.data.Airport;
import models.data.Flight;
import models.data.FlightSeat;
import models.data.Schedule;
import java.time.LocalDateTime;
import java.util.List;

public class Schedules {
    List<Schedule> schedules;


    //Schedule(Flight flight, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Status status, List<FlightSeat> fare)
//    void addSchedule(Flight flight, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Status status, List<FlightSeat> fare){
//        Schedule s = new Schedule(flight, departureAirport, arrivalAirport, departureDateTime, arrivalDateTime, status, fare);
//    }

    void addSchedule(Flight flight, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Schedule.Status status, List<FlightSeat> fare){
        Schedule s = new Schedule(flight, departureAirport, arrivalAirport, departureDateTime, arrivalDateTime, status, fare);
        schedules.add(s);
    }



}

