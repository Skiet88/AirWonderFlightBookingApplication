package za.ac.cput.factory;

import za.ac.cput.domain.Aircraft;
import za.ac.cput.util.AircraftHelper;
import za.ac.cput.util.Helper;

public class AircraftFactory {

    public static Aircraft buildAircraft(String aircraftID, String aircraftType, int numOfSeats){
        if (AircraftHelper.isEmpty(aircraftID) || AircraftHelper.isEmpty(aircraftType)){
            return null;
        }
        return new Aircraft.AircraftBuilder().setAircraftID(aircraftID)
                .setAircraftType(aircraftType)
                .setNumberOfSeats(numOfSeats)
                .build();
    }
}
