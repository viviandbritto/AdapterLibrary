package xpentra.adapterlib;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Map;

/**
 * Created by aksha_000 on 4/24/2016.
 */
public class EntriesView extends FrameLayout {
    public EntriesView(Context context) {
        super(context);
        init();
    }

    public EntriesView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EntriesView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EntriesView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        addView(LayoutInflater.from(getContext()).inflate(R.layout.entries_view, this, false));
    }

    public void updateWithEntries(@Nullable String title, @NonNull Map<String, String> entries) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        LinearLayout container = (LinearLayout) findViewById(R.id.linear_layout);
        TextView cardTitle = (TextView) findViewById(R.id.title);

        if (title != null && !title.isEmpty()) {
            cardTitle.setVisibility(VISIBLE);
            cardTitle.setText(title);
        }
        else
            cardTitle.setVisibility(GONE);

        container.removeAllViews();

        for (Map.Entry<String, String> entry : entries.entrySet()) {
            View item = inflater.inflate(R.layout.item_entry, container, false);

            TextView text = (TextView) item.findViewById(R.id.text);
            TextView text2 = (TextView) item.findViewById(R.id.text2);

            text.setText(entry.getKey());
            text2.setText(entry.getValue());

            container.addView(item);
        }
    }
}
