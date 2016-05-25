package com.siapataumenang.bada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<MenuBahasa> menuBahasaList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MenuBahasaAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_menu_bahasa);

        recyclerView = (RecyclerView) findViewById(R.id.menu_bahasa_recycler_view);

        mAdapter = new MenuBahasaAdapter(menuBahasaList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMenuBahasaData();
    }

    private void prepareMenuBahasaData(){
        MenuBahasa menuBahasa = new MenuBahasa("Bahasa Jawa");
        menuBahasaList.add(menuBahasa);

        menuBahasa = new MenuBahasa("Bahasa Sunda");
        menuBahasaList.add(menuBahasa);

        menuBahasa = new MenuBahasa("Bahasa Batak");
        menuBahasaList.add(menuBahasa);

        menuBahasa = new MenuBahasa("Bahasa Bali");
        menuBahasaList.add(menuBahasa);

        mAdapter.notifyDataSetChanged();
    }
}
