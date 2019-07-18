package com.example.ventasmobileapp_ceci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ingreso extends AppCompatActivity {


    public static final String PRODUCTO_ELEGIDO = "com.example.ventasmobileapp_ceci.PRODUCTO_ELEGIDO";
    private Spinner spinnerProducto;
    private Spinner spinnerCantidad;
    private Spinner spinnerCliente;
    private String item;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);

        spinnerProducto = findViewById(R.id.spinnerProducto);
        spinnerCantidad = findViewById(R.id.spinnerCantidad);
        spinnerCliente = findViewById(R.id.spinnerCliente);

        List<String> productos = new ArrayList<>();
        productos.add(0,"producto");
        productos.add("Arroz");
        productos.add("Harina");
        productos.add("yerba");

        List<String> cantidad = new ArrayList<>();
        cantidad.add(0,"cantidad");
        cantidad.add("1");
        cantidad.add("2");
        cantidad.add("3");

        List<String> clientes = new ArrayList<>();
        clientes.add(0,"clientes");
        clientes.add("Sofia");
        clientes.add("pablo");
        clientes.add("Ariel");


        ArrayAdapter<String> dataProducto; // para popular en el spinner los datos de productos disponibles.
        dataProducto = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, productos);
        dataProducto.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProducto.setAdapter(dataProducto);

        spinnerProducto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                item =adapterView.getItemAtPosition(i).toString(); // guardo el item seleccionado


                /*
                if (adapterView.getItemAtPosition(i).equals("producto")){

                }else{

                    //al seleccionar
                    String item = adapterView.getItemAtPosition(i).toString();
                    // mostrar lo que se selecciono
                    Toast.makeText(adapterView.getContext(), "Selecciono: " + item, Toast.LENGTH_SHORT);
                    // otras operaciones
                }*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayAdapter<String> dataCantidad;
        dataCantidad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,cantidad);
        dataCantidad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCantidad.setAdapter(dataCantidad);
        ArrayAdapter<String> dataCliente;
        dataCliente = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,clientes);
        dataCliente.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCliente.setAdapter(dataCliente);



        Button botonPedido = (Button) findViewById(R.id.IngresarPedido);
        botonPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentPedidoHecho1 = new Intent(ingreso.this, PedidoHecho.class);
                intentPedidoHecho1.putExtra(PRODUCTO_ELEGIDO,item);
                startActivity(intentPedidoHecho1);


            }
        });



    }
}
