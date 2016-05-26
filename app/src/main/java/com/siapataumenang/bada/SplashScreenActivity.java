package com.siapataumenang.bada;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import com.orm.query.Select;
import com.siapataumenang.bada.data.LanguageTable;

import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashScreenActivity extends AppCompatActivity {

    protected static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // delete all data in LanguageTable
//        List<LanguageTable> books = LanguageTable.listAll(LanguageTable.class);
//        LanguageTable.deleteAll(LanguageTable.class);

        List<LanguageTable> menuBahasaList = Select.from(LanguageTable.class).list();

        if(menuBahasaList == null) {
            /* Insert data to DB */
            LanguageTable language = new LanguageTable("Bahasa Jawa");
            language.save();

            language = new LanguageTable("Bahasa Sunda");
            language.save();

            language = new LanguageTable("Bahasa Aceh");
            language.save();

            // Maluku, Ambon Timur
            language = new LanguageTable("Bahasa Alor");
            language.save();

            // Kalimantan
            language = new LanguageTable("Bahasa Banjar");
            language.save();

            /* End insert data */
        }
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreenActivity.this, WelcomeActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
