package com.example.blackjackfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int balance = 0;
    private Button playBTN;
    private Button addFundsBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Makes play button respond to a click and if the balance is 0 then it says insufficient funds
        playBTN = findViewById(R.id.playbtn);
        playBTN.setOnClickListener(view -> {
            if(balance==0) {
                Toast.makeText(getApplicationContext(), "insufficient funds", Toast.LENGTH_SHORT).show();
            }
        });
        //Makes add funds button respond to a click and bring them to Add funds activity
        addFundsBTN = findViewById(R.id.addFundsBTN);
        addFundsBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "insufficient funds", Toast.LENGTH_SHORT).show();
                openAddFundsScreen();
            }
        });
    }
    public void openAddFundsScreen(){
        Intent intent = new Intent(this, AddFunds.class);
        startActivity(intent);
    }
}