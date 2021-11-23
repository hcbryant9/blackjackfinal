package com.example.blackjackfinal;

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
    public int getVal(int val){
        return this.val;
    }
    public char getSuit(char suit){
        return this.suit;
    }
}