/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exos;

/**
 *
 * @author AKL-MEZ
 */
public class Exos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    try
    {
        System.out.print ("A");
        int value = Integer.parseInt ("8A");
        System.out.print ("B");
    }
    catch (NumberFormatException exception)
    {
        System.out.print ("C");
        
    }
    finally{
        System.out.print ("D");
    }
    
    System.out.println ("E");
    }
}
    

