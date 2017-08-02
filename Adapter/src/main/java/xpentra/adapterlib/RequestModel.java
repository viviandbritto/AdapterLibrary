package xpentra.adapterlib;

import android.support.annotation.NonNull;

/**
 * Created by Vivian on 8/1/2017.
 */

public class RequestModel extends ResponseValidator {
    private String number = "5495";
    private String date = "2/8/2017";

    public @NonNull String getNumber() {
        return number;
    }

    public @NonNull String getDate() {
        return date;
    }
}
