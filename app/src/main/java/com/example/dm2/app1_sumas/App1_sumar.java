package com.example.dm2.app1_sumas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class App1_sumar extends AppCompatActivity {

    private EditText txtPrimer;
    private EditText txtSegundo;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app1_sumar);

        txtPrimer = (EditText) findViewById(R.id.txtPrimer);
        txtSegundo = (EditText) findViewById(R.id.txtSegundo);
        lblResultado = (TextView) findViewById(R.id.lblResultado);
    }

        public void sumar(View v){
            int num1=Integer.parseInt(txtPrimer.getText().toString());
            int num2=Integer.parseInt(txtSegundo.getText().toString());
            int resultado=num1+num2;

            lblResultado.setText(lblResultado.getText().toString()+" "+resultado);
         }



}
