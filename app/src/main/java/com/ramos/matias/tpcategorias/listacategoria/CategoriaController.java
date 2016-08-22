package com.ramos.matias.tpcategorias.listacategoria;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by matias on 21/08/2016.
 */
public class CategoriaController implements View.OnClickListener {
    Activity activity;
    public CategoriaController(Activity activity){
        this.activity = activity;
    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent(activity,CategoriaActivity.class);
        activity.startActivity(i);
    }
}
