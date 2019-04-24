package com.proyecto.matriculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void cickInicio(View view) {
        startActivity(new Intent(getApplicationContext(), CamaraActivity.class));
    }

    public void cickLimpiar(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
