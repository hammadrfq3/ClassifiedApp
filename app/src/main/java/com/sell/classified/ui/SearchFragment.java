package com.sell.classified.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.sell.classified.R;
import com.sell.classified.helper.SortBottomSheetDialog;
import com.sell.classified.uiActivities.FilterActivity;


public class SearchFragment extends Fragment implements SortBottomSheetDialog.BottomSheetListener {

    private Button sortButton;
    private Button filterBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Search");

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        initViews(view);

        return view;
    }

    private void initViews(View view) {

        sortButton=view.findViewById(R.id.searchSortButton);
        filterBtn=view.findViewById(R.id.searchFilterBtn);
        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SortBottomSheetDialog bottomSheet = new SortBottomSheetDialog();
                bottomSheet.show(getActivity().getSupportFragmentManager(), "exampleBottomSheet");
            }
        });

        filterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), FilterActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onButtonClicked(String text) {

    }
}