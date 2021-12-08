package com.example.blackjackfinal;

public class Dealer {
    /*create a hand for the dealer*/
    private Hands dealerHand = new Hands();
    private boolean dealerBust = false;
    /*function that sees if the dealer has black jack*/
    public void setDealerBust(boolean bust){
        dealerBust = bust;
    }
    public boolean getDealerBust(){
        return dealerBust;
    }
    public boolean doesDealerBlackJack(){
        if(dealerHand.total()==21){
            return true;
        }
        return false;
    }

    /* the brain of the dealer test */
    public void dealerBrain(Deck currDeck) {
        int dealerTotal = dealerHand.total();
        while (dealerTotal < 16 ) { /*16 is where a casino dealer is told to hit or not*/
            dealerHand.hit(currDeck.nextCard()); /*next card in the deck*/
        }
        if (dealerTotal > 21){
            this.dealerBust = true;
        }
        this.dealerBust = false;
    }
    /*function that adds a card to the dealers hand*/
    public void dealerDraw(Card card){
        dealerHand.hit(card);
    }
    /*function that clears the dealers hand*/
    /*function that returns the dealers total*/

}

