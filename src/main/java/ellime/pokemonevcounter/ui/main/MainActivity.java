package ellime.pokemonevcounter.ui.main;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import ellime.pokemonevcounter.CreateNewPokemonActivity;
import ellime.pokemonevcounter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        TabLayout tabs = findViewById(R.id.tabs);

        // Add fragments
        viewPagerAdapter.AddFragment(new TrackedPokemonFragment());
        viewPagerAdapter.AddFragment(new AllPokemonFragment());

        viewPager.setAdapter(viewPagerAdapter);
        tabs.setupWithViewPager(viewPager);


        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchCreateNewPokemonActivity();
            }
        });
    }


    private void launchCreateNewPokemonActivity() {
        Intent intent = new Intent(this, CreateNewPokemonActivity.class);
        startActivity(intent);
    }
}