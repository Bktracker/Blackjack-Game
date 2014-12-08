/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author BK
 */
public class Deck {

    
    
   private List deck;

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public Deck() {
        this.deck = new ArrayList<>();
        int value = 0;
        String prifix = null;
        String stRank = null;
        for(int suit=0;suit<4;suit++)
        {
            for(int rank =2;rank<15;rank++)
                //14 ranks : 9 number ranks and 4 picture ranks
            {
                switch (rank){
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        value = rank;
                        break;
                    case 11:
                    case 12:
                    case 13:
                        value = 10;
                        break;
                    case 14:
                        value = 11;
                        break;
                }
                switch (suit){
                    case 0:
                        prifix = "s";
                        break;
                    case 1:
                        prifix = "c";
                        break;
                    case 2:
                        prifix = "d";
                        break;
                    case 3:
                        prifix = "h";
                        break;
                }
                
                stRank = Integer.toString(rank);
                //dCardLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/Cards/resize to 90X135/Back.png")));
                deck.add(new Card(suit,rank,false,"/Package/images/Cards/resize to 90X135/"+prifix+stRank+".png",value));
               
                        
            }
        }
        
        
    }
    public void Suffle()
    {
        long seed = System.nanoTime();
        for (int i=0;i<7;i++){
        Collections.shuffle(deck, new Random(seed));
        }
    }
    
    public List getDeck() {
        return deck;
    }

    

    public Card getDeck(int i) {
        return (Card) this.deck.get(i);
                }
   
    public Object remove(int index) {
        return deck.remove(index);
    }
}
