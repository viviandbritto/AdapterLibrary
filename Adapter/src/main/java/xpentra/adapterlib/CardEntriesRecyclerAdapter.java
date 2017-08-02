package xpentra.adapterlib;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by aksha_000 on 4/24/2016.
 */
public class CardEntriesRecyclerAdapter extends RecyclerView.Adapter<CardEntriesRecyclerAdapter.CardEntryViewHolder> {
    private ArrayList<String> titles;
    private ArrayList<Map<String, String>> cards;

    public CardEntriesRecyclerAdapter() {

    }

    public void updateWithCards(@Nullable ArrayList<String> titles, @NonNull ArrayList<Map<String, String>> cards) {
        this.titles = titles;
        this.cards = cards;
        notifyDataSetChanged();
    }

    @Override
    public CardEntriesRecyclerAdapter.CardEntryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CardEntryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_recycler_wrapper, parent, false));
    }

    @Override
    public void onBindViewHolder(CardEntriesRecyclerAdapter.CardEntryViewHolder holder, int position) {
        String title = titles != null && titles.size() > position ? titles.get(position) : null;
        holder.updateCardWithEntries(title, cards.get(position));
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public class CardEntryViewHolder extends RecyclerView.ViewHolder {

        protected EntriesView entries;

        public CardEntryViewHolder(View itemView) {
            super(itemView);
            entries= (EntriesView) itemView.findViewById(R.id.entries);
        }

        public void updateCardWithEntries(@Nullable String title, @NonNull Map<String, String> entries) {
            this.entries.updateWithEntries(title, entries);
        }
    }
}
