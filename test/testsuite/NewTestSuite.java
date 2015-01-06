/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuite;

import Classes.CardTest;
import Classes.DealerHandTest;
import Classes.DeckTest;
import Classes.PlayerHandTest;
import package1.GameGUITest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author OlegK
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CardTest.class,
    DeckTest.class,
    DealerHandTest.class,
    PlayerHandTest.class,
    GameGUITest.class
})
public class NewTestSuite {    
}
