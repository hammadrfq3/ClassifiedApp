package com.sell.classified.uiActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.sell.classified.R;
import com.sell.classified.adapter.CategoryAdapter;
import com.sell.classified.helper.GenericFunctions;

public class CategoryAll extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_all);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        getSupportActionBar().setTitle("Categories");
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

        recyclerView=findViewById(R.id.rvCategoryPage);
        prepareCategories();

    }

    private void prepareCategories() {

        categoryAdapter=new CategoryAdapter(this, GenericFunctions.getCategories(true));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

    }
}