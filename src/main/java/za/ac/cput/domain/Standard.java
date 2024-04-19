package za.ac.cput.domain;

import java.util.Objects;

/* Cavan Swartz
   221055835
   16 April 2024
   Class.java
   SubClass

 */

public class Standard extends FlightClass {
    private String standardAmenities;
    private String additionalServices;

    //public Standard() {}

    public Standard(Builder builder){
        super();
    }

    public static class Builder extends FlightClass {
        private String standardAmenities;
        private String additionalServices;

        public void setStandardAmenities(String standardAmenities) {
            this.standardAmenities = standardAmenities;
        }

        public void setAdditionalServices(String additionalServices) {
            this.additionalServices = additionalServices;
        }

        public Standard build(){
            return new Standard(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Standard standard = (Standard) o;
        return Objects.equals(standardAmenities, standard.standardAmenities) && Objects.equals(additionalServices, standard.additionalServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), standardAmenities, additionalServices);
    }

    @Override
    public String toString() {
        return "Standard{" +
                "standardAmenities='" + standardAmenities + '\'' +
                ", additionalServices='" + additionalServices + '\'' +
                '}';
    }
}
