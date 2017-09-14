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
public class C {
    
    //public static int i;
    public int j;
    public C(){
        //i++;
        
    }
    public static void main(String[] args) {
        C x=new C(); 
        C y=new C(); 
        C z= x;
        System.out.println( "et " + z.j);

    }

}
