package com.sell.classified.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.sell.classified.R;
import com.sell.classified.uiActivities.ChatActivity;
import com.sell.classified.uiActivities.FavoriteActivity;
import com.sell.classified.uiActivities.MyAdActivity;
import com.sell.classified.uiActivities.NotificationActivity;
import com.sell.classified.uiActivities.SettingActivity;


public class ProfileFragment extends Fragment {

    private RelativeLayout settingLayout;
    private RelativeLayout myAdsLayout;
    private RelativeLayout favoriteLayout;
    private RelativeLayout notificationsLayout;
    private RelativeLayout chatLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Proflie");

        initViews(view);

        return view;
    }

    private void initViews(View view) {

        settingLayout=view.findViewById(R.id.proflieSettingRelativeLayout);
        myAdsLayout=view.findViewById(R.id.proflieMyAdsRelativeLayout);
        favoriteLayout=view.findViewById(R.id.proflieFavoriteRelativeLayout);
        notificationsLayout=view.findViewById(R.id.proflieNotificationRelativeLayout);
        chatLayout=view.findViewById(R.id.proflieChatRelativeLayout);

        settingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SettingActivity.class));
            }
        });

        myAdsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MyAdActivity.class));
            }
        });

        favoriteLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), FavoriteActivity.class));
            }
        });

        notificationsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), NotificationActivity.class));
            }
        });

        chatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ChatActivity.class));
            }
        });

    }
}