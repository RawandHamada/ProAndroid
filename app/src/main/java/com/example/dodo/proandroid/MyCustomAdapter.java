package com.example.dodo.proandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dodo.proandroid.R;

import java.util.List;

/**
 * Created by روند حمادة on 08/02/2017.
 */


public class MyCustomAdapter extends ArrayAdapter<String> {

    Context context;
    List<String> names;
    List<Integer> photos;

    public MyCustomAdapter(Context context, List<String> names, List<Integer> photos) {

        super(context, R.layout.view, names);
        this.names = names;
        this.photos = photos;
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.view, parent, false);
            TextView tv = (TextView) view.findViewById(R.id.textView);
            ImageView iv = (ImageView) view.findViewById(R.id.imageView);
            tv.setText(names.get(position));
            iv.setImageResource(photos.get(position));
            ViewHolder vh = new ViewHolder();
            vh.text = tv;
            vh.image = iv;
            view.setTag(vh);
        } else {
            ViewHolder vh = (ViewHolder) view.getTag();
            vh.text.setText(names.get(position));
            vh.image.setImageResource(photos.get(position));
        }
        return view;
    }

    static class ViewHolder {
        public TextView text;
        public ImageView image;
    }

}
