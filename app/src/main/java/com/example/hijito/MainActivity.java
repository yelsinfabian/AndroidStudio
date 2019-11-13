package com.example.hijito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btnProducts;
    private  Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // se enlasa el activity + layout
        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Log.i(Settings.INFO, "Products");
                // intent sirve para cambear de pantalla
                Intent i = new Intent(MainActivity.this, ProducListActivity.class); //para saltar ala siguiente pantalla
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i(Settings.INFO,"About us");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
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
