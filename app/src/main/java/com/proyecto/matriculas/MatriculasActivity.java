package com.proyecto.matriculas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MatriculasActivity extends AppCompatActivity {

    TextView matricula, infraccion;
    CamaraActivity ca = new CamaraActivity();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matriculas);
        matricula = findViewById(R.id.matricula);
        infraccion = findViewById(R.id.infraccion);

        matricula.setText("Matrícula: " + App.matricula);
        infraccion.setText("Infracción: " + App.infraccion);

    }

    public void clickVolver(View view) {
        startActivity(new Intent(getApplicationContext(), CamaraActivity.class));
    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_volver, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;
    }

    @SuppressLint("NewApi")
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        startActivity(new Intent(getApplicationContext(), CamaraActivity.class));
        return false;
    }

    public void clicConsulta(View view) {
        startActivity(new Intent(getApplicationContext(), ConsultaActivity.class));
    }




}
