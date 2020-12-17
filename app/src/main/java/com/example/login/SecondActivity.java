package com.example.login;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    public static final String LOG_TAG = "AndroidExample";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    List<Product> countries = getListData();
        this.recyclerView = (RecyclerView) this.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new RecycleViewAdapter(this, countries));

        // RecyclerView scroll vertical
        int spanCount;
        GridLayoutManager GridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(GridLayoutManager);
    }

    private  List<Product> getListData() {
        List<Product> list = new ArrayList<Product>();
      list.add(new Product("Lipstick", 210000, "a"));
        list.add(new Product("Lipstick", 200000, "b"));
        list.add(new Product("Lipstick", 200000, "c"));
        list.add(new Product("Lipstick", 200000, "d"));
        list.add(new Product("Lipstick", 200000, "f"));
        list.add(new Product("Lipstick", 200000, "g"));
        list.add(new Product("Lipstick", 200000,"h"));


        return list;
    }


}