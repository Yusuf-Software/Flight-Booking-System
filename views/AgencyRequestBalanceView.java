package views;

import models.data.Flight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AgencyRequestBalanceView {

    public static void menu(PrintWriter out, BufferedReader in) throws IOException {
        int c;

        out.println("Amount of balance to add:");
        out.println("k");
        c = Integer.parseInt(in.readLine());
        out.println(c + " Balance added");
    }
}
