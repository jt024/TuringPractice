/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuringPract;

/**
 *
 * @author jt024
 */
public class TuringPract {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int move = 0;
        
        String text = "aabbaabb";
        char c;
        
        for (int i = 0; i < text.length(); i++) {
            //some check here
            text.replace(text.charAt(i), 'x');
            
        }
        
        
    }
    
}
