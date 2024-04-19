package za.ac.cput.domain;
import java.time.LocalDateTime;
// Mlungisi L. Mbuyazi
// 221164014
// https://github.com/Skiet88/AirWonderFlightBookingApplication
public class Flight {

    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Aircraft aircraft;


    public Flight(String flightNumber, String departureAirport, String destinationAirport, LocalDateTime departureTime, LocalDateTime arrivalTime, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }


    public Aircraft getAircraft() {
        return aircraft;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", aircraft=" + aircraft +
                '}';
    }
}