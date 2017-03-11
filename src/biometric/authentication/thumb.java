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
public class thumb extends Finger{
    
    
    public thumb(float length,float width,float first_joint,float second_joint){
    
 
        this.length=length;
        this.first_joint=first_joint;
        this.second_joint=0;
        this.width = width;
        
    
    
    }
    
}
