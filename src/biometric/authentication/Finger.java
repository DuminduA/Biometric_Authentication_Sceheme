/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric.authentication;

/**
 *
 * @author dumindu
 */
public class Finger {
    
    
   protected float length;
   protected float width;
   protected float first_joint;
   protected float second_joint;

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getFirst_joint() {
        return first_joint;
    }

    public float getSecond_joint() {
        return second_joint;
    }
    
    
    /////////////////////////////////////////////////////////////////////

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setFirst_joint(float first_joint) {
        this.first_joint = first_joint;
    }

    public void setSecond_joint(float second_joint) {
        this.second_joint = second_joint;
    }
    
    
    
    
    
}
