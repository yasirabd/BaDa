package com.siapataumenang.bada;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class LevelActivity extends AppCompatActivity {

    GridView gv;
    Context context;

    // Read your drawable from somewhere
//    Drawable dasar1 = getResources().getDrawable(R.drawable.dasar_1);
//    Bitmap bitmap1 = ((BitmapDrawable) dasar1).getBitmap();
//
//    Drawable dasar2 = getResources().getDrawable(R.drawable.dasar_2_locked);
//    Bitmap bitmap2 = ((BitmapDrawable) dasar2).getBitmap();
//
//    Drawable katakerja = getResources().getDrawable(R.drawable.kata_kerja_locked);
//    Bitmap bitmap3 = ((BitmapDrawable) katakerja).getBitmap();
//
//    Drawable katabenda = getResources().getDrawable(R.drawable.kata_benda_locked);
//    Bitmap bitmap4 = ((BitmapDrawable) katabenda).getBitmap();
//
//    Drawable katajamak = getResources().getDrawable(R.drawable.kata_jamak_locked);
//    Bitmap bitmap5 = ((BitmapDrawable) katajamak).getBitmap();
//
//    Drawable makanan = getResources().getDrawable(R.drawable.makanan_locked);
//    Bitmap bitmap6 = ((BitmapDrawable) makanan).getBitmap();
//    // Scale it to 50 x 50
//    Drawable ndasar1 = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap1, 50, 50, true));
//    Drawable ndasar2 = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap2, 50, 50, true));
//    Drawable nkatakerja = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap3, 50, 50, true));
//    Drawable nkatabenda = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap4, 50, 50, true));
//    Drawable nkatajamak = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap5, 50, 50, true));
//    Drawable nmakanan = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap6, 50, 50, true));

// Set your new, scaled drawable "d"

//    public static String [] levelNameList={"Dasar 1", "Dasar 2", "Kata Kerja", "Kata Benda", "Kata Jamak", "Makanan"};
//    public static int [] levelImageList={R.drawable.dasar_1, R.drawable.dasar_2_locked,
//            R.drawable.kata_kerja_locked, R.drawable.kata_benda_locked,
//            R.drawable.kata_jamak_locked, R.drawable.makanan_locked};
//    public static int [] levelImageList = { }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_grid_view);
        gv = (GridView) findViewById(R.id.grid_view);
        gv.setAdapter(new GridViewAdapter(this));
//        gv.setAdapter(new LevelAdapter(this, levelNameList, levelImageList));
    }

}
