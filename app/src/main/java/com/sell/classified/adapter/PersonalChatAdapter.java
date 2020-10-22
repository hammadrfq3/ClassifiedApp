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

public class PersonalChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Chat> chats;
    public static final int ITEM_TYPE_ONE = 0;
    public static final int ITEM_TYPE_TWO = 1;

    public PersonalChatAdapter(Context context, ArrayList<Chat> chats) {
        this.context = context;
        this.chats = chats;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        // check here the viewType and return RecyclerView.ViewHolder based on view type
        if (viewType == ITEM_TYPE_ONE) {
            view = LayoutInflater.from(context).inflate(R.layout.personal_chat_sender_layout, parent, false);
            return new SenderViewHolder(view);
        } else if (viewType == ITEM_TYPE_TWO) {
            view = LayoutInflater.from(context).inflate(R.layout.personal_chat_receiver_layout, parent, false);
            return new ReceiverViewHolder(view);
        }else {
            return  null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        final int itemType = getItemViewType(position);
        // First check here the View Type
        // than set data based on View Type to your recyclerview item
        if (itemType == ITEM_TYPE_ONE) {
            SenderViewHolder senderViewHolder = (SenderViewHolder) holder;
            senderViewHolder.timeTextView.setText(chats.get(position).getTime());
            senderViewHolder.msgTextView.setText(chats.get(position).getMessage());
        } else if (itemType == ITEM_TYPE_TWO) {
            ReceiverViewHolder receiverViewHolder = (ReceiverViewHolder) holder;

            int resourceId=context.getResources().getIdentifier(chats.get(position).getUserImage(),"drawable",context.getPackageName());

            receiverViewHolder.imageView.setImageResource(resourceId);
            receiverViewHolder.timeTextView.setText(chats.get(position).getTime());
            receiverViewHolder.msgTextView.setText(chats.get(position).getMessage());
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (chats.get(position).getViewType() == 0) {
            return ITEM_TYPE_ONE;
        } else {
            return ITEM_TYPE_TWO;
        }
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class SenderViewHolder extends RecyclerView.ViewHolder{

        TextView timeTextView;
        TextView msgTextView;

        public SenderViewHolder(@NonNull View itemView) {
            super(itemView);
            timeTextView=itemView.findViewById(R.id.personalChatSenderTimeTextView);
            msgTextView=itemView.findViewById(R.id.personalChatSenderMsgTextView);
        }
    }

    public class ReceiverViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView timeTextView;
        TextView msgTextView;

        public ReceiverViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.personalReceiverImageView);
            timeTextView=itemView.findViewById(R.id.personalReceiverTimeTextView);
            msgTextView=itemView.findViewById(R.id.personalReceiverMsgTextView);
        }
    }
}
