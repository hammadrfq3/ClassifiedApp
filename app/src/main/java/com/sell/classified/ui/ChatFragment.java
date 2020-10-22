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
import com.sell.classified.adapter.ChatAdapter;
import com.sell.classified.helper.GenericFunctions;


public class ChatFragment extends Fragment {

    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        initViews(view);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Chats");

        return view;
    }

    private void initViews(View view) {

        recyclerView=view.findViewById(R.id.rvChats);
        prepareChats();

    }

    private void prepareChats() {

        chatAdapter=new ChatAdapter(getActivity(), GenericFunctions.getChats());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(chatAdapter);
        chatAdapter.notifyDataSetChanged();

    }
}