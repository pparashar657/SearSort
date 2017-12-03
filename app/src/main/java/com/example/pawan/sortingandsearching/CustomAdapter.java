package com.example.pawan.sortingandsearching;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Pawan on 27-11-2017.
 */

public class CustomAdapter extends ArrayAdapter<Technique> {

    private Context mContext;
    private ArrayList<Technique> mList;

    public CustomAdapter(@NonNull Context context, int resource,ArrayList<Technique> List) {
        super(context, resource);
        mContext = context;
        mList = List;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
           convertView = LayoutInflater.from(mContext).inflate(R.layout.row_layout,null);
           ViewHolder holder = new ViewHolder();
            TextView title = (TextView)convertView.findViewById(R.id.title);
            holder.title = title;
            convertView.setTag(holder);
        }
        ViewHolder holder1 = (ViewHolder)convertView.getTag();
        holder1.title.setText(mList.get(position).getTitle());
        return convertView;
    }

    static class ViewHolder{
        TextView title;
    }
}
