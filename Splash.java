package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Button buttonNext = (Button) findViewById(R.id.btnNext);
        buttonNext.setOnClickListener(this::onClick);
    }


    public void onClick (View v){
        Intent it = new Intent(this, Login.class);
        startActivity(it);
    }
}
