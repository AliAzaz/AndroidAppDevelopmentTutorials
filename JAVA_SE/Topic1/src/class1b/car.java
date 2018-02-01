/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1b;

/**
 *
 * @author openm
 */
public class car extends vehicle {
    
    public double speed(float min,float max){
        return 2 * super.speed(min,max);
    }
}
