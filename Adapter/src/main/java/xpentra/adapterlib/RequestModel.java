package xpentra.adapterlib;

import android.support.annotation.NonNull;

/**
 * Created by Vivian on 8/2/2017.
 */

public class RequestModel extends ResponseValidator {
    private String number;
    private String date;

    public @NonNull
    String getNumber() {
        return number;
    }

    public @NonNull String getDate() {
        return date;
    }
}
