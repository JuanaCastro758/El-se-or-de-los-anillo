/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoInicio;

/**
 *
 * @author Chiko malo
 */
import creacionEquipo.*;
public class Inicio {
    public static void main(String[] args){
        Inicio inicio=new Inicio();
    }
    private VectorBestia vectorBestia=new VectorBestia(); 
    private VectorHeroe vectorHeroe=new VectorHeroe();
    public Inicio(){
        vectorHeroe.cantidadPersonajes();
        vectorHeroe.creacionPersonajes();
        boolean resultado=false;
        do{
        System.out.println("-------------Heroes-------------");
        vectorHeroe.elegirHeroe();
        resultado=vectorHeroe.pelea_();
        vectorHeroe.info();
        }while(resultado==false);
        vectorHeroe.resultado();
    }
}
