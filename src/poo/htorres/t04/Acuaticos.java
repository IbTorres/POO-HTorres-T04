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
public class Acuaticos extends Animal {
    //atributos
    protected boolean branquias;
    protected int aletas;
    
     //Métodos
    /**
     * Constructor
     * @param vida Muestra si el animal está vivo
     * @param familia Muestra si el animal tiene familia
     * @param branquias Es para indicar si el animal tiene branquias
     * @param aletas Que el animal tiene orejas(2 o 0)
     */
    public Acuaticos(boolean vida, boolean familia,boolean branquias,int aletas){
        super(vida, familia);
        this.branquias = branquias;
        this.aletas = aletas;
    }
    @Override
    public void getDatos(){
        System.out.println("Estos son los datos del animal acuático: branquias=" + this.branquias +","+ "alas="+ this.aletas);
        }
    /**
     * Método que devuelve si el animal tiene branquias
     * @return regresa si el animal tiene branquias o no
     */
    public boolean getBranquias(){
        return this.branquias;    
    }
    /**
     * Método que devuelve la cantidad de aletas
     * @return regresa el número de aletas del animal
     */
    public int getAletas(){
        return this.aletas;
    }   
}
