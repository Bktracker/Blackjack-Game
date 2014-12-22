/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BK
 */
public class Hand implements Serializable{
    private List<Card> hand;

    @Override
    public String toString() {
        return "Hand{" + "hand=" + hand + ", \nsumOfCardValue=" + sunOfCardValue + '}';
    }
    private  int sunOfCardValue ;

    public Hand() {
        this.sunOfCardValue = 0;
        this.hand = new ArrayList<>();
    }

    public void add(Card c) 
        {
        hand.add(c);
        
        }
        
    public void clear() {
        hand.clear();
        sunOfCardValue = 0;
    }

    public Card getLast() {
        return (Card) hand.get(hand.size()-1);
    }

    public List<Card> getHandList() {
        return hand;
    }

    public int getSumOfCardValue() {
        return sunOfCardValue;
    }

    public void editSumOfCardValue(int num) {
        //System.out.println("sum before "+ this.sunOfCardValue );
        //System.out.println("card value "+num);
        this.sunOfCardValue = this.sunOfCardValue+num;
        //System.out.println("sum after "+ this.sunOfCardValue );
    }

    public Object remove(int index) {
        return hand.remove(index);
    }

    

    
    
    
        
        
    }
    

  

