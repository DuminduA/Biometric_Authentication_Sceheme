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
public class User {
    
    
    private String Name;
    private int ID;
    private index_finger index_finger;
    private middle_finger middle_finger;
    private ring_finger ring_finger;
    private small_finger small_finger;
    private thumb thumb;
    private palm palm;
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    public User(String Name, int ID, index_finger index_finger, middle_finger middle_finger, ring_finger ring_finger, small_finger small_finger, thumb thumb, palm palm) {
        this.Name = Name;
        this.ID = ID;
        this.index_finger = index_finger;
        this.middle_finger = middle_finger;
        this.ring_finger = ring_finger;
        this.small_finger = small_finger;
        this.thumb = thumb;
        this.palm = palm;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public index_finger getIndex_finger() {
        return index_finger;
    }

    public middle_finger getMiddle_finger() {
        return middle_finger;
    }

    public ring_finger getRing_finger() {
        return ring_finger;
    }

    public small_finger getSmall_finger() {
        return small_finger;
    }

    public thumb getThumb() {
        return thumb;
    }

    public palm getPalm() {
        return palm;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIndex_finger(index_finger index_finger) {
        this.index_finger = index_finger;
    }

    public void setMiddle_finger(middle_finger middle_finger) {
        this.middle_finger = middle_finger;
    }

    public void setRing_finger(ring_finger ring_finger) {
        this.ring_finger = ring_finger;
    }

    public void setSmall_finger(small_finger small_finger) {
        this.small_finger = small_finger;
    }

    public void setThumb(thumb thumb) {
        this.thumb = thumb;
    }

    public void setPalm(palm palm) {
        this.palm = palm;
    }
    
    
    
    
    
    
    
    
    
    
    
}
