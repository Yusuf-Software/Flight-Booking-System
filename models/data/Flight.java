package models.data;

import java.io.Serializable;
import java.util.List;

public record Flight(int ID, String flightNo, Airline airline, int seatCapacity, List<Seat> seats, List<Schedule> schedule) implements Serializable {

}

//    ID
//            String Flight No
//            Airline company
//            int SeatCapacity
//            List<Seat> seat
//        List<Schedule> schedule