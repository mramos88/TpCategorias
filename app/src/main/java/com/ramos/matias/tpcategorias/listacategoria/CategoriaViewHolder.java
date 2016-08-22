package com.ramos.matias.tpcategorias.listacategoria;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by matias on 19/08/2016.
 */
public class CategoriaViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener {


    public CategoriaViewHolder(View itemView) {
        super(itemView);

        itemView.setOnCreateContextMenuListener(this);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Select The Action");
        menu.add(Menu.NONE, v.getId(), Menu.NONE, "Share");//groupId, itemId, order, title
        menu.add(Menu.NONE, v.getId(), Menu.NONE, "Favorita");
        menu.add(Menu.NONE, v.getId(), Menu.NONE, "Copy");
        menu.add(Menu.NONE, v.getId(), Menu.NONE, "Print");


    }




}