package com.sell.classified.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sell.classified.R;
import com.sell.classified.adapter.ChooseCategoryAdapter;
import com.sell.classified.helper.GenericFunctions;


public class ChooseCategoryFragment extends Fragment {

    private RecyclerView recyclerView;
    private ChooseCategoryAdapter chooseCategoryAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_choose_category, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {

        recyclerView=view.findViewById(R.id.rvChooseCategory);
        prepareCategories();

    }

    private void prepareCategories() {

        chooseCategoryAdapter=new ChooseCategoryAdapter(getActivity(), GenericFunctions.getCategories(true));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(chooseCategoryAdapter);
        chooseCategoryAdapter.notifyDataSetChanged();

    }
}