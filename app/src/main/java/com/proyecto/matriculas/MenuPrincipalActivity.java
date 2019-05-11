package com.proyecto.matriculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.widget.ArrayAdapter;
import java.util.List;

public class MenuPrincipalActivity extends AppCompatActivity {
    Spinner spinnerAlerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);spinnerAlerta = findViewById(R.id.spinnerAlerta);


        ArrayAdapter adaptador = ArrayAdapter.createFromResource(this, R.array.spinnerAlerta,R.layout.support_simple_spinner_dropdown_item);
        final Spinner spinnerEstadoCivil = findViewById(R.id.spinnerAlerta);
        spinnerEstadoCivil.setAdapter(adaptador);
    }

    public void clickEscanear(View view) {
        startActivity(new Intent(getApplicationContext(), CamaraActivity.class));
    }
}