package com.sell.classified.uiActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.sell.classified.R;
import com.sell.classified.adapter.PersonalChatAdapter;
import com.sell.classified.helper.GenericFunctions;

public class ChatActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PersonalChatAdapter personalChatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
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

        recyclerView=findViewById(R.id.rvPersonalChat);
        preparePersonalChats();

    }

    private void preparePersonalChats() {

        personalChatAdapter=new PersonalChatAdapter(this, GenericFunctions.getPersonalChats());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(personalChatAdapter);
        personalChatAdapter.notifyDataSetChanged();

    }
}