package com.siapataumenang.bada;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class LevelActivity extends AppCompatActivity {

    GridView gv;
    Context context;

    public static String [] levelNameList={"Dasar 1", "Dasar 2", "Kata Kerja", "Kata Benda", "Kata Jamak", "Makanan"};
    public static int [] levelImageList={R.drawable.dasar_1, R.drawable.dasar_2,
            R.drawable.kata_kerja, R.drawable.kata_benda,
            R.drawable.kata_jamak, R.drawable.makanan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_grid_view);
        gv = (GridView) findViewById(R.id.grid_view);
        gv.setAdapter(new LevelAdapter(this, levelNameList, levelImageList));
    }

}
