package za.ac.cput.domain;

import java.util.Objects;
// Mlungisi L. Mbuyazi
// 221164014
// https://github.com/Skiet88/AirWonderFlightBookingApplication
public class Aircraft {
    private String aircraftID;
    private String aircraftType;
    private int numberOfSeats;

    public Aircraft(AircraftBuilder aircraftBuilder) {
        this.aircraftID = aircraftBuilder.aircraftID;
        this.aircraftType = aircraftBuilder.aircraftType;
        this.numberOfSeats = aircraftBuilder.numberOfSeats;
    }


    public String getAircraftID() {
        return aircraftID;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return numberOfSeats == aircraft.numberOfSeats && Objects.equals(aircraftID, aircraft.aircraftID) && Objects.equals(aircraftType, aircraft.aircraftType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aircraftID, aircraftType, numberOfSeats);
    }
    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftID='" + aircraftID + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }

    public static class AircraftBuilder {
        private String aircraftID;
        private String aircraftType;
        private int numberOfSeats;


        public AircraftBuilder setAircraftID(String aircraftID) {
            this.aircraftID = aircraftID;
            return this;
        }
        public AircraftBuilder setAircraftType(String aircraftType) {
            this.aircraftType = aircraftType;
            return this;
        }
        public AircraftBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }
        public AircraftBuilder copy(Aircraft aircraft) {
            this.aircraftID = aircraft.aircraftID;
            this.aircraftType = aircraft.aircraftType;
            this.numberOfSeats = aircraft.numberOfSeats;

            return this;
        }
        public Aircraft build(){

            return new Aircraft(this);
        }



    }
}
