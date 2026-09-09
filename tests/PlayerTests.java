
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import week2.Player;

public class PlayerTests{
    @Test
    public void testPlayer(){
        Player p1=new Player(8);
        Player p2=new Player(8);
        //assertTrue("These values should be the same",p1==p2);
        assertTrue("Should be equal",p1.getHP()==p2.getHP() && p1.getMaxHP()==p2.getMaxHP() &&
        p1.getDamageDealth()==p2.getDamageDealth());
        // && is and 
        // || is or
        // ! is not
    }
}