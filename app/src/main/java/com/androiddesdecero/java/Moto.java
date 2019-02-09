package com.androiddesdecero.java;

import android.util.Log;

/**
 * Created by albertopalomarrobledo on 8/2/19.
 */

public class Moto extends Vehiculo {

    int velocidadMoto;

    public Moto(){
        this(0);
        Log.d("TAG1", "Constructor Moto");
    }

    public Moto(int velocidadMoto){
        this.velocidadMoto = velocidadMoto;
        Log.d("TAG1", "Constructor Moto - Con argumento de entrada");

    }

    public int velocidadMaxima(){
        return 70;
    }
}
