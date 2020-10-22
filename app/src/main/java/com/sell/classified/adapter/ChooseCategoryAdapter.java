package com.sell.classified.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sell.classified.R;
import com.sell.classified.model.Category;
import com.sell.classified.uiActivities.AddProductActivity;
import com.sell.classified.uiActivities.CategoryAll;

import java.util.ArrayList;

public class ChooseCategoryAdapter extends RecyclerView.Adapter<ChooseCategoryAdapter.Holder> {

    private Context context;
    private ArrayList<Category> categories;

    public ChooseCategoryAdapter(Context context, ArrayList<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.choose_category_layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Category category=categories.get(position);

        holder.chooseCategoryTextView.setText(category.getCategoryName());

        int resourceId=context.getResources().getIdentifier(category.getCategoryImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                context.startActivity(new Intent(context, AddProductActivity.class));

            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView chooseCategoryTextView;
        ImageButton chooseCategoryForwardImageButton;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.chooseCategoryItemImageView);
            chooseCategoryTextView=itemView.findViewById(R.id.chooseCategoryItemNameTextView);
            chooseCategoryForwardImageButton=itemView.findViewById(R.id.chooseCategoryItemForwardButton);
        }
    }

}
