/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package automaticclickutility;

import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Barbarrosa
 */
abstract public class ClickAction {
    public enum type{click,drag,scroll,move};
    protected type myType;
    protected Robot robot;
    protected long timeAfter;
    public ClickAction(){
        timeAfter = 0;
        try{
            robot = new Robot();
        }catch(Exception e){
            try {
                Thread.dumpStack();
                Thread.currentThread().join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ClickAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public type getType(){
        return myType;
    }

    public long getTimeAfter(){
        return timeAfter;
    }
    public void setTimeAfter(long l){
        timeAfter=l;
    }
    public void doTimeAfter() throws InterruptedException{
        Thread.sleep(timeAfter);
    }

    public void execute(){
        
    }

    @Override public String toString(){
       return "";
    }

}
