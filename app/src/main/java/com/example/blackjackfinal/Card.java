package com.example.blackjackfinal;

import androidx.annotation.NonNull;

public class Card implements BlackjackFinal{
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
    public boolean compSuit(@NonNull Card card){
        return this.suit == card.getSuit();
    }
    /*compares the value of a param card and current card and returns a boolean*/
    public boolean compVal(@NonNull Card card){
        return this.val == card.getVal();
    }
    /*compares both value and suit*/
    public boolean compareTo(Card card){
        return (compSuit(card) && compVal(card));
    }
}