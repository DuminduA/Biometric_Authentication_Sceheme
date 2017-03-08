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
public class index_finger extends Finger {
    
   
    
    public index_finger(){
    }
    
    public index_finger(float length,float width,float first_joint,float second_joint){
    
        this.length=length;
        this.first_joint=first_joint;
        this.second_joint=second_joint;
        this.width = width;
        
    
    }

    
}
