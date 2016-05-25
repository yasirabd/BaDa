package com.siapataumenang.bada;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by M. Febra S on 25/05/2016.
 */
public class MenuBahasaAdapter extends RecyclerView.Adapter<MenuBahasaAdapter.MyViewHolder> {

    private List<MenuBahasa> bahasaList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView bahasa;

        public MyViewHolder(View view) {
            super(view);
            bahasa = (TextView) view.findViewById(R.id.bahasa);
        }
    }

    public MenuBahasaAdapter(List<MenuBahasa> bahasaList) {
        this.bahasaList = bahasaList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_bahasa_text_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MenuBahasa menuBahasa = bahasaList.get(position);
        holder.bahasa.setText(menuBahasa.getBahasa());
    }

    @Override
    public int getItemCount() {
        return bahasaList.size();
    }
}
