package com.example.blackjackfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button playBTN;
    private Button standBTN;
    private Button hitBTN;
    private Game newGame;
    private ImageView Card1a;
    private ImageView Card1b;
    private ImageView Card1c;
    private ImageView Card1d;
    private ImageView Card1e;
    private ImageView Card2a;
    private ImageView Card2b;
    private ImageView Card2c;
    private ImageView Card2d;
    private ImageView Card2e;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Makes play button respond to a click and if the balance is 0 then it says insufficient funds
        playBTN = findViewById(R.id.playbtn);
        standBTN = findViewById(R.id.standbtn);
        hitBTN = findViewById(R.id.hitbtn);
        Card1a = findViewById(R.id.cardback1a);
        Card1b = findViewById(R.id.cardback1b);
        Card1c = findViewById(R.id.cardback1c);
        Card1d = findViewById(R.id.cardback1d);
        Card1e = findViewById(R.id.cardback1e);
        Card2a = findViewById(R.id.cardback2a);
        Card2b = findViewById(R.id.cardback2b);
        Card2c = findViewById(R.id.cardback2c);
        Card2d = findViewById(R.id.cardback2d);
        Card2e = findViewById(R.id.cardback2e);
        playBTN.setOnClickListener(view -> {
            /*makes "playBTN" invisible*/
            playBTN.setVisibility(View.GONE);
            standBTN.setVisibility(View.VISIBLE);
            hitBTN.setVisibility(View.VISIBLE);
            Card1a.setVisibility(View.VISIBLE);
            Card1b.setVisibility(View.VISIBLE);
            Card1c.setVisibility(View.VISIBLE);
            Card1d.setVisibility(View.VISIBLE);
            Card1e.setVisibility(View.VISIBLE);
            Card2a.setVisibility(View.VISIBLE);
            Card2b.setVisibility(View.VISIBLE);
            Card2c.setVisibility(View.VISIBLE);
            Card2d.setVisibility(View.VISIBLE);
            Card2e.setVisibility(View.VISIBLE);

            /*plays the game*/
            newGame = new Game();
            newGame.blackJack();
        });
        //Makes add funds button respond to a click and bring them to Add funds activity


    }
}
