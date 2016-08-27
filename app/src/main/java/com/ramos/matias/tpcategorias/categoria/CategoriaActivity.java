package com.ramos.matias.tpcategorias.categoria;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ramos.matias.tpcategorias.R;

public class CategoriaActivity extends AppCompatActivity {
    public static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 100;
    CategoriaView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        CategoriaController controller = new CategoriaController();
         view =new CategoriaView(this,controller);
        controller.setView(view);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d("llego foto", requestCode + "" + " " + data);
        if (requestCode == MY_PERMISSIONS_REQUEST_READ_CONTACTS) {
            if (resultCode == RESULT_OK) {
                view.setImagen(null);
            }
        }

    }
/*
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults)
    {
        Log.d("permiso","re"+requestCode);
        Log.d("permiso","re"+requestCode);
        switch (requestCode)
        {
            case MY_PERMISSIONS_REQUEST_READ_CONTACTS:
            {
                //Si la petición es cancelada, el resultado estará vacío.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    //Permiso aceptado, se podría acceder a los contactos del dispositivo.

                } else
                {
                    //Permiso denegado. Desactivar la funcionalidad que dependía de dicho permiso.
                }
                return;
            }

            // A continuación, se expondrían otras posibilidades de petición de permisos.
        }
    }*/
}
