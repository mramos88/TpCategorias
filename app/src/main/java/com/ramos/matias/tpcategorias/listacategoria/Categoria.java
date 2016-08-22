package com.ramos.matias.tpcategorias.listacategoria;

import android.graphics.Bitmap;

/**
 * Created by matias on 19/08/2016.
 */
public class Categoria {

    private String nombre;
    private String descripcion;
    private String urlImg;
    private Bitmap img;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }
}
