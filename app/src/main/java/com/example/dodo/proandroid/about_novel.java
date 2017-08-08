package com.example.dodo.proandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static java.security.AccessController.getContext;

/**
 * Created by روند حمادة on 07/31/2017.
 */

public class about_novel extends AppCompatActivity  implements View.OnClickListener{
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        CheckBox favButton = (CheckBox) findViewById(R.id.favbutton);
        image1 = (ImageView) findViewById(R.id.Novel1);
        image2 = (ImageView) findViewById(R.id.Novel2);
        image3 = (ImageView) findViewById(R.id.Novel3);
        image4 = (ImageView) findViewById(R.id.Novel4);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);






    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.CheckBox03:
                if (checked) {


                }


        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.Novel1:
                Intent  intent = new Intent(about_novel.this,PDF_Read.class);
                startActivity(intent);
                break;

            case R.id.Novel2:
                Intent  intent2 = new Intent(about_novel.this,PDF_Read.class);
                startActivity(intent2);

                break;

            case R.id.Novel3:
                Intent  intent3 = new Intent(about_novel.this,PDF_Read.class);
                startActivity(intent3);
                break;

            case R.id.Novel4:
                Intent  intent4 = new Intent(about_novel.this,PDF_Read.class);
                startActivity(intent4);
                break;


        }
    }
    }

