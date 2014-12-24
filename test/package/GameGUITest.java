/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import Classes.Game;
import Classes.Card;
import Classes.DealerHand;
import Classes.Hand;
import Classes.PlayerHand;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OlegK
 */
public class GameGUITest {
    
    public GameGUITest() {
        //this.<> = new GameGUI();
    }
    
    private static PlayerHand ph;
    private static DealerHand dh;
    private static Card hearts2;
    private static Card hearts14;
    private static Card diamonds14;
    private static Card clubs14;
    private static Card clubs11;
    private static Card clubs9;
    private static Card clubs7;
    
    private static GameGUI gameGui;
    private static Game game;
    
    @BeforeClass
    public static void setUpClass() {
        hearts2 = new Card(3,2,false,"/Package/images/Cards/resize to 90X135/h2.png",2);
        hearts14 = new Card(3,14,false,"/Package/images/Cards/resize to 90X135/h14.png",11);
        diamonds14 = new Card(2,14,false,"/Package/images/Cards/resize to 90X135/d14.png",11);
        clubs14 = new Card(1,14,false,"/Package/images/Cards/resize to 90X135/c14.png",11);
        clubs11 = new Card(1,11,false,"/Package/images/Cards/resize to 90X135/c11.png",10);
        clubs9 = new Card(1,9,false,"/Package/images/Cards/resize to 90X135/c9.png",9);
        clubs7 = new Card(1,7,false,"/Package/images/Cards/resize to 90X135/c9.png",7);
        
        ph = new PlayerHand();
        dh = new DealerHand();
        gameGui = new GameGUI();
        game = new Game();
    }
    
    @AfterClass
    public static void tearDownClass() {
        ph = null;
        dh = null;
        hearts2 = hearts14 = diamonds14 = clubs14 = clubs11 = clubs9 = clubs7 = null;
    }
    
        
    /**
     * Test of main method, of class GameGUI.
     * Test winnerCheck and Scores
     */
    @Test
    public void testMain() {
        System.out.println("main");
        //String[] args = null;
        
        ph.add(clubs14);  //11
        ph.add(hearts14); //12
        dh.add(diamonds14);    //11
        dh.add(clubs9);        //20
        game.setDealerHand(dh);
        game.setPlayerHand(ph);
        gameGui.winnerCheck();
        assertTrue("Player 0 Dealer 1", game.getDealerWin() == 1 && game.getPlayerWin() == 0);
        assertTrue("score is -12",game.getScore() == -12);
        
        ph.add(clubs14);  //13
        game.setPlayerHand(ph);
        gameGui.winnerCheck();
        assertTrue("Player 0 Dealer 2", game.getDealerWin() == 2 && game.getPlayerWin() == 0);
        assertTrue("score is -25",game.getScore() == -25);
        
        ph.add(clubs7);   //20
        game.setPlayerHand(ph);
        gameGui.winnerCheck();
        assertTrue("Player 0 Dealer 3", game.getDealerWin() == 3 && game.getPlayerWin() == 0);
        assertTrue("score is -45",game.getScore() == -45);
        
        ph.add(diamonds14);  //21
        game.setPlayerHand(ph);
        gameGui.winnerCheck();
        assertTrue("Player 1 Dealer 3", game.getDealerWin() == 3 && game.getPlayerWin() == 1);
        assertTrue("score is -24",game.getScore() == -24);
        
        dh.add(diamonds14);  //21
        game.setDealerHand(dh);
        gameGui.winnerCheck();
        assertTrue("Player 1 Dealer 4", game.getDealerWin() == 4 && game.getPlayerWin() == 1);
        assertTrue("score is -45",game.getScore() == -45);
        
        dh.add(hearts14);  //22
        game.setDealerHand(dh);
        gameGui.winnerCheck();
        assertTrue("Player 2 Dealer 4", game.getDealerWin() == 4 && game.getPlayerWin() == 2);
        assertTrue("score is -24",game.getScore() == -24);   
    }  
}
