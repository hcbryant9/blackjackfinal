package com.example.blackjackfinal;

import android.widget.EditText;
import android.widget.ImageView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity {
    private Deck deck = new Deck();
    private User user = new User();
    private Dealer dealer = new Dealer();
    private Hands dealerHand;
    private Hands userHand;

    private ImageView aceclub;
    private ImageView acespade;
    private ImageView acediamond;
    private ImageView aceheart;
    private ImageView twoclub;
    private ImageView twospade;
    private ImageView twodiamond;
    private ImageView twoheart;
    private ImageView threeclub;
    private ImageView threespade;
    private ImageView threediamond;
    private ImageView threeheart;
    private ImageView fourclub;
    private ImageView fourspade;
    private ImageView fourdiamond;
    private ImageView fourheart;
    private ImageView fiveclub;
    private ImageView fivespade;
    private ImageView fivediamond;
    private ImageView fiveheart;
    private ImageView sixclub;
    private ImageView sixspade;
    private ImageView sixdiamond;
    private ImageView sixheart;
    private ImageView sevenclub;
    private ImageView sevenspade;
    private ImageView sevendiamond;
    private ImageView sevenheart;
    private ImageView eightclub;
    private ImageView eightdiamond;
    private ImageView eightspade;
    private ImageView eightheart;
    private ImageView ninespade;
    private ImageView ninediamond;
    private ImageView nineheart;
    private ImageView nineclub;
    private ImageView tenspade;
    private ImageView tenclub;
    private ImageView tendiamond;
    private ImageView tenheart;
    private ImageView jackclub;
    private ImageView jackspade;
    private ImageView jackdiamond;
    private ImageView jackheart;
    private ImageView queenclub;
    private ImageView queenheart;
    private ImageView queenspade;
    private ImageView queendiamond;
    private ImageView kingheart;
    private ImageView kingspade;
    private ImageView kingdiamond;
    private ImageView kingclub;
    //private TextView theTextView;



    public void winner(Hands user, Hands dealer, boolean dealerBust, boolean userBust) {
        /*if one person bust or they have the same total*/
        if (userBust && !dealerBust) {
            /*dealer win*/
        } else if (!userBust && dealerBust) {
            /*user wins*/
        } else if ((userBust && dealerBust) || (user.total() == dealer.total())) {
            /*draw*/
        }
        if (user.total() > dealer.total()) {
            /*user win*/
        } else if (user.total() < dealer.total()) {
            /*dealer wins*/
        }

    }
    public boolean hitOrStand(){
        /*display hit or stand button
         * on click make them disappear
         * store the data
         * return the input
         * put the hit button in a while loop
         * */
        return true;
    }

    protected void displayCards(Hands hand, boolean isUser){
        int i;
        int val;
        char suit;
        val = hand.find(1).getVal();
        suit = hand.find(1).getSuit();

    }
    public void blackJack(){

        /*shuffle the deck and then create two Hands -> one for the user and one for the dealer*/
        //deck.shuffle();
        dealerHand = new Hands();
        dealerHand.hit(deck.nextCard());
        dealerHand.hit(deck.nextCard());
        deck.shuffle();
        //ImageView jackdiamond2 = findViewById(R.id.jackdiamond);
        //displayCards(dealerHand,false);

        //dealer.dealerDraw(deck.nextCard());
        //dealer.dealerDraw(deck.nextCard());
        //userHand = new Hands();
        //user.userDraw(deck.nextCard());
        //user.userDraw(deck.nextCard());
        //userHand.hit(deck.nextCard());
        //userHand.hit(deck.nextCard());

        /*display the cards -> the dealer than goes first -> then ask user to hit or stand*/
        //displayCards(dealerHand,false);



        //dealer.dealerBrain(deck);

        //if (hitOrStand()){
            //user.userDraw(deck.nextCard());
            //displayCards(userHand);
        //}


        /*logic to see who wins*/
        //winner(userHand,dealerHand,dealer.getDealerBust(),user.getUserBust());

    }
}