/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package automaticclickutility;

/**
 *
 * @author Barbarrosa
 */
public class Move extends ClickAction{
    int x1,y1,delay;
    public Move(int x1in, int y1in){
        myType=type.move;
        x1 = x1in;
        y1 = y1in;
    }
    public Move(int x1in, int y1in, int del){
        myType=type.move;
        x1 = x1in;
        y1 = y1in;
        delay = del;
    }
    public Move(int x1in, int y1in, int del, int ta){
        myType=type.move;
        x1 = x1in;
        y1 = y1in;
        delay = del;
        timeAfter = ta;
    }
    public void execute(){
        robot.mouseMove(x1, y1);
    }

    @Override public String toString(){
       return "Move: "+x1+", "+x1+" - Delay:" + timeAfter/100;

    }
}
