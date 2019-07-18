package com.example.ventasmobileapp_ceci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PedidoHecho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_hecho);

        Intent i = getIntent();
        String producto1 = i.getStringExtra(ingreso.PRODUCTO_ELEGIDO);

        TextView textview1 = (TextView) findViewById(R.id.PedidoProducto);
        textview1.setText(producto1);
    }
}

