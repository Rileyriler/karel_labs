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
        examineRoom();
        examineRoom();
        examineRoom();
        examineRoom();
        examineRoom();
        examineRoom();
        examineRoom();
        examineRoom();
    }
    
    public void examineRoom() {
        moveToRoom();
        goIntoRoom();
        carpetOneRoom();
    }
    
    public void moveToRoom(){
        move();
        turnLeft();
    }
    
    public void goIntoRoom(){
        move();
    }
    
    public void carpetOneRoom()
    {
        if(frontIsClear() == false){
            turnLeft();
            if(frontIsClear() == false){
                turnLeft();
                turnLeft();
                if(frontIsClear() == false){
                    putBeeper();
                    leaveRoom();
                }
                else{
                    leaveRoom();
                }
            }
            else{
                leaveRoom();
            }
        }
        else{
            leaveRoom();
        }
    }
    
    public void leaveRoom() {
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
        
    public void faceWest()
    {
            if(facingEast()) {
                    turnLeft();
                    turnLeft();
                }
            else {
                    if(facingNorth()) { 
                            turnLeft();
                        }
                    else {
                            if(facingSouth()) {
                                turnRight();
                            }
                        }
                }
        }
        
    public void faceEast()
    {
            if(facingWest()) {
                    turnLeft();
                    turnLeft();
                }
            else {
                    if(facingSouth()) { 
                            turnLeft();
                        }
                    else {
                            if(facingNorth()) {
                                turnRight();
                            }
                        }
                }
        }
    
    public void faceNorth()
    {
            if(facingSouth()) {
                    turnLeft();
                    turnLeft();
                }
            else {
                    if(facingEast()) { 
                            turnLeft();
                        }
                    else {
                            if(facingWest()) {
                                turnRight();
                            }
                        }
                }
        }
}


