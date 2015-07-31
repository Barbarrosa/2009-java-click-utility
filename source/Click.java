/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package automaticclickutility;

import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Barbarrosa
 */
public class Click extends ClickAction {
    private int x,y;
    public Click(int xin, int yin){
        myType=type.click;
        x = xin;
        y = yin;
    }
    public Click(int xin, int yin, int ta){
        myType=type.click;
        x = xin;
        y = yin;
        timeAfter = ta;
    }
    public void execute(){
        robot.mouseMove(x, y);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
    }

    @Override public String toString(){
       return "Click: "+x+", "+y+" - Delay:" + timeAfter/100;
    }

}
