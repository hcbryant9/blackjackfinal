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
    private Deck deck = new Deck();
    private User user = new User();
    private Dealer dealer = new Dealer();
    private Hands dealerHand;
    private Hands userHand;
    public boolean hitOrStand(){
        /*display hit or stand button
        * on click make them disappear
        * store the data
        * return the input
        * put the hit button in a while loop
        * */
        return true;
    }
    public void displayCards(Hands hand){
        /*display that hand*/
    }
    public void winner(Hands user, Hands dealer, boolean dealerBust, boolean userBust){
        /*if one person bust or they have the same total*/
        if(userBust && !dealerBust){
            /*dealer win*/
        } else if (!userBust && dealerBust){
            /*user wins*/
        } else if ((userBust && dealerBust) ||(user.total()==dealer.total()) ){
            /*draw*/
        }
        if(user.total() > dealer.total()){
            /*user win*/
        } else if (user.total() < dealer.total()){
            /*dealer wins*/
        }

    }
    public void game(){
        /*shuffle the deck and then create two Hands -> one for the user and one for the dealer*/
        deck.shuffle();
        dealerHand = new Hands();
        dealer.dealerDraw(deck.nextCard());
        dealer.dealerDraw(deck.nextCard());
        displayCards(dealerHand);
        userHand = new Hands();
        user.userDraw(deck.nextCard());
        user.userDraw(deck.nextCard());
        /*display the cards -> the dealer than goes first -> then ask user to hit or stand*/
        displayCards(userHand);
        dealer.dealerBrain(deck);

        if (hitOrStand()){
            user.userDraw(deck.nextCard());
            displayCards(userHand);
        }


        /*logic to see who wins*/
        winner(userHand,dealerHand,dealer.getDealerBust(),user.getUserBust());
    }
}