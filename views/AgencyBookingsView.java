package views;

import models.data.Flight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AgencyBookingsView {
    public static void menu(PrintWriter out, BufferedReader in) throws IOException {
        out.println("This shows list of bookings");
    }
}
