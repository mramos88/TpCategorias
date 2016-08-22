package com.ramos.matias.tpcategorias;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

import com.ramos.matias.tpcategorias.listacategoria.ListaCategoriaActivity;

/**
 * Created by matias on 19/08/2016.
 */
public class MainScreamManager {
    Button btnRegistrarse;
    Button btnIngresar;
    Activity activity;

    public MainScreamManager(Activity activity,EscuchadorClick escuchadorClick){

        this.activity = activity;
        this.btnIngresar = (Button) activity.findViewById(R.id.btnIngresar);
        this.btnRegistrarse = (Button) activity.findViewById(R.id.btnRegistrarse);
        this.btnIngresar.setOnClickListener(escuchadorClick);
        this.btnRegistrarse.setOnClickListener(escuchadorClick);

    }

    public void irIngresar() {

        Intent i = new Intent(activity,ListaCategoriaActivity.class);
        activity.startActivity(i);

    }

    public void irRegistrase() {

    }
}
