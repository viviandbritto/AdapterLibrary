package xpentra.adapterlib;

import com.google.gson.annotations.SerializedName;

/**
 * Created by aksha_000 on 4/20/2016.
 */
public enum TravelType {
    @SerializedName("I")
    INTERNATIONAL,
    @SerializedName("D")
    DOMESTIC,
    UNKNOWN;

    @Override
    public String toString() {
        String string;

        switch (this) {
            case INTERNATIONAL:
                string = "International";
                break;

            case DOMESTIC:
                string = "Domestic";
                break;

            default:
                string = "Unknown";
        }

        return string;
    }
}
