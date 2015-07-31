/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package automaticclickutility;

import java.awt.event.MouseEvent;

/**
 *
 * @author Barbarrosa
 */
public class Drag extends ClickAction{
    private int x1,y1,x2,y2,delay;

    public Drag(int x1in, int y1in, int x2in, int y2in){
        myType=type.drag;
        x1 = x1in;
        y1 = y1in;
        x2 = x2in;
        y2 = y2in;
    }
    public Drag(int x1in, int y1in, int x2in, int y2in, int del){
        myType=type.drag;
        x1 = x1in;
        y1 = y1in;
        x2 = x2in;
        y2 = y2in;
        delay=del;
    }
    public Drag(int x1in, int y1in, int x2in, int y2in, int del, int ta){
        myType=type.drag;
        x1 = x1in;
        y1 = y1in;
        x2 = x2in;
        y2 = y2in;
        timeAfter=ta;
    }

    public void execute(){
        robot.mouseMove(x1, y1);
        robot.mousePress(MouseEvent.BUTTON1);
        robot.mouseMove(x2, y2);
        robot.mouseRelease(MouseEvent.BUTTON1);
    }

    @Override public String toString(){
       return "Drag: "+x1+", "+x1+" to "+x2+", "+y2+" - Delay:" + timeAfter/100;

    }

}
