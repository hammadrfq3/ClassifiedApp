package com.sell.classified.uiActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.sell.classified.R;
import com.sell.classified.adapter.FavoriteAdapter;
import com.sell.classified.helper.GenericFunctions;

public class FavoriteActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FavoriteAdapter favoriteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        initViews();
    }

    private void initViews() {

        recyclerView=findViewById(R.id.rvFavorites);
        prepareFavorites();

    }

    private void prepareFavorites() {

        favoriteAdapter=new FavoriteAdapter(this, GenericFunctions.getLatestAdItems());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(favoriteAdapter);
        favoriteAdapter.notifyDataSetChanged();

    }
}