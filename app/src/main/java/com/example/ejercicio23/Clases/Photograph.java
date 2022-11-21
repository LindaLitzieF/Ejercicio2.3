package com.example.ejercicio23.Clases;

import android.graphics.Bitmap;

public class Photograph {

    Bitmap imagen;
    String descripcion;

    public Photograph(Bitmap imagen, String descripcion)
    {
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public Bitmap getImagen()
    {
        return imagen;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

}