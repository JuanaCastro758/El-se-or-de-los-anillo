/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.util.*;

/**
 *
 * @author Chiko malo
 */
public class Personaje {
    private String nombre;
    private int vida;
    private int resistencia;
    public Personaje(){
    }
    public Personaje(String nombre, int vida, int resistencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public int dado_1(int i,int f){
        Random random=new Random();
        int x=random.nextInt(f-i+1)+i;
        return x;
    }
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", vida=" + vida + ", resistencia=" + resistencia ;
    }
    
    
}
