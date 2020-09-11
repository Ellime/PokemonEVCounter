package ellime.pokemonevcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ellime.pokemonevcounter.R;

public class ViewPokemonActivity extends AppCompatActivity {

    private TextView tv_pokemon_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pokemon);

        tv_pokemon_name = findViewById(R.id.view_pokemon_name);


    }
}
