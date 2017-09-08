package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
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
    
    public void carpetOneRoom() {
        surveyRoom();
        if(checkLeftWall() &&  checkRightWall() && checkTopWall()){
            putBeeper();
            leaveRoom();
        }
        else{
            if(!(checkLeftWall() && !(checkRightWall()))){
                leaveRoom();
            }
            else{
                faceNorth();
                move();
                carpetOneRoom();
            }
        }
    }
    
    public void surveyRoom() {
        checkLeftWall();
        checkRightWall();
        checkTopWall();
    }
        
    public boolean checkLeftWall() {
        faceWest();
        if(frontIsClear()) {
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean checkRightWall() {
        faceEast();
        if(frontIsClear()) {
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean checkTopWall() {
        faceNorth();
        if(frontIsClear()) {
            return false;
        }
        else{
            return true;
        }
    }
    
    public void leaveRoom() {
        faceSouth();
        move();
        
        turnLeft();
    }
}

