/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4cfg;

/**
 *
 * @author IAlsmadi
 */
public class L4CFG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public String testString(String input){
        
        String output="";
        
        int length= input.length();
        int k=0;
        for(k=0; k<length; k++  ){
            output+= input.charAt(k);
            if(k>3){
             output+= input.charAt(k)+input.charAt(k);   
                
            }
        }
        
        return output;
    }
    
    
    
}
