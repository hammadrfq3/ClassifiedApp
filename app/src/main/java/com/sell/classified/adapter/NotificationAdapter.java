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
import com.sell.classified.model.Notification;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.Holder> {

    private Context context;
    private ArrayList<Notification> users;

    public NotificationAdapter(Context context, ArrayList<Notification> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.notification_item_list,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Notification notification =users.get(position);

        holder.userNameTextView.setText(notification.getUserName());
        holder.actionTextView.setText(notification.getAction());
        holder.timeTextView.setText(notification.getNotificationTime());

        int resourceId=context.getResources().getIdentifier(notification.getUserImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView userNameTextView;
        TextView actionTextView;
        TextView timeTextView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.notificationItemImageView);
            userNameTextView=itemView.findViewById(R.id.notificationItemNameTextView);
            actionTextView=itemView.findViewById(R.id.notificationItemActionTextView);
            timeTextView=itemView.findViewById(R.id.notificationItemTimeTextView);
        }
    }

}
