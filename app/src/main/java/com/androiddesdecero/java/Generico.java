package com.androiddesdecero.java;

import android.util.Log;

/**
 * Created by albertopalomarrobledo on 8/2/19.
 */

public class Generico<T> {
    //Objeto generico -> Se va a implementar más adelante su tipo de dato
    private T t;

    public Generico(T t){
        this.t = t;
        Log.d("TAG1", "T es " + t.getClass() + "->" + t.toString());
    }

}
