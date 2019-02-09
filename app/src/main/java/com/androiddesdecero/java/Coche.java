package com.androiddesdecero.java;

import android.util.Log;

/**
 * Created by albertopalomarrobledo on 8/2/19.
 */

public class Coche extends Vehiculo {

    public Coche(){
        Log.d("TAG1", "Constructor Coche");
    }

    public int velocidadMaxima(){
        return 10;
    }
}
