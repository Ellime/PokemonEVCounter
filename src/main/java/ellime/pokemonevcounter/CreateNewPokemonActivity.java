package ellime.pokemonevcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

import ellime.pokemonevcounter.pokemon.PokemonG3;

public class CreateNewPokemonActivity extends AppCompatActivity {

    private EditText et;
    private Button submit;
    private String pokemonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pokemon);
        et = findViewById(R.id.editPokemonName);
        submit = findViewById(R.id.submitPokemon);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitPokemon();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    private void submitPokemon() {
        pokemonName = et.getText().toString();
        if(TextUtils.isEmpty(pokemonName)) {
            et.setError("This field is required");
        }
        else {
            PokemonG3 newPokemon = new PokemonG3(pokemonName);
            App.addToAllPokemon(newPokemon);

            finish();
        }
    }
}