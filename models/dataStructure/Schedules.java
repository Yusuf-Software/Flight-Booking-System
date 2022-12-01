package models.dataStructure;

import models.data.Airport;
import models.data.Flight;
import models.data.FlightSeat;
import models.data.Schedule;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedules implements Serializable {
    List<Schedule> schedules = new ArrayList<>();

    void addSchedule(Flight flight, Airport departureAirport, Airport arrivalAirport, Date departureDateTime, Date arrivalDateTime, Schedule.Status status, List<FlightSeat> fare){
        Schedule s = new Schedule(flight, departureAirport, arrivalAirport, departureDateTime, arrivalDateTime, status);
        schedules.add(s);
    }

    void searchSchedule(String departureAirport, String arrivalAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime){
        for (Schedule s : schedules) {
            if (s.getDepartureAirport().equals(departureAirport) && s.getArrivalAirport().equals(arrivalAirport) && s.getDepartureDateTime().equals(departureDateTime) && s.getArrivalDateTime().equals(arrivalDateTime)) {
                System.out.println(s);
            }
        }
    }
}

