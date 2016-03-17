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
public class Anfibios extends Animal{
    //atributos
    protected int patas;
    protected int aletas;
    
     //Métodos
    /**
     * Constructor
     * @param vida Muestra si el animal está vivo
     * @param familia Muestra si el animal tiene familia
     * @param patas Es para indicar la cantidad de patas del animal
     * @param aletas Que el animal tiene orejas(2 o 0)
     */
    public Anfibios(boolean vida, boolean familia,int patas,int aletas){
        super(vida, familia);
        this.patas = patas;
        this.aletas = aletas;
    }
    @Override
    public void getDatos(){
        System.out.println("Estos son los datos del animal anfibio: patas=" + this.patas +","+ "aletas="+ this.aletas);
        }
    /**
     * Método que devuelve la cantidad de patas
     * @return regresa el número de patas del animal
     */
    public int getPatas(){
        return this.patas;
}
    /**
     * Método que devuelve la cantidad de aletas
     * @return regresa el número de aletas del animal
     */
    public int getAletas(){
        return this.aletas;
    
}
    
}
