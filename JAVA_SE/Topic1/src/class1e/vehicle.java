/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1e;

/**
 *
 * @author openm
 */
public class vehicle{
    
    public float min;
    private float max;

//    Default constructor
    public vehicle() {
    }

//    Also called constructor overloading
    public vehicle(float min, float max) {
        this.min = min;
        this.max = max;
    }
   
    public double getSpeed(){
        return min * max;
    }

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }
}
