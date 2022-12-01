package views;

import models.data.Flight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AgencyView {

    static void login(PrintWriter out, BufferedReader in) throws IOException {
        boolean flag = true;
        while (flag) {
            out.println("press 1 for login as Agency Admin \npress 2 for login as Agency Sales Person \npress 3 to go back");

            out.println("k");
            String c;
            c = in.readLine();
            switch (c) {
                case "1":
                    out.println("Agency Admin Login successful");
                    AgencyAdminView.menu(out, in);
                    break;
                case "2":
                    out.println("Agency Sales Person Login successful");
                    AgencySalesPersonView.menu(out, in);
                    break;
                case "3":
                    out.println("Going back");
                    flag = false;
                    MainView.menu(out, in);
                    break;
                default:
                    out.println("Invalid choice");
                    break;
            }
        }
    }

    static void signUp(PrintWriter out, BufferedReader in) {
            out.println("Agency Sign Up successful");
    }

}