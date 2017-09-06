package lab_3.individual_lab;

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
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void carpetRooms(){
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
        MoveToRoom();
        GoIntoRoom();
        CarpetRoom();
    }
    
    public void MoveToRoom(){
        move();
        turnLeft();
    }
    
    public void GoIntoRoom(){
        move();
    }
    
    public void CarpetRoom()
    {
        if(frontIsClear() == false){
            turnLeft();
            if(frontIsClear() == false){
                turnLeft();
                turnLeft();
                if(frontIsClear() == false){
                    putBeeper();
                    LeaveRoom();
                }
                else{
                    LeaveRoom();
                }
            }
            else{
                LeaveRoom();
            }
        }
        else{
            LeaveRoom();
        }
    }
    
    public void LeaveRoom() {
        faceSouth();
        move();
        turnLeft();
    }
    
    public void faceSouth()
    {
            if(facingNorth()) {
                    turnLeft();
                    turnLeft();
                }
            else {
                    if(facingWest()) { 
                            turnLeft();
                        }
                    else {
                            if(facingEast()) {
                                turnRight();
                            }
                        }
                }
        }
}


