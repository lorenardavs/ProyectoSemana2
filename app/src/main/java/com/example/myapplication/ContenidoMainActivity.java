package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContenidoMainActivity extends AppCompatActivity {
    TextView txt_nombre, txt_fecha, txt_telefono,txt_email, txt_descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenido_main);

        txt_nombre = (TextView) findViewById(R.id.txt_nombre);
        txt_fecha = (TextView) findViewById(R.id.txt_fecha2) ;
        txt_telefono = (TextView) findViewById(R.id.txt_telefono);
        txt_email = (TextView) findViewById(R.id.txt_email);
        txt_descripcion = (TextView) findViewById(R.id.txt_descripcion);

        Bundle miBundle = this.getIntent().getExtras();
        if (miBundle != null){

            String nombres = miBundle.getString("nombre");
            txt_nombre.setText("" +nombres);

            String fechas = miBundle.getString("fecha");
            txt_fecha.setText("" +fechas);

            String telefonos = miBundle.getString("telefono");
            txt_telefono.setText("" +telefonos);

            String emails = miBundle.getString("email");
            txt_email.setText("" +emails);

            String descripcion = miBundle.getString("descripcion");
            txt_descripcion.setText("" +descripcion);

        }

    }

    // Metodo boton Editar
    public void OnclickEditar(View view){
        finish();
    }
}