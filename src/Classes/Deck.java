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
public class Deck {
    
   List deck = new ArrayList<Card>();

    public Deck() {
        for(int suit=0;suit<4;suit++)
        {
            for(int rank =2;rank<13;rank++)
            {
                deck.add(new Card(suit,rank,false,"",rank));
                        
            }
        }
        
        
    }
   
   
}
