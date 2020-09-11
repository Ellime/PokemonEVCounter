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

import ellime.pokemonevcounter.App;
import ellime.pokemonevcounter.R;
import ellime.pokemonevcounter.pokemon.PokemonG3;

/**
 * A fragment representing a list of Items.
 */
public class AllPokemonFragment extends Fragment {

    private View v;
    private RecyclerView myRecyclerView;
    private List<PokemonG3> entries;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AllPokemonFragment() { }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        entries = App.getAllPokemon();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_pokemon_list, container, false);
        myRecyclerView = v.findViewById(R.id.pokemon_recyclerview);
        AllPokemonRecyclerViewAdapter allPokemonRecyclerViewAdapter = new AllPokemonRecyclerViewAdapter(getContext(), entries);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(allPokemonRecyclerViewAdapter);
        return v;
    }
}