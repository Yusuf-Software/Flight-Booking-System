package models.dataStructure;

import models.data.City;
import models.data.Client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Clients implements Serializable {
    List<Client> clients = new ArrayList<>();

    void addClient(int ID, String type) {
        Client c = new Client(ID, type);
        clients.add(c);
    }

    void removeClient(int ID) {
        clients.removeIf(client -> client.ID() == ID);
    }

//    void updateClientByID(int cityID, City city) {
//        cities.removeIf(c -> c.ID() == cityID);
//        cities.add(city);
//    }


    void updateClientByID(int clientID, Client client) {
        clients.removeIf(c -> c.ID() == clientID);
        clients.add(client);
    }


    Client getClient(int ID) {
        for (Client c : clients) {
            if (c.ID() == ID) {
                return c;
            }
        }
        return null;
    }

    List<Client> getClients() {
        return clients;
    }

    void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
