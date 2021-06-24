/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

/**
 *
 * @author Chiko malo
 */
public class Bestias extends Personaje{
    public Bestias(){
    }
    public Bestias(String nombre, int vida, int resistencia) {
        super(nombre, vida, resistencia);
    }
    public int getAtaqueBestia(){
        int v1=dado_1(0,90);
        return v1;
    }
}
