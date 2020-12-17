package com.example.login;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecycleViewAdapter extends RecyclerView.Adapter<MemberViewHolder> {


    private List<Product> countries;
    private Context context;
    private LayoutInflater mLayoutInflater;

    public RecycleViewAdapter(Context context, List<Product> datas ) {
        this.context = context;
        this.countries = datas;
        this.mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public MemberViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        // Inflate view from recyclerview_item_layout.xml
        View recyclerViewItem = mLayoutInflater.inflate(R.layout.recycleview_item, parent, false);

        recyclerViewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleRecyclerItemClick( (RecyclerView)parent, v);
            }
        });
        return new MemberViewHolder(recyclerViewItem);
    }


    @Override
    public void onBindViewHolder(MemberViewHolder holder, int position) {
        // Cet country in countries via position
        Product country = this.countries.get(position);

        int imageResId = this.getDrawableResIdByName(country.getHinhanh());
        // Bind data to viewholder
        holder.imageView.setImageResource(imageResId);
        holder.nameView.setText(country.getName() );
        holder.priceView.setText("Price: "+ country.getPrice());
    }

    @Override
    public int getItemCount() {
        return this.countries.size();
    }

    // Find Image ID corresponding to the name of the image (in the directory drawable).
    public int getDrawableResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "drawable", pkgName);
        Log.i(MainActivity.LOG_TAG, "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    // Click on RecyclerView Item.
    private void handleRecyclerItemClick(RecyclerView recyclerView, View itemView) {
        int itemPosition = recyclerView.getChildLayoutPosition(itemView);
        Product country  = this.countries.get(itemPosition);

        Toast.makeText(this.context, country.getName(), Toast.LENGTH_LONG).show();
    }
}