package com.siapataumenang.bada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasirabd on 5/26/2016.
 */
public class GridViewAdapter extends BaseAdapter {
    private final List<Item> mItems = new ArrayList<Item>();
    private final LayoutInflater mInflater;

    public GridViewAdapter(Context context) {
        mInflater = LayoutInflater.from(context);

        mItems.add(new Item("Dasar 1",       R.drawable.dasar_1));
        mItems.add(new Item("Dasar 2",   R.drawable.dasar_2_locked));
        mItems.add(new Item("Kata Kerja", R.drawable.kata_kerja_locked));
        mItems.add(new Item("Kata Benda",      R.drawable.kata_benda_locked));
        mItems.add(new Item("Kata Jamak",     R.drawable.kata_jamak_locked));
        mItems.add(new Item("Makanan",      R.drawable.makanan_locked));
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mItems.get(i).drawableId;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = mInflater.inflate(R.layout.level_content, viewGroup, false);
            v.setTag(R.id.level_image, v.findViewById(R.id.level_image));
            v.setTag(R.id.level_text, v.findViewById(R.id.level_text));
        }

        picture = (ImageView) v.getTag(R.id.level_image);
        name = (TextView) v.getTag(R.id.level_text);

        Item item = getItem(i);

        picture.setImageResource(item.drawableId);
        name.setText(item.name);

        return v;
    }

    private static class Item {
        public final String name;
        public final int drawableId;

        Item(String name, int drawableId) {
            this.name = name;
            this.drawableId = drawableId;
        }
    }
}
