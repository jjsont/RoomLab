package Rooms;

import Game.Runner;
import People.Person;

public class WrestlingRoom extends Room
{
    public WrestlingRoom(int q, int w) {
        super(q, w);
    }


    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You've entered the Wrestling Room! You got roped into wrestling for 5 hours.");
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("After a shower, you went on your way.");
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}




