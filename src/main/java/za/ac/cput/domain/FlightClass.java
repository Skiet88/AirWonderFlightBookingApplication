package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

/* Cavan Swartz
   221055835
   17 April 2024
   Class.java
   SuperClass

 */
public class FlightClass {
    private String classCode;
    private String className;
    private String description;
    private String seatType;
    private String mealType;
    private String baggageAllowance;
    private boolean priorityBoarding;
    private boolean entertainmentOptions;
    private boolean wifiAvailability;
    private boolean powerOutlets;
    private int loyaltyPointsMultiplier;

    public FlightClass() {}

    private FlightClass(Builder builder){
        this.classCode = builder.classCode;
        this.className = builder.className;
        this.description = builder.description;
        this.seatType = builder.seatType;
        this.mealType = builder.mealType;
        this.baggageAllowance = builder.baggageAllowance;
        this.priorityBoarding = builder.priorityBoarding;
        this.entertainmentOptions = builder.entertainmentOptions;
        this.wifiAvailability = builder.wifiAvailability;
        this.powerOutlets = builder.powerOutlets;
        this.loyaltyPointsMultiplier = builder.loyaltyPointsMultiplier;
    }

    public String getClassCode() {
        return classCode;
    }

    public String getClassName() {
        return className;
    }

    public String getDescription() {
        return description;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getMealType() {
        return mealType;
    }

    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    public boolean isPriorityBoarding() {
        return priorityBoarding;
    }

    public boolean isEntertainmentOptions() {
        return entertainmentOptions;
    }

    public boolean isWifiAvailability() {
        return wifiAvailability;
    }

    public boolean isPowerOutlets() {
        return powerOutlets;
    }

    public int getLoyaltyPointsMultiplier() {
        return loyaltyPointsMultiplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightClass that = (FlightClass) o;
        return priorityBoarding == that.priorityBoarding && entertainmentOptions == that.entertainmentOptions && wifiAvailability == that.wifiAvailability && powerOutlets == that.powerOutlets && loyaltyPointsMultiplier == that.loyaltyPointsMultiplier && Objects.equals(classCode, that.classCode) && Objects.equals(className, that.className) && Objects.equals(description, that.description) && Objects.equals(seatType, that.seatType) && Objects.equals(mealType, that.mealType) && Objects.equals(baggageAllowance, that.baggageAllowance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classCode, className, description, seatType, mealType, baggageAllowance, priorityBoarding, entertainmentOptions, wifiAvailability, powerOutlets, loyaltyPointsMultiplier);
    }

    @Override
    public String toString() {
        return "FlightClass{" +
                "classCode='" + classCode + '\'' +
                ", className='" + className + '\'' +
                ", description='" + description + '\'' +
                ", seatType='" + seatType + '\'' +
                ", mealType='" + mealType + '\'' +
                ", baggageAllowance='" + baggageAllowance + '\'' +
                ", priorityBoarding=" + priorityBoarding +
                ", entertainmentOptions=" + entertainmentOptions +
                ", wifiAvailability=" + wifiAvailability +
                ", powerOutlets=" + powerOutlets +
                ", loyaltyPointsMultiplier=" + loyaltyPointsMultiplier +
                '}';
    }

    public static class Builder{
        private String classCode;
        private String className;
        private String description;
        private String seatType;
        private String mealType;
        private String baggageAllowance;
        private boolean priorityBoarding;
        private boolean entertainmentOptions;
        private boolean wifiAvailability;
        private boolean powerOutlets;
        private int loyaltyPointsMultiplier;

        public void setClassCode(String classCode) {
            this.classCode = classCode;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setSeatType(String seatType) {
            this.seatType = seatType;
        }

        public void setMealType(String mealType) {
            this.mealType = mealType;
        }

        public void setBaggageAllowance(String baggageAllowance) {
            this.baggageAllowance = baggageAllowance;
        }

        public void setPriorityBoarding(boolean priorityBoarding) {
            this.priorityBoarding = priorityBoarding;
        }

        public void setEntertainmentOptions(boolean entertainmentOptions) {
            this.entertainmentOptions = entertainmentOptions;
        }

        public void setWifiAvailability(boolean wifiAvailability) {
            this.wifiAvailability = wifiAvailability;
        }

        public void setPowerOutlets(boolean powerOutlets) {
            this.powerOutlets = powerOutlets;
        }

        public void setLoyaltyPointsMultiplier(int loyaltyPointsMultiplier) {
            this.loyaltyPointsMultiplier = loyaltyPointsMultiplier;
        }

        public FlightClass build(){return new FlightClass(this);}

    }
}
