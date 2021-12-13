package com.example.blackjackfinal;

import android.widget.ImageView;
import android.view.View;

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


    public Game() {
    }

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
        //for (i = 0; i<hand.getSize();i++){
        val = hand.find(1).getVal();
        suit = hand.find(1).getSuit();
        switch(val){
            case 0: switch (suit){
                case 's': acespade.setVisibility(View.VISIBLE);
                    break;
                case 'c': aceclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': acediamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': aceheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 1: switch (suit){
                case 's': twospade.setVisibility(View.VISIBLE);
                    break;
                case 'c': twoclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': twodiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': twoheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 2: switch (suit){
                case 's': threespade.setVisibility(View.VISIBLE);
                    break;
                case 'c': threeclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': threediamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': threeheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 3: switch (suit){
                case 's': fourspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': fourclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': fourdiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': fourheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 4: switch (suit){
                case 's': fivespade.setVisibility(View.VISIBLE);
                    break;
                case 'c': fiveclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': fivediamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': fiveheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 5: switch (suit){
                case 's': sixspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': sixclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': sixdiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': sixheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 6: switch (suit){
                case 's': sevenspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': sevenclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': sevendiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': sevenheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 7: switch (suit){
                case 's': eightspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': eightclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': eightdiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': eightheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 8: switch (suit){
                case 's': ninespade.setVisibility(View.VISIBLE);
                    break;
                case 'c': nineclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': ninediamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': nineheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 9: switch(suit){
                case 's': tenspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': tenclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': tendiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': tenheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 10: switch (suit){
                case 's': jackspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': jackclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': jackdiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': jackheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 11: switch (suit){
                case 's': queenspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': queenclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': queendiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': queenheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
            case 12: switch (suit){
                case 's': kingspade.setVisibility(View.VISIBLE);
                    break;
                case 'c': kingclub.setVisibility(View.VISIBLE);
                    break;
                case 'd': kingdiamond.setVisibility(View.VISIBLE);
                    break;
                case 'h': kingheart.setVisibility(View.VISIBLE);
                    break;
            }
                break;
        }
        //}
    }
    public void blackJack(){
        /*shuffle the deck and then create two Hands -> one for the user and one for the dealer*/
        //deck.shuffle();
        dealerHand = new Hands();
        //dealerHand.hit(deck.nextCard());
        //dealerHand.hit(deck.nextCard());
        //displayCards(dealerHand,false);
        dealer.dealerDraw(deck.nextCard());
        dealer.dealerDraw(deck.nextCard());
        userHand = new Hands();
        user.userDraw(deck.nextCard());
        user.userDraw(deck.nextCard());
        //userHand.hit(deck.nextCard());
        //userHand.hit(deck.nextCard());

        /*display the cards -> the dealer than goes first -> then ask user to hit or stand*/
        displayCards(dealerHand,false);



        //dealer.dealerBrain(deck);

        //if (hitOrStand()){
            //user.userDraw(deck.nextCard());
            //displayCards(userHand);
        //}


        /*logic to see who wins*/
        //winner(userHand,dealerHand,dealer.getDealerBust(),user.getUserBust());

    }
}