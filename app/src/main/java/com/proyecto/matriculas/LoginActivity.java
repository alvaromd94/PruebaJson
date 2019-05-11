package com.proyecto.matriculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText editTextUsuario;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsuario =  findViewById(R.id.editTextUsuario);
        editTextPassword =  findViewById(R.id.editTextPassword);
    }
    public void cickInicio(View view) {
        startActivity(new Intent(getApplicationContext(), MenuPrincipalActivity.class));
    }

    public void cickLimpiar(View view) {
        editTextUsuario.setText("");
        editTextPassword.setText("");
        //startActivity(new Intent(getApplicationContext(), ConsultaActivity.class));
    }
}
