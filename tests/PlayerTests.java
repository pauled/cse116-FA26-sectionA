
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import week2.Player;

public class PlayerTests{
    @Test
    public void testPlayer(){
        Player p1=new Player(8);
        Player p2=new Player(8);
        //assertTrue("These values should be the same",p1==p2);
//        assertTrue("Should be equal",p1.getHP()==p2.getHP() && p1.getMaxHP()==p2.getMaxHP() &&
        assertEquals("Players should be the same",p1, p2);
        //p1.getDamageDealth()==p2.getDamageDealth());
        // && is and 
        // || is or
        // ! is not
    }
    @Test
    public void classTests(){
        double actual=8.999999999999984;
        double expected=9.0;
        System.out.println(Math.abs(actual-expected)<.001);
        assertEquals("doubles should be same",expected, actual,.001);
        String str1="hello";
        String str2="bye";
        String str3=str1+str2;
        String str4="hellobye";
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        assertEquals("strings should be the same",str4,str3);
    }
}