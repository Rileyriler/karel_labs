package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins() {
        RowOne();
        RepositionRight();
        RowTwo();
        RepositionLeft();
        RowThree();
        RepositionRight();
        RowFour();
        RepositionLeft();
        move();
        RowThree();
        RepositionRight();
        RowTwo();
        RepositionLeft();
        RowOne();
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
        turnLeft();
        move();
    }
    
    public void RowTwo() {
        putBeeper();
        moveTwo();
        putBeeper();
        move();
    }
    
    public void RowThree() {
        putBeeper();
        moveTwo();
        putBeeper();
        moveTwo();
        putBeeper();
        move();
    }
    
    public void RowFour() {
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
    
    public void RepositionRight() {
        turnRight();
        move();
        turnRight();
    }
    
    public void RepositionLeft() {
        turnLeft();
        move();
        turnLeft();
    }
}