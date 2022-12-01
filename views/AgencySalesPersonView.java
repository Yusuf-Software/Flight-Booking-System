package views;

import models.data.Flight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

public class AgencySalesPersonView {

    public static void menu(PrintWriter out, BufferedReader in) throws IOException {
        boolean flag = true;

        while (flag){
            String c;

            out.println("Choose On bellow options to Login to the system  :");
            out.println("1- Search");
            out.println("2- Manage Bookings");
            out.println("3- Add Balance");
            out.println("4- Logout");
            out.println("5- Exit");
            out.println("k");
            c = in.readLine();

            switch (c) {
                case "1":
                    out.println("Search");
                    AgencySearchView.menu(out, in);
                    break;
                case "2":
                    out.println("Manage Bookings");
                    AgencyBookingsView.menu(out, in);
                    break;
                case "3":
                    out.println("Request Balance");
                    AgencyRequestBalanceView.menu(out, in);
                    break;
                case "4":
                    out.println("Logging out");
                    flag = false;
                    MainView.menu(out, in);
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    out.println("Choose on of the above options to start !");
                    break;
            }
        }
    }
}
