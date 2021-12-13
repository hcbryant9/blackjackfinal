package com.example.blackjackfinal;

public class User {
    private Hands userHand = new Hands();
    
    private int bet;
    private boolean userBust;
    /*getters and setters for bet*/

    /*getters and setters for userBust*/
    public void setUserBust(boolean userBust){
        this.userBust = userBust;
    }
    public boolean getUserBust(){
        return this.userBust;
    }
    /*get total*/
    public int userTotal(){
        return userHand.total();
    }
    /*does the user have blackjack*/
    public boolean doesUserBlackjack (){
        if(userHand.total() == 21){
            return true;
        }
        return false;
    }
    /*add a card to the hand*/
    public void userDraw(Card card){
        userHand.hit(card);
    }
    /*clear hand*/
    public void getUserHand() {
        userHand.clear();
    }
}
