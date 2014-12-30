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
public final class Game implements Serializable {

    public   Deck deck;
    public  Hand playerHand;
    public  Hand dealerHand;
    public  int playerWin= 0;
    public  int dealerWin = 0;
    public  long score = 0;
    public  long deckDealCounter = 0;

    
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

   
  

    
}
