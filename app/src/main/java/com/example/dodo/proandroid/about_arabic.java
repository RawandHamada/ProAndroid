package com.example.dodo.proandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ScrollView;

/**
 * Created by روند حمادة on 08/01/2017.
 */

public class about_arabic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_arab);


        CheckBox favButton = (CheckBox) findViewById(R.id.favbutton);
        final ScrollView scrollview = ((ScrollView) findViewById(R.id.ScrollView));
        scrollview.post(new Runnable() {
            @Override
            public void run() {
                scrollview.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.CheckBox03:
                if (checked) {
                    Intent intent = new Intent(this, MyCustomAdapter.class);
                    startActivity(intent);
                }

    }







}}


