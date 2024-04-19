package za.ac.cput.factory;


import za.ac.cput.domain.Aircraft;
import za.ac.cput.domain.Flight;
import za.ac.cput.util.FlightHelper;

import java.time.LocalDateTime;

public class FlightFactory{
    public static Flight buildAircraft(String flightNumber, String departureAirport, String destinationAirport, LocalDateTime departureTime, LocalDateTime arrivalTime, Aircraft aircraft){
        if (FlightHelper.isEmpty(flightNumber) || FlightHelper.isEmpty(departureAirport) || FlightHelper.isEmpty(destinationAirport) || FlightHelper.isDateNull(departureTime) || FlightHelper.isDateNull(arrivalTime) || FlightHelper.isAircraftNull(aircraft) ){
            return null;
        }
        return new Flight.FlightBuilder().setFlightNumber(flightNumber)
                .setDepartureAirport(departureAirport)
                .setDestinationAirport(destinationAirport)
                .setDepartureTime(departureTime)
                .setArrivalTime(arrivalTime)
                .setAircraft(aircraft)
                .build();
    }
}
