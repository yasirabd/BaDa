package com.siapataumenang.bada;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by M. Febra S on 25/05/2016.
 */
public class MenuBahasaAdapter extends RecyclerView.Adapter<MenuBahasaAdapter.MenuViewHolder> {
    private List<MenuBahasa> menuBahasaList;

    public class MenuViewHolder extends RecyclerView.ViewHolder {
        public Button menu;

        public MenuViewHolder(View view) {
            super(view);
            menu = (Button) view.findViewById(R.id.button_menu);
        }
    }

    public MenuBahasaAdapter(List<MenuBahasa> menuBahasaList) {
        this.menuBahasaList = menuBahasaList;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_menu_bahasa, parent, false);

        return new MenuViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        MenuBahasa menuBahasa = menuBahasaList.get(position);
        holder.menu.setText(menuBahasa.getBahasa());
    }

    @Override
    public int getItemCount() {
        return menuBahasaList.size();
    }
}
