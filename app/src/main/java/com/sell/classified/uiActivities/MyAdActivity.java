package com.sell.classified.uiActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.sell.classified.R;
import com.sell.classified.adapter.MyAdsAdapter;
import com.sell.classified.helper.GenericFunctions;

public class MyAdActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdsAdapter myAdsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ad);
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

        recyclerView=findViewById(R.id.rvMyAds);
        prepareMyAds();

    }

    private void prepareMyAds() {

        myAdsAdapter=new MyAdsAdapter(this, GenericFunctions.getLatestAdItems());
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(myAdsAdapter);
        myAdsAdapter.notifyDataSetChanged();

    }
}