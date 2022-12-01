package models.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public record Flight(int ID, String flightNo, Airline airline, int seatCapacity) implements Serializable {

    public static void searchAsCustomer(PrintWriter out, BufferedReader in) throws IOException {
        out.println("Searching as customer");
    }

    public static void searchAsAgency(PrintWriter out, BufferedReader in) throws ParseException, IOException, ClassNotFoundException, SQLException{
        out.println("Searching as agency");
    }
}

//    ID
//            String Flight No
//            Airline company
//            int SeatCapacity
//            List<Seat> seat
//        List<Schedule> schedule