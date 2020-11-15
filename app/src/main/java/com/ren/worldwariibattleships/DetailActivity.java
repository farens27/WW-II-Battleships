package com.ren.worldwariibattleships;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String DETAIL_BATTLESHIP = "detail_battleship";
    TextView name, description;
    ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        showBattleshipData();
    }

    private void initView() {
        name = findViewById(R.id.battleship_detail_name);
        description = findViewById(R.id.battleship_detail_description);
        picture = findViewById(R.id.battleship_detail_picture);
    }


    private void showBattleshipData() {
        Battleship battleship = getIntent().getParcelableExtra(DETAIL_BATTLESHIP);

        if(battleship == null) return;

        Glide.with(this)
                .load(battleship.getPicture_battleship())
                .into(picture);
        name.setText(battleship.getNama_battleship());
        description.setText(battleship.getDetail_battleship());
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
