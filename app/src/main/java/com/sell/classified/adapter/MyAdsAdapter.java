package com.sell.classified.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.sell.classified.R;
import com.sell.classified.model.Ads;

import java.util.ArrayList;

public class MyAdsAdapter extends RecyclerView.Adapter<MyAdsAdapter.Holder> {

    private Context context;
    private ArrayList<Ads> ads;

    public MyAdsAdapter(Context context, ArrayList<Ads> ads) {
        this.context = context;
        this.ads = ads;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.my_ads_list_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Ads latestAd= ads.get(position);

        holder.categoryTextView.setText(latestAd.getLatestAdName());
        holder.categoryPrice.setText(latestAd.getLatestAdPrice());

        int resourceId=context.getResources().getIdentifier(latestAd.getLatestAdImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView=view.findViewById(R.id.categoryItemTextView);

                if(textView.getText().toString().contentEquals("Show All")){
                    context.startActivity(new Intent(context, CategoryAll.class));
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
        TextView categoryTextView;
        TextView categoryPrice;
        CardView editCardView;
        CardView deleteCardView;
        CardView viewCardView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.myAdsItemImageView);
            categoryTextView=itemView.findViewById(R.id.myAdsItemNameTextView);
            categoryPrice=itemView.findViewById(R.id.myAdsItemPriceTextView);
            editCardView=itemView.findViewById(R.id.myAdsItemEditCardView);
            deleteCardView=itemView.findViewById(R.id.myAdsItemDeleteCardView);
            viewCardView=itemView.findViewById(R.id.myAdsItemViewCardView);
        }
    }

}
