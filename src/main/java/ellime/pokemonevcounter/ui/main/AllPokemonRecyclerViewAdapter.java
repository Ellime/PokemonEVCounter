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

public class AllPokemonRecyclerViewAdapter extends RecyclerView.Adapter<AllPokemonRecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<PokemonG3> mData;

    public AllPokemonRecyclerViewAdapter(Context mContext, List<PokemonG3> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public AllPokemonRecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.pokemon_entry, parent, false);
        AllPokemonRecyclerViewAdapter.MyViewHolder vHolder = new AllPokemonRecyclerViewAdapter.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(AllPokemonRecyclerViewAdapter.MyViewHolder holder, int position) {

        holder.tv_pokemon_name.setText(mData.get(position).getName());
        holder.tv_pokemon_generation.setText(mData.get(position).getGeneration());
        holder.tv_pokemon_hp.setText(Integer.toString(mData.get(position).getHp()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        // Views in each RecyclerView row/entry
        private TextView tv_pokemon_name;
        private TextView tv_pokemon_generation;
        private TextView tv_pokemon_hp;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_pokemon_name = itemView.findViewById(R.id.pokemon_name);
            tv_pokemon_generation = itemView.findViewById(R.id.pokemon_generation);
            tv_pokemon_hp = itemView.findViewById(R.id.pokemon_entry_hp);
        }
    }
}
