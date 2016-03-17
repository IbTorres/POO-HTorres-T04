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
public class Terrestres extends Animal{
    //atributos
    protected int patas;
    protected int orejas;
    
     //Métodos
    /**
     * Constructor
     * @param vida Muestra si el animal está vivo
     * @param familia Muestra si el animal tiene familia
     * @param patas Es para indicar la cantidad de patas del animal
     * @param orejas Que el animal tiene orejas(2 o 0)
     */
    public Terrestres(boolean vida, boolean familia,int patas,int orejas){
        super(vida, familia);
        this.patas = patas;
        this.orejas = orejas;
    }
    @Override
    public void getDatos(){
        System.out.println("Estos son los datos del animal terrestre:patas= " + this.patas +","+ "orejas="+ this.orejas);
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
    public int getOrejas(){
        return this.orejas;
}
    
}