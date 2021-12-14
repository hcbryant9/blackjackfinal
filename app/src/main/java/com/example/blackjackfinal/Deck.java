package com.example.blackjackfinal;

import java.util.Random;

public class Deck {
    /*create an array of 52 cards to be the deck*/
    Card[] deck = new Card[52];
    private int nextCard;
    /*creating the deck like it would be coming out of a new box
    * goes through each suit and creates 13 cards all increasing in value
    * we will be worrying about shuffling later
    * */
    public Deck(){
        /*we need a counter for all loops to see where we are in the deck*/
        int index = 0;
        /*loop for diamonds*/
        for (int i = 1; i<=13; i++){
            deck[index] = new Card(i,'d');
            index++;
        }
        /*loop for club*/
        for (int i = 1; i<=13; i++){
            deck[index] = new Card(i,'c');
            index++;
        }
        /*loop for hearts*/
        for (int i = 1; i<=13; i++){
            deck[index] = new Card(i,'h');
            index++;
        }
        /*loop for spades*/
        for (int i = 1; i<=13; i++){
            deck[index] = new Card(i,'s');
            index++;
        }
    }

    public void shuffle(){
        Card swap;
        Random random = new Random();
        for (int i = 0; i < 52; i++){
            int ran = i + random.nextInt(52-i);
            swap = deck[ran];
            deck[ran] = deck[i];
            deck[i] = swap;
        }
    }


    /*next card in the deck*/
    public Card nextCard(){
        nextCard++;
        return deck[nextCard];
    }
}
