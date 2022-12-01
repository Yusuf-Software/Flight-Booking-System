package views;

import models.data.Flight;
import models.dataStructure.Schedules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AgencySearchView {
    public static void menu(PrintWriter out, BufferedReader in) throws IOException {
        out.println("Enter Departure Airport: ");
        out.println("k");
        String depAirport = in.readLine();

        out.println("Enter Destination Airport: ");
        out.println("k");
        String destAirport = in.readLine();

        out.println("Enter Departure Date: ");
        out.println("k");
        String depDate = in.readLine();

        out.println("Enter Return Date: ");
        out.println("k");
        String retDate = in.readLine();

        out.println("Enter Number of Passengers: ");
        out.println("k");
        int numPassengers = Integer.parseInt(in.readLine());
    }
}
