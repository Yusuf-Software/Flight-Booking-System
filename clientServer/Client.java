package clientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket("localhost", 6000);
            System.out.println("connected to: " + echoSocket);
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        out = new PrintWriter(echoSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream())); //conection

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)); //scanner
        String userInput;
        System.out.println("connected");

        while ((userInput = in.readLine()) != null) {
            boolean isServerAskForInput = userInput.equals("k");
            if (isServerAskForInput) { // 1 if send then is ask for input from client
                System.out.print("client : ");
                out.println(stdIn.readLine());
            }
            if (!isServerAskForInput) System.out.println("-" + userInput);

            if (userInput.equals("exit")) {
                System.exit(1);
                break;
            }
        }

        out.close();
        in.close();
        stdIn.close();
        echoSocket.close();
    }
}