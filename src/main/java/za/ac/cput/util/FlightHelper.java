package za.ac.cput.util;

import za.ac.cput.domain.Aircraft;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FlightHelper {
    public static boolean isEmpty(String s){
        if (s == null ||  s.isEmpty()){return true;}
        return false;
    }

    public static boolean isDateNull(LocalDateTime enrollmentDate){
        if(enrollmentDate == null){
            return true;
        }
        return false;
    }
    public static boolean isAircraftNull(Aircraft aircraft){
        if(aircraft == null){
            return true;
        }
        return false;
    }
}
