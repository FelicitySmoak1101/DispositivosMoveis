package com.example.aula;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button buttonNext = (Button) findViewById(R.id.btnNext);
        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
        Intent it = new Intent(this, Login.class);
        startActivity(it);
    }
}
