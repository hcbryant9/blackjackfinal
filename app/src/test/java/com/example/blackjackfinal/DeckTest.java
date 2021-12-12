package com.example.blackjackfinal;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class DeckTest extends TestCase {

    Deck deck1;
    Deck deck2;

    public void Init(){
        deck1 = new Deck();
        deck2 = new Deck();
    }
    @Test
    public void InitTest(){
        Init();
        int tester = deck1.nextCard().getVal();
        //deck1.shuffle();
        Assert.assertEquals(tester,2);
    }
}