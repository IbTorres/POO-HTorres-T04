/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.htorres.t04;

/**
 *
 * @author Alison Torres
 */
public class POOHTorresT04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
        Aereos Ae = new Aereos(true, true, 2, 2); 
        Ae.getDatos();
        Ae.getVida();
        Ae.getFamilia();
        
        Acuaticos Ac = new Acuaticos(true, true, true, 2);
        Ac.getDatos();
        Ac.getVida();
        Ac.getFamilia();
        
        Anfibios A = new Anfibios(true, true, 4, 2);
        A.getDatos();
        A.getVida();
        A.getFamilia();
        
        Terrestres T = new Terrestres(true, true, 4, 2);
        T.getDatos();
        T.getVida();
        T.getFamilia();
    }
}