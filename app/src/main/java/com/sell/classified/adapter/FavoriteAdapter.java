package com.sell.classified.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sell.classified.R;
import com.sell.classified.model.Ads;

import java.util.ArrayList;

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.Holder> {

    private Context context;
    private ArrayList<Ads> ads;

    public FavoriteAdapter(Context context, ArrayList<Ads> ads) {
        this.context = context;
        this.ads = ads;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.favorite_list_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Ads latestAd= ads.get(position);

        holder.favoriteAdNameTextView.setText(latestAd.getLatestAdName());
        holder.favoriteAdPriceTextView.setText(latestAd.getLatestAdPrice());
        holder.favoriteAdAddressTextView.setText(latestAd.getLatestAdAddress());

        final int resourceId=context.getResources().getIdentifier(latestAd.getLatestAdImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);

        final boolean[] check = {false};

        /*holder.imageView.setOnClickListener(new View.OnClickListener() {
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
        });*/
    }

    @Override
    public int getItemCount() {
        return ads.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView favoriteAdNameTextView;
        TextView favoriteAdPriceTextView;
        TextView favoriteAdAddressTextView;
        RatingBar ratingBar;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.favoriteItemImageView);
            favoriteAdNameTextView=itemView.findViewById(R.id.favoriteItemNameTextView);
            favoriteAdPriceTextView=itemView.findViewById(R.id.favoriteItemPriceTextView);
            ratingBar=itemView.findViewById(R.id.favoriteITemRatingBar);
            favoriteAdAddressTextView=itemView.findViewById(R.id.favoriteItemAddressTextView);
        }
    }

}
