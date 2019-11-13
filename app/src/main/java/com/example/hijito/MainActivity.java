package com.example.hijito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume(){
        super.onResume();// este codigo se ejecuta antes de todos
        // en este punto la aplicacion ya cargo

        //this en un activity:es el contexto o la escensia de una pantalla tiene el poder de controlarlo
        // this es de tipo contexto
        Toast.makeText(this,
                "Hijito hecho",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void  onStop(){
        super.onStop();
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();
    }
}
