package com.sell.classified.uiActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.sell.classified.R;

public class AddProductActivity extends AppCompatActivity {

    private ArrayAdapter<String> arrayAdapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setTitleTextColor(getResources().getColor(R.color.primaryText));

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        initViews();

    }

    private void initViews() {

        String arr[]=new String[4];
        arr[0]="Honde";
        arr[1]="Yamaha";
        arr[2]="Suzuki";
        arr[3]="Ynr";

        /*spinner=findViewById(R.id.modelSpinner);
        arrayAdapter=new ArrayAdapter<>(this,R.layout.custom_spinner_layout,arr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);*/

    }
}