package com.example.aula;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonLogin = (Button) findViewById(R.id.btnLogin);
        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void onClickLogin (View view){
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
    }

}
