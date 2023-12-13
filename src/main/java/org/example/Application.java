package org.example;

import org.example.entities.Client;
import org.example.entities.Planet;
import org.example.services.ClientCrudService;
import org.example.services.PlanetCrudService;


import java.util.List;

public class Application {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();

        Client newClient = new Client();
        newClient.setName("Din Winchester");
        Client secondClient = new Client();
        secondClient.setId(4L);
        secondClient.setName("Sam Winchester");

        clientService.createClient(newClient);
        clientService.deleteClientById(6L);
        clientService.updateClient(secondClient);

        Client client = clientService.getClientById(9L);
        System.out.println("client = " + client);
        Client palpatine = clientService.getClientById(10L);

        clientService.deleteClient(palpatine);

        List<Client> clients = clientService.getAllClients();
        System.out.println("clients = " + clients.toString());

        System.out.println("----------------------------");

        PlanetCrudService planetService = new PlanetCrudService();

        Planet newPlanet = new Planet();
        newPlanet.setId("EARTH");
        newPlanet.setName("Earth");
        Planet planetCoruscant = new Planet();
        planetCoruscant.setId("NAB007");
        planetCoruscant.setName("Coruscant");

        planetService.createPlanet(newPlanet);
        planetService.updatePlanet(planetCoruscant);
        planetService.deletePlanetById("HOTH");
        Planet planetEndor = planetService.getPlanetById("ENDOR");
        System.out.println("planetEndor = " + planetEndor);
        planetService.deletePlanet(planetEndor);
        List<Planet> planets = planetService.getAllPlanets();
        System.out.println("planets = " + planets.toString());
    }
}