/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A2QN;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author daupb7975
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
    RobotSE clarence = new RobotSE(kw, 1, 1, Direction.EAST);
    new Thing(kw, 1, 2);
    new Thing(kw, 1, 3);
    new Thing(kw, 1, 4);
    new Thing(kw, 1, 5);
    new Thing(kw, 1, 6);
    new Thing(kw, 1, 7);
    new Thing(kw, 1, 8);
    new Thing(kw, 1, 9);
    new Thing(kw, 1, 10);
    new Thing(kw, 1, 11);
    
    
    while(clarence.getAvenue() != 12){
        clarence.move();
        if(clarence.canPickThing()){
            if(clarence.countThingsInBackpack()  < 7){
                clarence.pickThing();
            }
        }
    }
    }
}
