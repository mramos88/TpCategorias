package com.ramos.matias.tpcategorias;

import android.view.View;

/**
 * Created by matias on 19/08/2016.
 */
public class EscuchadorClick implements View.OnClickListener {
    MainScreamManager mainScreamManager;

    public void setMainScreamManager(MainScreamManager mainScreamManager){
        this.mainScreamManager = mainScreamManager;
    }
    public void onClick(View v){
        if(v.getId()== R.id.btnIngresar) {
            mainScreamManager.irIngresar();
        }else{
            mainScreamManager.irRegistrase();
        }
    }

}
