package com.example.apppenciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //DECLARACION DE ETIQUETAS
    TextView tVPago1,tVPago2,tVPago3;
    EditText eTMonto,eTEdad1,eTEdad2,eTEdad3;
    Button bRepartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tVPago1=findViewById(R.id.tVPago1);
        tVPago2=findViewById(R.id.tVPago2);
        tVPago3=findViewById(R.id.tVPago3);
        eTMonto=findViewById(R.id.eTMonto);
        eTEdad1=findViewById(R.id.eTEdad1);
        eTEdad2=findViewById(R.id.eTEdad2);
        eTEdad3=findViewById(R.id.eTEdad3);
        bRepartir=findViewById(R.id.bRepartir);
        Calcular calcular= new Calcular();

        bRepartir.setOnClickListener(view -> {
        calcular.setEdad(Integer.valueOf(eTEdad1.getText().toString()));
        calcular.sumarEdades();
        calcular.setEdad(Integer.valueOf(eTEdad2.getText().toString()));
        calcular.sumarEdades();
        calcular.setEdad(Integer.valueOf(eTEdad3.getText().toString()));
        calcular.sumarEdades();

        calcular.setMontoR(Double.parseDouble(eTMonto.getText().toString()));

        calcular.montoPersona(Integer.valueOf(eTEdad1.getText().toString()));
        tVPago1.setText(String.valueOf(calcular.getMontoP()));

        calcular.montoPersona(Integer.valueOf(eTEdad2.getText().toString()));
        tVPago2.setText(String.valueOf(calcular.getMontoP()));

        calcular.montoPersona(Integer.valueOf(eTEdad3.getText().toString()));
        tVPago3.setText(String.valueOf(calcular.getMontoP()));

        calcular.setSumaEdad(0);


        });


    } //FAINAL DE LA CLASE PROTECTER
} //FINALD EL A CLASE CPINCIPAL