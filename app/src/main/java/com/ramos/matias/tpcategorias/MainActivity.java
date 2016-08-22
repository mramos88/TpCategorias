package com.ramos.matias.tpcategorias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MainScreamManager mainScreamManager;
    EscuchadorClick escuchadorClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        escuchadorClick = new EscuchadorClick();
        mainScreamManager = new MainScreamManager(this,escuchadorClick);
        escuchadorClick.setMainScreamManager(mainScreamManager);


    }
}
