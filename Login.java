package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtSenha=(EditText) findViewById(R.id.editTextTextPassword);
        edtNome=(EditText) findViewById(R.id.editTextTextPersonName);
        Button buttonLogin = (Button) findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(this::onClickLogin);
    }


    public void onClickLogin (View view){
        String nome = edtNome.getText().toString();
        Intent intentEnvia = new Intent(getApplicationContext(),TelaPrincipal.class);
        Bundle parametros = new Bundle();
        parametros.putString("chave_nome",nome);
        intentEnvia.putExtras(parametros);
        startActivity(intentEnvia);

        if(edtNome==edtSenha) {
            Intent intent = new Intent(this, TelaPrincipal.class);
            startActivity(intent);
        }

        if(edtNome != edtSenha)
        {
            Context context = getApplicationContext();
            CharSequence text = "Nome e senha informados são diferente";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
