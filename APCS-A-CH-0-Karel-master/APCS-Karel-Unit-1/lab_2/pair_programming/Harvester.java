package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        MoveToStart();
        ReplaceTwoRows();
        ReplaceTwoRows();
        ReplaceTwoRows();
    }
    //your methods go below
    /**
     * Precondition: Robot facing east on block away from a row of beepers
     * Postcondition: Robot facing east, two steets above where it started, one block away from a beeper 
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
    }
    
    public void harvestOneRow() {
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    
    public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void repositionLeft() {
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void MoveToStart() {
        turnRight();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
    }
    
    public void ReplaceTwoRows() {
        replaceOneRow();
        repositionRight();
        replaceOneRow();
        repositionLeft();
    }
    
    public void replaceOneRow() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
}
