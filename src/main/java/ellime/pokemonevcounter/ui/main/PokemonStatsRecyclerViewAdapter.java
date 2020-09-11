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

public class PokemonStatsRecyclerViewAdapter extends RecyclerView.Adapter<PokemonStatsRecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<PokemonG3> mData;

    public PokemonStatsRecyclerViewAdapter(Context mContext, List<PokemonG3> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public PokemonStatsRecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.pokemon_entry, parent, false);
        PokemonStatsRecyclerViewAdapter.MyViewHolder vHolder = new PokemonStatsRecyclerViewAdapter.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(PokemonStatsRecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.tv_pokemon_stat.setText(mData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // Views in each RecyclerView row/entry
        private TextView tv_pokemon_stat;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_pokemon_stat = itemView.findViewById(R.id.pokemon_entry_stat);
        }
    }
}
