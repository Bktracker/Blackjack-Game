/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author BK
 */
public class Game implements Serializable {

    public static  Deck deck;
    public static Hand playerHand;
    public static Hand dealerHand;
    public static int playerWin= 0;
    public static int dealerWin = 0;
    public static long score = 0;
    public static long deckDealCounter = 0;

    
    
    @Override
    public String toString() {
        return "Game{" + "\ndeck=" + deck + ", \nplayerHand=" + playerHand + ", \ndealerHand=" + dealerHand +  ", \nplayerWin=" + playerWin + ", \ndealerWin=" + dealerWin + ", \nscore=" + score + ", \ndeckDealCounter=" + deckDealCounter +'}';
    }

    public Game() {
    }

    public Game(Game g) {
        this.setDealerHand(g.getDealerHand());
        this.setDealerWin(g.getDealerWin());
        this.setDeck(g.getDeck());
        this.setPlayerHand(g.getPlayerHand());
        this.setPlayerWin(g.getPlayerWin());
        this.setScore(g.getScore());
    }

    public  long getDeckDealCounter() {
        return deckDealCounter;
    }

    public  void setDeckDealCounter(long deckDealCounter) {
        this.deckDealCounter = deckDealCounter;
    }

    @Override
    public int hashCode() {
        int hash = 8;
        return hash;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public Hand getDealerHand() {
        return dealerHand;
    }

    public void setDealerHand(Hand dealerHand) {
        this.dealerHand = dealerHand;
    }

   
    public int getPlayerWin() {
        return playerWin;
    }

    public void setPlayerWin(int playerWin) {
        this.playerWin = playerWin;
    }

    public int getDealerWin() {
        return dealerWin;
    }

    public void setDealerWin(int dealerWin) {
        this.dealerWin = dealerWin;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.deck, other.deck)) {
            return false;
        }
        if (!Objects.equals(this.playerHand, other.playerHand)) {
            return false;
        }
        if (!Objects.equals(this.dealerHand, other.dealerHand)) {
            return false;
        }
       
        if (this.playerWin != other.playerWin) {
            return false;
        }
        if (this.dealerWin != other.dealerWin) {
            return false;
        }
        if (this.score != other.score) {
            return false;
        }
        return true;
    }

  

    
}
