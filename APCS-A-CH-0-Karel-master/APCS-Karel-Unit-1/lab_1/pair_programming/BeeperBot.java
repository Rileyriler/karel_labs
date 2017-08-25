package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  R. Noon
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        moveThree();
        turnLeft();
        moveTwo();
        pickBeeper();
        moveThree();
        pickBeeperLeft();
        moveThree();
        pickBeeperLeft();
        moveThree();
        pickBeeper();
        moveTwo();
        putBeeperFour();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void moveThree() {
        move();
        move();
        move();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void putBeeperFour() {
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
    }
    
    public void pickBeeperLeft() {
        turnLeft();
        pickBeeper();
    }
}

