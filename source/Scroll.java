/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package automaticclickutility;

/**
 *
 * @author Barbarrosa
 */
public class Scroll extends ClickAction{
    private int x,delay;
    private boolean up;
    public Scroll(int xin, boolean upin){
        myType=type.scroll;
        x = xin;
        up = upin;
    }
    public Scroll(int xin, boolean upin, int del){
        myType=type.scroll;
        x = xin;
        up = upin;
        delay = del;
    }
    public Scroll(int xin, boolean upin, int del, int ta){
        myType=type.scroll;
        x = xin;
        up = upin;
        delay = del;
        timeAfter = ta;
    }
    public void execute(){
        if(up)
            robot.mouseWheel(-x);
        else
            robot.mouseWheel(x);
    }

    @Override public String toString(){
       return "Scroll: "+x+" notches "+" - Delay:" + timeAfter/100;

    }
}
