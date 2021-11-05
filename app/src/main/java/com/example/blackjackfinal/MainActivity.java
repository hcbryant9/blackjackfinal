package com.example.blackjackfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int balance = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playBTN = findViewById(R.id.playbtn);
        playBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.i("My App", "This is a magic log message!");
                if(balance==0) {
                    Toast.makeText(getApplicationContext(), "insufficient funds", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}