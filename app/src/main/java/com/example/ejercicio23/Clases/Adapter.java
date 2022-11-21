package com.example.ejercicio23.Clases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejercicio23.R;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Photograph> {

    ArrayList<Photograph> listaImagenes = new ArrayList<>();

    public Adapter(Context context, int textViewResourceId, ArrayList<Photograph> objects) {
        super(context, textViewResourceId, objects);
        listaImagenes = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.verlista, null);
        ImageView imageView = (ImageView) v.findViewById(R.id.img);
        imageView.setImageBitmap(listaImagenes.get(position).getImagen());
        TextView textView = (TextView) v.findViewById(R.id.txt);
        textView.setText(listaImagenes.get(position).getDescripcion());
        return v;
    }

}