package com.siapataumenang.bada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by M. Febra S on 25/05/2016.
 */
public class LevelAdapter extends BaseAdapter{

    String [] result;
    Context context;
    int [] imageId;

    private static LayoutInflater inflater = null;

    public LevelAdapter(LevelActivity levelActivity, String[] levelNameList, int[] levelImageList) {
        // TODO Auto-generated constructor stub
        result = levelNameList;
        context = levelActivity;
        imageId = levelImageList;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.level_content, null);
        holder.tv=(TextView) rowView.findViewById(R.id.level_text);
        holder.img=(ImageView) rowView.findViewById(R.id.level_image);

        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });

        return rowView;
    }
}
