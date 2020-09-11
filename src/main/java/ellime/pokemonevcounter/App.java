package ellime.pokemonevcounter;

import android.app.Application;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import ellime.pokemonevcounter.pokemon.PokemonG3;

/* This class allows resource values to be retrieved anywhere even without Context
 ** Code sourced from https://stackoverflow.com/questions/7493287/android-how-do-i-get-string-from-resources-using-its-name
 */
public class App extends Application {

    private static Resources resources;

    private static List<PokemonG3> allPokemon;

    @Override
    public void onCreate() {
        super.onCreate();

        resources = getResources();
        allPokemon = new ArrayList<>();
    }

    // GETTERS

    public static Resources getAppResources() {
        return resources;
    }

    public static List<PokemonG3> getAllPokemon() {
        return allPokemon;
    }


    public static void addToAllPokemon(PokemonG3 newPokemon) {
        allPokemon.add(newPokemon);
    }
}
