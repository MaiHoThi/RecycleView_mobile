package com.example.login;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MemberViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView;
    TextView priceView;

    public MemberViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = (ImageView) itemView.findViewById(R.id.hinhanh);
        this.nameView = (TextView) itemView.findViewById(R.id.name);
        this.priceView = (TextView) itemView.findViewById(R.id.price);
    }
}
