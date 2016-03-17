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
public class Aereos extends Animal {
    //atributos
    protected int patas;
    protected int alas;
    
     //Métodos
    /**
     * Constructor
     * @param patas Es para indicar la cantidad de patas del animal
     * @param alas Que el animal tiene alas o no
     * @param vida Muestra si el animal está vivo
     * @param familia Muestra si el animal tiene familia
     */
    public Aereos(boolean vida, boolean familia, int patas,int alas){
        super(vida, familia);
        this.patas = patas;
        this.alas = alas;
     
    }
  
    /**
     * Método que devuelve la cantidad de patas
     * @return regresa el número de patas del animal
     */
    public int getPatas(){
        return this.patas;
}
    /**
     * Método que devuelve la cantidad de orejas
     * @return regresa el número de orejas del animal
     */
    public int getAlas(){
        return this.alas;
}
    
      @Override
    public void getDatos(){
        System.out.println("Estos son los datos del animal aereo: patas=" + this.patas +","+ "alas="+ this.alas);
        }
    
}