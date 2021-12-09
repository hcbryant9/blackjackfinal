package com.example.blackjackfinal;

public class Hands {
    /*each player will have a card array as their hand the max size of a players hand is 11*/
    private Card[] hand = new Card[11];
    /*the size variable shows how many cards are currently in their hand*/
    private int size = 0;
    /* the total method will calculate the total
    *  a boolean is required to see if their card is an ace (the val is 1)
    * */
    public int total(){
        int val;
        int total = 0;
        boolean isAce = false;
        /*loop through size of hand adding each card value*/
        for(int i=0; i<size; i++){
            val = hand[i].getVal();
            if(val > 10) {
                val = 10;
            } else if ( val == 1){ /*this means it is an ace*/
                isAce = true;
            }
            total += val;
        }
        if (isAce && total + 11 <= 21){ /*if an ace doesn't bust the hand then add 11*/
            total += 11;
        }
        return total;
    }
    public void hit(Card card) {
        size++;
        hand[size] = card;
    }
    public void clear(){
        size = 0;
    }
}
