package com.example.blackjackfinal;

import junit.framework.TestCase;

public class CardTest extends TestCase {
    Card m_card;
    public void setUp() throws Exception {
        super.setUp();
        m_card = new Card(5,'C');
    }

    public void testGetVal() {
        int val = m_card.getVal();
        assertEquals(5,5);
    }


}