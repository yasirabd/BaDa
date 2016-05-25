package com.siapataumenang.bada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<MenuBahasa> menuBahasaList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MenuBahasaAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_menu_bahasa);

        recyclerView = (RecyclerView) findViewById(R.id.menu_bahasa_recycler_view);

        mAdapter = new MenuBahasaAdapter(menuBahasaList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMenuBahasaData();
    }

    private void prepareMenuBahasaData(){
        MenuBahasa menuBahasa = new MenuBahasa("Bahasa Jawa");
        menuBahasaList.add(menuBahasa);

        MenuBahasa menuBahasa2 = new MenuBahasa("Bahasa Sunda");
        menuBahasaList.add(menuBahasa2);

        MenuBahasa menuBahasa3 = new MenuBahasa("Bahasa Batak");
        menuBahasaList.add(menuBahasa3);

        MenuBahasa menuBahasa4 = new MenuBahasa("Bahasa Bali");
        menuBahasaList.add(menuBahasa4);

        mAdapter.notifyDataSetChanged();
    }
}
