package ellime.pokemonevcounter.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ellime.pokemonevcounter.R;
import ellime.pokemonevcounter.pokemon.PokemonG3;

public class TrackedPokemonRecyclerViewAdapter extends RecyclerView.Adapter<TrackedPokemonRecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<PokemonG3> mData;

    public TrackedPokemonRecyclerViewAdapter(Context mContext, List<PokemonG3> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.pokemon_entry, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_pokemon_name.setText(mData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // Views in each RecyclerView row/entry
        private TextView tv_pokemon_name;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_pokemon_name = itemView.findViewById(R.id.pokemon_name);
        }
    }
}
