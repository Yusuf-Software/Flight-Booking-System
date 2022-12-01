package clientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.DriverManager;

public class ServerLunch {
//    private static final String URL="jdbc:mysql://localhost:3306/car_registration_and_fines";
//    private static final String USERNAME="sqluser";
//    private static final String PASSWORD="password";
    public static void main(String[] args) {
//        dataBaseConnection();
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            while (true) {
                new Server(serverSocket.accept()).start();
                //                Socket socket = serverSocket.accept(); //accept
                //                Echoer echoer = new Echoer(socket);
                //                echoer.start();
            }
        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }
    }
//    private static void dataBaseConnection(){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        } catch (Exception e) {
//
//            System.err.println(e);
//
//        }
//    }
}