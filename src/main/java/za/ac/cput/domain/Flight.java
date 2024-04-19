package za.ac.cput.domain;
import java.time.LocalDateTime;
import java.util.Objects;

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

    public Flight(FlightBuilder flightBuilder) {
        this.flightNumber = flightBuilder.flightNumber;
        this.departureAirport = flightBuilder.departureAirport;
        this.destinationAirport = flightBuilder.destinationAirport;
        this.departureTime = flightBuilder.departureTime;
        this.arrivalTime = flightBuilder.arrivalTime;
        this.aircraft = flightBuilder.aircraft;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(destinationAirport, flight.destinationAirport) && Objects.equals(departureTime, flight.departureTime) && Objects.equals(arrivalTime, flight.arrivalTime) && Objects.equals(aircraft, flight.aircraft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, departureAirport, destinationAirport, departureTime, arrivalTime, aircraft);
    }

    public static class FlightBuilder{
        private String flightNumber;
        private String departureAirport;
        private String destinationAirport;
        private LocalDateTime departureTime;
        private LocalDateTime arrivalTime;
        private Aircraft aircraft;

        public FlightBuilder setFlightNumber(String flightNumber){
            this.flightNumber = flightNumber;
            return this;

        }
        public FlightBuilder setDepartureAirport(String departureAirport){
            this.departureAirport = departureAirport;
            return this;

        }
        public FlightBuilder setDestinationAirport(String destinationAirport){
            this.destinationAirport = destinationAirport;
            return this;

        }
        public FlightBuilder setDepartureTime(LocalDateTime departureTime){
            this.departureTime = departureTime;
            return this;

        }
        public FlightBuilder setArrivalTime(LocalDateTime arrivalTime){
            this.departureTime = arrivalTime;
            return this;

        }
        public FlightBuilder setAircraft(Aircraft aircraft){
            this.aircraft = aircraft;
            return this;

        }
        public Flight build(){
            return new Flight(this);

        }


    }
}