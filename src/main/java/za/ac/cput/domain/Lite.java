package za.ac.cput.domain;

import java.util.Objects;

/* Cavan Swartz
   221055835
   16 April 2024
   Class.java
   SubClass

 */

public class Lite extends FlightClass {
    private String basicAmenities;
    private String limitedServices;

    //public Lite() {}

    public Lite(Builder builder) {
        super();
    }

    public static class Builder extends FlightClass {
        private String basicAmenities;
        private String limitedServices;

        public void setBasicAmenities(String basicAmenities) {
            this.basicAmenities = basicAmenities;
        }

        public void setLimitedServices(String limitedServices) {
            this.limitedServices = limitedServices;
        }

        public Lite build() {
            return new Lite(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lite lite = (Lite) o;
        return Objects.equals(basicAmenities, lite.basicAmenities) && Objects.equals(limitedServices, lite.limitedServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), basicAmenities, limitedServices);
    }

    @Override
    public String toString() {
        return "Lite{" +
                "basicAmenities='" + basicAmenities + '\'' +
                ", limitedServices='" + limitedServices + '\'' +
                '}';
    }
}
