package com.sell.classified.uiActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.sell.classified.R;

public class PagesActivity extends AppCompatActivity {

    private RelativeLayout signInLayout;
    private RelativeLayout signUpLayout;
    private RelativeLayout blankLayout;
    private RelativeLayout contactLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);

        signInLayout=findViewById(R.id.pagesSignInLayout);
        signUpLayout=findViewById(R.id.pagesSignUpLayout);
        blankLayout=findViewById(R.id.pagesBlankLayout);
        contactLayout=findViewById(R.id.pagesContactLayout);


        signUpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(PagesActivity.this, SignUpActivity.class));

            }
        });

        signInLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(PagesActivity.this, LoginActivity.class));

            }
        });

        blankLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(PagesActivity.this, BlankPageActivity.class));

            }
        });

        contactLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(PagesActivity.this, ContactActivity.class));

            }
        });
    }
}