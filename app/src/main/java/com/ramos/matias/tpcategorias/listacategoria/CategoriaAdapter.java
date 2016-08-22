package com.ramos.matias.tpcategorias.listacategoria;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ramos.matias.tpcategorias.R;

import java.util.List;

/**
 * Created by matias on 19/08/2016.
 */
public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaViewHolder> {
    List<Categoria> categorias;
    public CategoriaAdapter(List<Categoria> categorias){
        this.categorias=categorias;
    }
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public CategoriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoria,parent,false);
        CategoriaViewHolder viewHolder = new CategoriaViewHolder(v);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final CategoriaViewHolder holder, int position) {
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                setPosition(holder.getPosition());
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.categorias.size();
    }
}

