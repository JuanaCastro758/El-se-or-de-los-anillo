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
public class Heroes extends Personaje{
    public Heroes(){
    }
    public Heroes(String nombre, int vida, int resistencia) {
        super(nombre, vida, resistencia);
    }

    public int getAtaqueHeroe(){
        int v1=dado_1(0,100);
        int v2=dado_1(0,100);
        if(v1>v2){
            return v1;
        }else if(v2>v1){
            return v2;
        }else{
            return 0;
        }
    }
    
}
