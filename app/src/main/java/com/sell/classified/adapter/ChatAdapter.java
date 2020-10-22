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
import com.sell.classified.model.Chat;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.Holder> {

    private Context context;
    private ArrayList<Chat> chats;

    public ChatAdapter(Context context, ArrayList<Chat> chats) {
        this.context = context;
        this.chats = chats;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.chat_list_layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Chat chat=chats.get(position);

        holder.userNameTextView.setText(chat.getUserName());
        holder.messageTextView.setText(chat.getMessage());
        holder.timeTextView.setText(chat.getTime());

        int resourceId=context.getResources().getIdentifier(chat.getUserImage(),"drawable",context.getPackageName());
        holder.imageView.setImageResource(resourceId);

    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView userNameTextView;
        TextView timeTextView;
        TextView messageTextView;

        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.chatItemImageView);
            userNameTextView=itemView.findViewById(R.id.chatItemUserNameTextView);
            timeTextView=itemView.findViewById(R.id.chatItemTimeTextView);
            messageTextView=itemView.findViewById(R.id.chatItemMessageTextView);
        }
    }

}
