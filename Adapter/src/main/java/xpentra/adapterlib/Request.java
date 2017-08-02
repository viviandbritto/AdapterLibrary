package xpentra.adapterlib;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * Created by aksha_000 on 12/6/2015.
 */
public class Request extends ResponseValidator {
    @Required
    @SerializedName("REQ_NO")
    private String number;
    @Required
    @SerializedName("REQ_DATE")
    private String date;
    @Required
    @SerializedName("SERVICES")
    private ArrayList<Service> services;
    @Required
    @SerializedName("REQ_TYPE")
    private TravelType type;
    @Required
    @SerializedName("PASSENGERS")
    private Passenger[] passengers;

    public @NonNull String getNumber() {
        return number;
    }

    public @NonNull String getDate() {
        return date;
    }

    public @NonNull ArrayList<Service> getServices() {
        return services;
    }

    public @NonNull TravelType getType() {
        return type;
    }

    public @NonNull Passenger[] getPassengers() {
        return passengers;
    }

    public @NonNull String getPassengerNames() {
        String names = "";
        for (Passenger p : getPassengers())
            names += p.getName() + "\n";
        names = names.trim();

        return names;
    }
}
