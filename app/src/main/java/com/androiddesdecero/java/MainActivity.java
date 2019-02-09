package com.androiddesdecero.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();
        Moto moto = new Moto();
        Log.d("TAG1", "------------------");
        instanciaDe(coche);
        instanciaDe(moto);
        instanciaDe(vehiculo);
        */
        usoGenericos();
    }


    /*
    Super y This
    Cuando utilizamos herencia en Java, en los contructores de las clases
    hijas siempre se debe llamar a super(argumentos) o this(argumentos)

    Super -> hace referencia a que se va a ejecutar el contructor clase padre

    This -> Hace referencia a un contructor de la clase actual.
     */

    private void probarSuper(){
        Vehiculo vehiculo = new Vehiculo();
        Log.d("TAG1", "------------------");
        Coche coche = new Coche();
        Log.d("TAG1", "------------------");
        Moto moto = new Moto(3);
        Log.d("TAG1", "------------------");
        Moto moto1 = new Moto();
    }

    /*
    El operador instaceOf permite verificar si un objeto pertenece
    a una determinada clase o interface.
    Tambien tiene en cuenta la herencia. Es decir si tiene
    una clase padre.
     */
    private void instanciaDe(Object t){
        if(t instanceof Coche){
            Log.d("TAG1", "Instancia de Coche");
        }else if(t instanceof Moto){
            Log.d("TAG1", "Instancia de Moto");
        }else if(t instanceof Vehiculo){
            Log.d("TAG1", "Instancia de Vehiculo");
        }
    }

    /*
    Genericos
    Los genericos nos permiten crear clases, interfaces y metodos
    en los que el tipo de dato que se va a utilizar se pasa como parametro.

    La principal ventaja es que trabaja con el tipo de dato que se le
    pasa como parametro.
     */

    private void usoGenericos(){
        Generico<String> generico = new Generico<>("HOLA");
        Generico<Integer> genericoEntero = new Generico<>(10);
        Coche coche = new Coche();
        Generico<Coche> genericoCoche = new Generico<>(coche);
    }

    /*
        Wildcards - Comodines
        Nos permite poder ejecutar nuestros genericos sin indicar
        el tipo de dato. Es decir el dato se da en tiempo de
        ejecución.
     */

}
