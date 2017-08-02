package xpentra.adapterlib;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * Created by aksha_000 on 7/20/2016.
 */
public class CardAdapter<T> extends RecyclerView.Adapter<CardAdapter.CardViewHolder> implements View.OnClickListener {

    public interface Callbacks<T> {
        void cardAdapterSelectedItem(T item);
    }

    private @LayoutRes int layoutResId;
    private ArrayList list;
    private Callbacks callbacks;

    public CardAdapter(@LayoutRes int layoutResId) {
        this.layoutResId = layoutResId;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override
    public CardAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(layoutResId, parent, false);

        if (callbacks != null)
            itemView.setOnClickListener(this);

        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CardAdapter.CardViewHolder holder, int position) {
        Object data = list.get(position);
        holder.setData(data);
        holder.itemView.setTag(data);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public void onClick(View v) {
        if (callbacks != null)
            callbacks.cardAdapterSelectedItem(v.getTag());
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        public CardViewHolder(View itemView) {
            super(itemView);
        }

        public void setData(Object data) {
            if (itemView == null)
                return;

            ViewDataBinding dataBinding = DataBindingUtil.bind(itemView);
            dataBinding.setVariable(xpentra.adapterlib.BR.model, data);
            dataBinding.executePendingBindings();
        }
    }
}
