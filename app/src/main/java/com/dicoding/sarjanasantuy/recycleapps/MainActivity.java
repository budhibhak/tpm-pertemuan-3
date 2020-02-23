package com.dicoding.sarjanasantuy.recycleapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.activitymain_rv_hero);
        rvHero.setHasFixedSize(true);

        showRecyclerList();

    }
    private void showRecyclerList(){
        rvHero.setLayoutManager(new LinearLayoutManager(this));

        HeroAdapter heroAdapter = new HeroAdapter(this);
        heroAdapter.setHeroes(HeroData.getHeroList());

        rvHero.setAdapter(heroAdapter);
    }
}
