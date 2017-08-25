package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        BottomLeftofEight();
        TopRightofEight();
        TopLeftofEight();
        BottomRightofEight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void BottomLeftofEight() {
        turnLeft();
        move();
        turnRight();
        moveTwo();
        turnRight();
        moveTwo();
    }
    
    public void TopRightofEight() {
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();
    }
    
    public void TopLeftofEight() {
        turnLeft();
        moveTwo();
        turnLeft();
        moveTwo();        
    }
    
    public void BottomRightofEight() {
        turnRight();
        moveTwo();
        turnRight();
        move();
        turnRight();
    }
    
}