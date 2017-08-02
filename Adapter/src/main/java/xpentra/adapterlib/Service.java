package xpentra.adapterlib;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aksha_000 on 4/20/2016.
 */
public enum Service {
    @SerializedName("Air")
    AIR,
    @SerializedName("Cab")
    CAB,
    @SerializedName("Rail")
    RAIL,
    @SerializedName("Bus")
    BUS,
    @SerializedName("Accommodation")
    ACCOMMODATION,
    @SerializedName("Visa")
    VISA,
    @SerializedName("Forex")
    FOREX,
    @SerializedName("Insurance")
    INSURANCE,
    UNKNOWN;

    @Override
    public String toString() {
        String string;

        switch (this) {
            case AIR:
                string = "Air";
                break;

            case CAB:
                string = "Cab";
                break;

            case RAIL:
                string = "Rail";
                break;

            case BUS:
                string = "Bus";
                break;

            case ACCOMMODATION:
                string = "Accommodation";
                break;

            case VISA:
                string = "Visa";
                break;

            case FOREX:
                string = "Forex";
                break;

            case INSURANCE:
                string = "Insurance";
                break;

            default:
                string =  "Unknown";
        }

        return string;
    }
}
