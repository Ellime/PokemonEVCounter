package ellime.pokemonevcounter.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ellime.pokemonevcounter.R;
import ellime.pokemonevcounter.pokemon.PokemonG3;

/**
 * A fragment representing a list of Items.
 */
public class TrackedPokemonFragment extends Fragment {

    private View v;
    private RecyclerView myRecyclerView;
    private List<PokemonG3> entries;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public TrackedPokemonFragment() { }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        entries = new ArrayList<>();
        entries.add(new PokemonG3("Placeholder1"));
        entries.add(new PokemonG3("Placeholder2"));
        entries.add(new PokemonG3("Placeholder3"));
        entries.add(new PokemonG3("Placeholder4"));
        entries.add(new PokemonG3("Placeholder5"));
        entries.add(new PokemonG3("Placeholder6"));
        entries.add(new PokemonG3("Placeholder7"));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_pokemon_list, container, false);
        myRecyclerView = v.findViewById(R.id.pokemon_recyclerview);
        TrackedPokemonRecyclerViewAdapter trackedPokemonRecyclerViewAdapter = new TrackedPokemonRecyclerViewAdapter(getContext(), entries);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(trackedPokemonRecyclerViewAdapter);
        return v;
    }
}