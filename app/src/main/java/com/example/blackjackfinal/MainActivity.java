package com.example.blackjackfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    public static void main(String [] args) {
        Game newGame = new Game();
        newGame.blackJack();
    }
    */

    private Button playBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Makes play button respond to a click and if the balance is 0 then it says insufficient funds
        playBTN = findViewById(R.id.playbtn);
        playBTN.setOnClickListener(view -> {
            /*sends user to play screen*/
            /*plays the game*/
        });
        //Makes add funds button respond to a click and bring them to Add funds activity


    }
}
