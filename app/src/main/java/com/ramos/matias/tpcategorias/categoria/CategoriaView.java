package com.ramos.matias.tpcategorias.categoria;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.ramos.matias.tpcategorias.R;

import java.io.File;

/**
 * Created by matias on 27/08/2016.
 */
public class CategoriaView {
    private ImageButton btnCamara;
    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
    private Uri fileUri;
    private CategoriaActivity a;
    private Uri imagen;
    private ImageView imagenTomada;


    public  CategoriaView(CategoriaActivity a, CategoriaController controller){
        btnCamara = (ImageButton)a.findViewById(R.id.btnCamara);
        btnCamara.setOnClickListener(controller);
        this.imagenTomada = (ImageView) a.findViewById(R.id.imgTomada);
        this.a=a;

    }

    public void tomarFoto() {
// create Intent to take a picture and return control to the calling application
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //TODO ver esto:
        File imagesFolder = new File(Environment.getExternalStorageDirectory(), "MyImages");
        imagesFolder.mkdirs(); // <----
        File image = new File(imagesFolder, "image_001.jpg");
        fileUri = Uri.fromFile(image);


        if (ContextCompat.checkSelfPermission(a, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
            && ContextCompat.checkSelfPermission(a,Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){


        /* Se realiza la petición del permiso. En este caso permisos
        para leer los contactos.*/
                ActivityCompat.requestPermissions(a,
                        new String[]{Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        CategoriaActivity.MY_PERMISSIONS_REQUEST_READ_CONTACTS);

        }else {

            intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri); // set the image file name


            a.startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);

        }





    }

    public void setImagen(Uri imagen) {
        this.imagen = imagen;
        Log.d("img",fileUri.toString());

        this.imagenTomada.setImageURI(fileUri);
    }
}
