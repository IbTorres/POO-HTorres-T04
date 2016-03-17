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
public abstract class Animal implements iAnimal {
    //atributos
    protected boolean vida;
    protected boolean familia;
    
     //Métodos
    /**
     * Constructor
     * @param vida Es para indicar si el animal está con vida
     * @param familia La familia a la que pertenece el animal
     */
    public Animal(boolean vida, boolean familia){
        this.vida = vida;
        this.familia = familia;
    }
    /**
     * Método que devuelve si el animal tiene vida
     * 
     */
    public void getVida(){
        System.out.println("" + this.vida);
    }
    /**
     * Método para mostrar la familia del animal
     * 
     */
    public void getFamilia(){
        System.out.println("" + this.familia);
    }
}



