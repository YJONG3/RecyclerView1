package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView ingredient, ingredient_list, procedure, procedure_list;

    int myImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        ingredient = findViewById(R.id.ingredient);
        ingredient_list = findViewById(R.id.ingredient_list);
        procedure = findViewById(R.id.procedure);
        procedure_list = findViewById(R.id.procedure_list);



        getData();
        setData();

    }

    private void getData(){
        if(getIntent().hasExtra("myImageView")){
            myImage = getIntent().getIntExtra("myImageView", 1);

        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }

    }

    private void setData(){
        mainImageView.setImageResource(myImage);


    }
}