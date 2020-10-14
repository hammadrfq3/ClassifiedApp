package com.sell.classified.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sell.classified.R;
import com.sell.classified.model.Category;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.Holder> {

    private Context context;
    private ArrayList<Category> categories;

    public CategoryAdapter(Context context, ArrayList<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Category category=categories.get(position);

        holder.categoryTextView.setText(category.getCategoryName());

        int resourceId=context.getResources().getIdentifier(category.getCategoryImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView categoryTextView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.categoryItemImageView);
            categoryTextView=itemView.findViewById(R.id.categoryItemTextView);
        }
    }

}
