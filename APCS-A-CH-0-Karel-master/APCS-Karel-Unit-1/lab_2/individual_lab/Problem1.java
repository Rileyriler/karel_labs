package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins() {
        RowOne();
        RowTwo();
        RowThree();
        RowFour();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void reverse() {
        turnLeft();
        turnLeft();
    }
    
    public void RowOne() {
        move();
        putBeeper();
    }
    
    public void RowTwo() {
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
    }
    
    public void RowThree() {
        turnLeft();
        move();
        turnLeft();
        putBeeper();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
    }
    
    public void RowFour() {
        turnRight();
        move();
        turnRight();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
}