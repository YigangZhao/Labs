package com.example.smaug.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by smaug on 2017/3/14.
 */

public class ItemAdapter extends ArrayAdapter<Item> {
    private int resourseId;
private Context mContext;
    public ItemAdapter(Context mContext, int textViewResourseId, List<Item> objects) {
        super(mContext, textViewResourseId, objects);
        resourseId = textViewResourseId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourseId, parent, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_item);
        TextView textView = (TextView) view.findViewById(R.id.tv_item);
        imageView.setImageResource(item.getImageId());
        textView.setText(item.getName());
        return view;
    }
}
