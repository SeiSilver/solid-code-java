package com.silver.dip.after;

public class Main {
    public static void main(String[] args) {
        var repo = new FileFlightRepository("src/main/resources/flights.csv");
        var airportInfo = new AirportFlightInformation(repo);

        System.out.println("ALL");
        airportInfo.displayFlights();

        System.out.println("GO TO GATE");
        airportInfo.displayGoToGateFlights();
    }
}
