package com.ramos.matias.tpcategorias.categoria;

import android.util.Log;
import android.view.View;

/**
 * Created by matias on 27/08/2016.
 */
public class CategoriaController  implements View.OnClickListener{
    private CategoriaView view;
    @Override
    public void onClick(View v) {

        Log.d("TOMO FOTO","INtento tomar foto");
        view.tomarFoto();

    }

    public void setView(CategoriaView view){
        this.view=view;
    }
}
