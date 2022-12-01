package views;

import views.AgencyView;
import models.data.Flight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MainView {

    public static void menu(PrintWriter out, BufferedReader in)
            throws IOException {
        String c;
//        do {
            out.println("Welcome to the  FRS");
            out.println("------------------------------------");
            out.println("Choose On bellow options");
            out.println("press 1 for login \npress 2 for signup \npress 3 for search \npress 4 for exit");
            out.println("k");

            c = in.readLine();
            switch (c) {
                case "1":
//                    out.println("press 1 to Login as customer \npress 2 to Login as agency");
                    out.println("press 1 to Login as agency");
                    out.println("k");
                    String choice1 = in.readLine();
                    switch (choice1)
                    {
                        case "1":
//                            CustomerView.login(out, in);
                            AgencyView.login(out, in);
//                            CustomerView.login(out, in);
                            break;
//                        case "2":
//                            AgencyView.login(out, in);
//                            break;
                        default:
                            out.println("Invalid choice");
                            break;
                    }

                    break;
                case "2":
//                    out.println("press 1 to signup as customer \npress 2 to signup as agency");
                    out.println("press 1 to signup as agency");
                    out.println("k");
                    String choice2 = in.readLine();
                    switch (choice2)
                    {
                        case "1":
                            // CustomerView.signUp();
                            AgencyView.signUp(out, in);
                            break;
//                        case "2":
//                            AgencyView.signUp(out, in);
//                            break;
                        default:
                            out.println("Invalid choice");
                            break;
                    }
                    break;
                case "3":
                    AgencySearchView.menu(out, in);
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    out.println("Invalid choice");

            }
//        } while (c != "4");
    }
}