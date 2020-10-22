package com.sell.classified.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sell.classified.R;
import com.sell.classified.model.Category;
import com.sell.classified.model.Featured;
import com.sell.classified.uiActivities.AdDetailActivity;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.Holder> {

    private Context context;
    private ArrayList<Featured> featureds;

    public FeaturedAdapter(Context context, ArrayList<Featured> featureds) {
        this.context = context;
        this.featureds = featureds;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.featured_list_layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Featured featured=featureds.get(position);

        holder.featuredItemNameTextView.setText(featured.getFeaturedItemName());
        holder.featureItemPriceTextView.setText(featured.getFeaturedItemPrice());
        holder.featuredItemAddressTextView.setText(featured.getFeaturedItemAddress());

        int resourceId=context.getResources().getIdentifier(featured.getFeaturedItemImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                context.startActivity(new Intent(context, AdDetailActivity.class));

            }
        });
    }

    @Override
    public int getItemCount() {
        return featureds.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView featuredItemNameTextView;
        TextView featureItemPriceTextView;
        TextView featuredItemAddressTextView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.featuredItemImageView);
            featuredItemNameTextView=itemView.findViewById(R.id.featuredItemNameTextView);
            featureItemPriceTextView=itemView.findViewById(R.id.featuredPriceTextView);
            featuredItemAddressTextView=itemView.findViewById(R.id.featuredItemAddressTextView);
        }
    }

}
