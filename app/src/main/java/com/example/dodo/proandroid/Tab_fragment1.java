package com.example.dodo.proandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by روند حمادة on 08/07/2017.
 */

public class Tab_fragment1 extends Fragment {
        Intent intent;
        Intent intent1;
        Button button1;
        Button button2;
        Button button3;
        Button button4;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.tab_fragment_1, container, false);
            button1 = view.findViewById(R.id.button1);

                button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    intent1 = new Intent(getContext(), about_novel.class);
                                     startActivity(intent1);

                             }});
            button2 = view.findViewById(R.id.button2);

                 button2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    intent = new Intent(getContext(), about_novel.class);
                                    startActivity(intent);

                }
            });
            button3 = view.findViewById(R.id.button3);

                     button3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    intent = new Intent(getContext(), about_novel.class);
                                 startActivity(intent);

                }
            });
            button4 = view.findViewById(R.id.button4);

                     button4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    intent = new Intent(getContext(), about_novel.class);
                    startActivity(intent);

                }
            });
            return view;
        }
}
