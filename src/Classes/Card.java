/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author BK
 */
public class Card {

   private int suit;
   private int rank;
   private Boolean side;

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", rank=" + rank + ", side=" + side + ", CardFaceIcon=" + CardFaceIcon + ", value=" + value + '}';
    }
   private String CardFaceIcon;
   private int value;

    public Card(int suit, int rank, Boolean side, String CardFaceIcon, int value) {
        this.suit = suit;
        this.rank = rank;
        this.side = side;
        this.CardFaceIcon = CardFaceIcon;
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public Boolean isSide() {
        return side;
    }

    public String getCardFaceIcon() {
        if  
                (!this.isSide())
                
            return "/Package/images/Cards/resize to 90X135/Back.png";
        else 
            return CardFaceIcon;
       }
    

    public int getValue() {
        return value;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setSide(Boolean side) {
        this.side = side;
    }

    public void setCardFaceIcon(String CardFaceIcon) {
        this.CardFaceIcon = CardFaceIcon;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
   
    
   
    
   
           
   
    
}
