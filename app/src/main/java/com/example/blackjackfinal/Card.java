package com.example.blackjackfinal;

import androidx.annotation.NonNull;

public class Card {
    private int val;
    private char suit;
    private Card(){
        suit = ' ';
        val = 0;
    }
    public Card(int val, char suit){
        this.val = val;
        this.suit = suit;
    }
    /*getters for value and suit*/
    public int getVal(){
        return this.val;
    }
    public char getSuit(){
        return this.suit;
    }
    /*compares the suit and returns a boolean*/

}