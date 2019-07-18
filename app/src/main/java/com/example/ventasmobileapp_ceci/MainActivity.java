package com.example.ventasmobileapp_ceci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.Ingresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = ((EditText) findViewById(R.id.email)).getText().toString();
                String contraseña = ((EditText) findViewById(R.id.contraseña)).getText().toString();

                if (usuario.equals("admin")&& contraseña.equals("admin")){

                    Intent intent = new Intent(MainActivity.this, ingreso.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(),"No es un usuario", Toast.LENGTH_SHORT);
                }


            }
        });

    }
}
