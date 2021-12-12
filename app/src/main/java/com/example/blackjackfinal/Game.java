package com.example.blackjackfinal;

public class Game {
    private Deck deck = new Deck();
    private User user = new User();
    private Dealer dealer = new Dealer();
    private Hands dealerHand;
    private Hands userHand;

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
    public void displayCards(Hands hand){
        /*display that hand*/
    }
    public void blackJack(){
        /*shuffle the deck and then create two Hands -> one for the user and one for the dealer*/
        //deck.shuffle();
        dealerHand = new Hands();
        dealerHand.hit(deck.nextCard());
        dealerHand.hit(deck.nextCard());
        displayCards(dealerHand);
        userHand = new Hands();
        userHand.hit(deck.nextCard());
        userHand.hit(deck.nextCard());
        /*display the cards -> the dealer than goes first -> then ask user to hit or stand*/
        displayCards(userHand);



        //dealer.dealerBrain(deck);

        //if (hitOrStand()){
            //user.userDraw(deck.nextCard());
            //displayCards(userHand);
        //}


        /*logic to see who wins*/
        //winner(userHand,dealerHand,dealer.getDealerBust(),user.getUserBust());

    }
}