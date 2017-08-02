package xpentra.adapterlib;

import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.text.WordUtils;

/**
 * Created by aksha_000 on 1/18/2016.
 */
public class Passenger extends ResponseValidator {
    @Required
    @SerializedName("Name")
    private String name;

    public @NonNull String getName() {
        return WordUtils.capitalizeFully(name);
    }
}
