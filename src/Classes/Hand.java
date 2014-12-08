/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BK
 */
public class Hand {
    private List hand;

    @Override
    public String toString() {
        return "Hand{" + "hand=" + hand + ", sunOfCardValue=" + sunOfCardValue + '}';
    }
    private  int sunOfCardValue ;

    

    public Hand() {
        this.sunOfCardValue = 0;
        this.hand = new ArrayList<>();
    }

        public void add(Card c) {
        hand.add(c);
        editSunOfCardValue(c.getValue());
        
    }

    public Card getLast() {
        return (Card) hand.get(hand.size()-1);
    }

    public List getHandList() {
        return hand;
    }

    public int getSunOfCardValue() {
        return sunOfCardValue;
    }

    public void editSunOfCardValue(int num) {
        this.sunOfCardValue = this.sunOfCardValue+num;
    }

    public Object remove(int index) {
        return hand.remove(index);
    }

    

    
    
    
        
        
    }
    

  

