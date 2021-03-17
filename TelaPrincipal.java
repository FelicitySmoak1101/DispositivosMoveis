package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    private TextView edtCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        edtCliente=(TextView) findViewById(R.id.cliente);
        Intent intentRecebe = getIntent();
        Bundle parametros = intentRecebe.getExtras();
        if (parametros != null){
            String nome = parametros.getString("chave_nome");
            edtCliente = findViewById(R.id.editTextTextPersonName);
        }


        Button buttonSplash = (Button) findViewById(R.id.btnSplash);
        buttonSplash.setOnClickListener(this::onClickSplash);

        Button buttonVoltar = (Button) findViewById(R.id.btnVoltar);
        buttonVoltar.setOnClickListener(this::onClickVoltar);
    }


    public void onClickSplash(View v) {
        Intent inte = new Intent(this, Splash.class);
        startActivity(inte);
    }
    
    public void onClickVoltar(View v) {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
}

    @Override
    public void onClickVoltar(View v) {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
}
