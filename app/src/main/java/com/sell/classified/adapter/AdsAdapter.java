package com.sell.classified.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sell.classified.R;
import com.sell.classified.model.Ads;

import java.util.ArrayList;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.Holder> {

    private Context context;
    private ArrayList<Ads> ads;

    public AdsAdapter(Context context, ArrayList<Ads> ads) {
        this.context = context;
        this.ads = ads;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.ads_list_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Ads latestAd= ads.get(position);

        holder.latestAdNameTextView.setText(latestAd.getLatestAdName());
        holder.latestAdPriceTextView.setText(latestAd.getLatestAdPrice());
        holder.latestAdAddressTextView.setText(latestAd.getLatestAdAddress());

        final int resourceId=context.getResources().getIdentifier(latestAd.getLatestAdImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);

        final boolean[] check = {false};

        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageButton imageButton=(ImageButton) view;

                int resourceIdFvrtFilled=context.getResources().getIdentifier("ic_favorite_filled","drawable",context.getPackageName());
                int resourceIdFvrtBorder=context.getResources().getIdentifier("ic_favorite_border","drawable",context.getPackageName());

                if(check[0]){
                    imageButton.setBackgroundResource(R.drawable.favourite_button_bg);
                    check[0] =false;
                }
                else {
                    imageButton.setBackgroundResource(R.drawable.favourite_button_filled_bg);
                    check[0] =true;
                }



            }
        });
    }

    @Override
    public int getItemCount() {
        return ads.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView latestAdNameTextView;
        TextView latestAdPriceTextView;
        TextView latestAdAddressTextView;
        ImageButton imageButton;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.latestAdsItemImageView);
            imageButton=itemView.findViewById(R.id.latestAdsItemFvrtButton);
            latestAdNameTextView=itemView.findViewById(R.id.latestAdsItemNameTextView);
            latestAdPriceTextView=itemView.findViewById(R.id.latestAdsItemPriceTextView);
            latestAdAddressTextView=itemView.findViewById(R.id.latestAdsItemAddressTextView);
        }
    }

}
