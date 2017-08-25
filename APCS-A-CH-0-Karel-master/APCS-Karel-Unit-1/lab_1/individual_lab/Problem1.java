package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnRight();
        moveTwo();
        turnLeft();
        moveTwo();
        GoGrabFour();
        LeftL();
        placeFour();
        turnLeft();
        LeftL();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void GoGrabFour() {
        turnLeft();
        pickBeeper();
        move();
        pickBeeper();
        move();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void reverse() {
        turnLeft();
        turnLeft();
    }
    
    public void LeftL() {
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
        turnLeft();
    }
    
    public void placeFour() {
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
    }
}