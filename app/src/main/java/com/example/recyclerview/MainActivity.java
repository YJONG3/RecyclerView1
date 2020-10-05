package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.sandwiches, R.drawable.salad, R.drawable.soup, R.drawable.mousse, R.drawable.tilapia, R.drawable.cake, R.drawable.applepie, R.drawable.friedrice,
            R.drawable.pasta, R.drawable.burger };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.recipe);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s1, images);
    }
}