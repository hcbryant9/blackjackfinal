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
    private ImageView aceclub = findViewById(R.id.aceclub);
    private ImageView acespade = findViewById(R.id.acespade);
    private ImageView acediamond = findViewById(R.id.acediamond);
    private ImageView aceheart = findViewById(R.id.aceheart);
    private ImageView twoclub = findViewById(R.id.twoclub);
    private ImageView twospade = findViewById(R.id.twospade);
    private ImageView twodiamond = findViewById(R.id.twodiamond);
    private ImageView twoheart = findViewById(R.id.twoheart);
    private ImageView threeclub = findViewById(R.id.threeclub);
    private ImageView threespade = findViewById(R.id.aceclub);
    private ImageView threediamond = findViewById(R.id.threediamond);
    private ImageView threeheart = findViewById(R.id.threeheart);
    private ImageView fourclub = findViewById(R.id.fourclub);
    private ImageView fourspade = findViewById(R.id.fourspade);
    private ImageView fourdiamond = findViewById(R.id.fourdiamond);
    private ImageView fourheart = findViewById(R.id.fourheart);
    private ImageView fiveclub = findViewById(R.id.fiveclub);
    private ImageView fivespade = findViewById(R.id.fivespade);
    private ImageView fivediamond = findViewById(R.id.fivediamond);
    private ImageView fiveheart = findViewById(R.id.fiveheart);
    private ImageView sixclub = findViewById(R.id.sixclub);
    private ImageView sixspade = findViewById(R.id.sixspade);
    private ImageView sixdiamond = findViewById(R.id.sixdiamond);
    private ImageView sixheart = findViewById(R.id.sixheart);
    private ImageView sevenclub = findViewById(R.id.sevenclub);
    private ImageView sevenspade = findViewById(R.id.sevenspade);
    private ImageView sevendiamond = findViewById(R.id.sevendiamond);
    private ImageView sevenheart = findViewById(R.id.sevenheart);
    private ImageView eightclub = findViewById(R.id.eightclub);
    private ImageView eightdiamond = findViewById(R.id.eightdiamond);
    private ImageView eightspade = findViewById(R.id.eightspade);
    private ImageView eightheart = findViewById(R.id.eightheart);
    private ImageView ninespade = findViewById(R.id.ninespade);
    private ImageView ninediamond = findViewById(R.id.ninediamond);
    private ImageView nineheart = findViewById(R.id.nineheart);
    private ImageView nineclub = findViewById(R.id.nineclub);
    private ImageView tenspade = findViewById(R.id.tenspade);
    private ImageView tenclub = findViewById(R.id.tenclub);
    private ImageView tendiamond = findViewById(R.id.tendiamond);
    private ImageView tenheart = findViewById(R.id.tenheart);
    private ImageView jackclub = findViewById(R.id.jackclub);
    private ImageView jackspade = findViewById(R.id.jackspade);
    private ImageView jackdiamond = findViewById(R.id.jackdiamond);
    private ImageView jackheart = findViewById(R.id.jackheart);
    private ImageView queenclub = findViewById(R.id.queenclub);
    private ImageView queenheart = findViewById(R.id.queenheart);
    private ImageView queenspade = findViewById(R.id.queenspade);
    private ImageView queendiamond = findViewById(R.id.queendiamond);
    private ImageView kingheart = findViewById(R.id.kingheart);
    private ImageView kingspade = findViewById(R.id.kingspade);
    private ImageView kingdiamond = findViewById(R.id.kingdiamond);
    private ImageView kingclub = findViewById(R.id.kingclub);

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
        for (i = 0; i<hand.getSize();i++){
            val = hand.find(i).getVal();
            suit = hand.find(i).getSuit();
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
        }
    }
    public void blackJack(){
        /*shuffle the deck and then create two Hands -> one for the user and one for the dealer*/
        //deck.shuffle();
        dealerHand = new Hands();
        dealerHand.hit(deck.nextCard());
        dealerHand.hit(deck.nextCard());
        displayCards(dealerHand,false);
        userHand = new Hands();
        userHand.hit(deck.nextCard());
        userHand.hit(deck.nextCard());
        /*display the cards -> the dealer than goes first -> then ask user to hit or stand*/
        displayCards(userHand,true);



        //dealer.dealerBrain(deck);

        //if (hitOrStand()){
            //user.userDraw(deck.nextCard());
            //displayCards(userHand);
        //}


        /*logic to see who wins*/
        //winner(userHand,dealerHand,dealer.getDealerBust(),user.getUserBust());

    }
}