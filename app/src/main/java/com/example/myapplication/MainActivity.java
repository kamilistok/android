package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    //deklaracja

    EditText email, password;
    Button button;

    String emailString;
    String passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wyszukanie po id
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);

        //ustawienie nasłuchiwania na click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                emailString = email.getText().toString();
                passwordString = password.getText().toString();

                Intent i = new Intent(getApplicationContext(), Activity2.class);
                i.putExtra("Email", ""+ emailString);
                startActivity(i);

            }
        });
    }
}