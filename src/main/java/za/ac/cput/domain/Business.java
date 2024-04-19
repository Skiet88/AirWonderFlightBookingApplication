package za.ac.cput.domain;

import java.util.Objects;

/* Cavan Swartz
   221055835
   16 April 2024
   Class.java
   SubClass

 */

public class Business extends FlightClass {
    private String luxuryAmenities;
    private String exclusiveServices;
    private boolean priorityCheckIn;
    private boolean loungeAccess;
    private boolean flatBedSeats;
    private String dedicatedCabinCrew;

    //public Business() {}

    private Business(Builder builder){
        super();
    }

    public static class Builder extends FlightClass {
        private String luxuryAmenities;
        private String exclusiveServices;
        private boolean priorityCheckIn;
        private boolean loungeAccess;
        private boolean flatBedSeats;
        private String dedicatedCabinCrew;

        public void setLuxuryAmenities(String luxuryAmenities) {
            this.luxuryAmenities = luxuryAmenities;
        }

        public void setExclusiveServices(String exclusiveServices) {
            this.exclusiveServices = exclusiveServices;
        }

        public void setPriorityCheckIn(boolean priorityCheckIn) {
            this.priorityCheckIn = priorityCheckIn;
        }

        public void setLoungeAccess(boolean loungeAccess) {
            this.loungeAccess = loungeAccess;
        }

        public void setFlatBedSeats(boolean flatBedSeats) {
            this.flatBedSeats = flatBedSeats;
        }

        public void setDedicatedCabinCrew(String dedicatedCabinCrew) {
            this.dedicatedCabinCrew = dedicatedCabinCrew;
        }

        public Business build(){
            return new Business(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Business business = (Business) o;
        return priorityCheckIn == business.priorityCheckIn && loungeAccess == business.loungeAccess && flatBedSeats == business.flatBedSeats && Objects.equals(luxuryAmenities, business.luxuryAmenities) && Objects.equals(exclusiveServices, business.exclusiveServices) && Objects.equals(dedicatedCabinCrew, business.dedicatedCabinCrew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), luxuryAmenities, exclusiveServices, priorityCheckIn, loungeAccess, flatBedSeats, dedicatedCabinCrew);
    }

    @Override
    public String toString() {
        return "Business{" +
                "luxuryAmenities='" + luxuryAmenities + '\'' +
                ", exclusiveServices='" + exclusiveServices + '\'' +
                ", priorityCheckIn=" + priorityCheckIn +
                ", loungeAccess=" + loungeAccess +
                ", flatBedSeats=" + flatBedSeats +
                ", dedicatedCabinCrew='" + dedicatedCabinCrew + '\'' +
                '}';
    }
}
