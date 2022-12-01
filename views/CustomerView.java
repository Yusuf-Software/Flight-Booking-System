package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

public class CustomerView {

    static void login(PrintWriter out, BufferedReader in)
            throws ParseException, IOException, ClassNotFoundException, SQLException {
        out.println("Customer Login successful");

    }

    static void signUp(PrintWriter out, BufferedReader in)
            throws ParseException, IOException, ClassNotFoundException, SQLException {
        out.println("Customer Sign Up successful");
    }

}