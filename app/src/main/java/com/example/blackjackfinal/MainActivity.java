package com.example.blackjackfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button playBTN;
    private Button standBTN;
    private Button hitBTN;
    private Game newGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Makes play button respond to a click and if the balance is 0 then it says insufficient funds
        playBTN = findViewById(R.id.playbtn);
        standBTN = findViewById(R.id.standbtn);
        hitBTN = findViewById(R.id.hitbtn);
        playBTN.setOnClickListener(view -> {
            /*makes "playBTN" invisible*/
            playBTN.setVisibility(View.GONE);
            standBTN.setVisibility(View.VISIBLE);
            hitBTN.setVisibility(View.VISIBLE);
            /*plays the game*/
            newGame = new Game();
            newGame.blackJack();
        });
        //Makes add funds button respond to a click and bring them to Add funds activity


    }
}
