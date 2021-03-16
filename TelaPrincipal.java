package com.example.aula;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        Button buttonSplash = (Button) findViewById(R.id.btnSplash);
        buttonSplash.setOnClickListener(this);

        Button buttonVoltar = (Button) findViewById(R.id.btnVoltar);
        buttonVoltar.setOnClickListener(this);
    }


    @Override
    public void onClickSplash(View v) {
        Intent inte = new Intent(this, Splash.class);
        startActivity(inte);
    }

    @Override
    public void onClickVoltar(View v) {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
}
