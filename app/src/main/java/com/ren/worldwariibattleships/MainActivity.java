package com.ren.worldwariibattleships;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBattelship;
    private ArrayList<Battleship> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvBattelship= findViewById(R.id.rv_battleship);
        rvBattelship.setHasFixedSize(true);

        list.addAll(BattleshipData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvBattelship.setLayoutManager(new LinearLayoutManager(this));
        ListBattleshipAdapter listHeroAdapter = new ListBattleshipAdapter(list);
        rvBattelship.setAdapter(listHeroAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent j = new Intent(this, AboutActivity.class);
        startActivity(j);
        return super.onOptionsItemSelected(item);
    }
}
