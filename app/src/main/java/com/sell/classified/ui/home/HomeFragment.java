package com.sell.classified.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sell.classified.R;
import com.sell.classified.adapter.CategoryAdapter;
import com.sell.classified.adapter.FeaturedAdapter;
import com.sell.classified.adapter.AdsAdapter;
import com.sell.classified.helper.GenericFunctions;
import com.sell.classified.model.Category;
import com.sell.classified.model.Featured;
import com.sell.classified.model.Ads;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView categoryRecyclerView;
    private RecyclerView featuredRecyclerView;
    private RecyclerView latestAdsRecyclerView;
    private CategoryAdapter categoryAdapter;
    private FeaturedAdapter featuredAdapter;
    private AdsAdapter adsAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        container.removeAllViews();
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowTitleEnabled(false);

        initViews(root);

        return root;
    }

    private void initViews(View root) {

        categoryRecyclerView =root.findViewById(R.id.rvCategories);
        featuredRecyclerView=root.findViewById(R.id.rvFeatured);
        latestAdsRecyclerView=root.findViewById(R.id.rvLatestAds);
        prepareCategories();
        prepareFeaturedItems();
        prepareLatestAds();

    }

    private void prepareCategories() {
        ArrayList<Category> categories=GenericFunctions.getCategories(false);

        categoryAdapter=new CategoryAdapter(getActivity(),categories);
        categoryRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();
    }

    private void prepareFeaturedItems() {
        ArrayList<Featured> featureds=GenericFunctions.getFeaturedItems();

        featuredAdapter=new FeaturedAdapter(getActivity(),featureds);
        featuredRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        featuredRecyclerView.setAdapter(featuredAdapter);
        featuredAdapter.notifyDataSetChanged();
    }

    private void prepareLatestAds() {
        ArrayList<Ads> ads =GenericFunctions.getLatestAdItems();

        adsAdapter =new AdsAdapter(getActivity(), ads);
        latestAdsRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        latestAdsRecyclerView.setAdapter(adsAdapter);
        adsAdapter.notifyDataSetChanged();
    }
}