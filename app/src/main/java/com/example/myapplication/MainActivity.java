package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    TextView text;
    EditText nombre, telefono, email, descripcion;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.txt_fechabtn);
        nombre = (EditText) findViewById(R.id.edit_nombre);
        telefono = (EditText) findViewById(R.id.edit_telefono);
        email = (EditText) findViewById(R.id.edit_email);
        descripcion = (EditText) findViewById(R.id.edit_descripcion);



        Button btnsiguiente = (Button) findViewById(R.id.btn_siguiente);
        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, ContenidoMainActivity.class);

                Bundle miBundle = new Bundle();
                miBundle.putString("nombre", nombre.getText().toString());
                miBundle.putString("fecha", texto.getText().toString());
                miBundle.putString("telefono", telefono.getText().toString());
                miBundle.putString("email", email.getText().toString());
                miBundle.putString("descripcion", descripcion.getText().toString());

                i.putExtras(miBundle);

                startActivity(i);
            }
        });
    }

    public void onclickdatepicker(View view){
        DatePickerDialog date = new DatePickerDialog(this, this, 2000,1,1);
        date.show();
    }
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        texto.setText(String.format("%1$04d/%2$02d/%3$02d",year, (monthOfYear+1), dayOfMonth));
    }


}