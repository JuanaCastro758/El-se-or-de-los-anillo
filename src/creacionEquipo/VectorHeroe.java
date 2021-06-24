/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionEquipo;

/**
 *
 * @author Chiko malo
 */
import java.util.Scanner;
import personajes.*;
import creacionEquipo.*;
public class VectorHeroe {
    private Bestias bestia=new Bestias();
    private Bestias[] totalBestias=new Bestias[10];
    static Scanner scanner=new Scanner(System.in);
    private Heroes heroe=new Heroes();
    private  Heroes[] totalHeroes=new Heroes[15];
    private Bestias[] bes=new Bestias[1];
    private int op;
    private int x;
    private int c1_elfos;
    private int c2_hobi;
    private int c3_humanos;
    private int totalH;
    private int c1_orcos;
    private int c2_trasgos;
    private int totalB;
    private int vidaB;
    private int vidaH;
    public VectorHeroe(){
        this.vidaB=0;
        this.vidaH=0;
        this.x=0;
        this.op=0;
        this.c1_elfos=0;
        this.c2_hobi=0;
        this.c3_humanos=0;
        this.totalH=0;
        this.c1_orcos=0;
        this.c2_trasgos=0;
        this.totalB=0;
    }
    public void cantidadPersonajes(){
        c1_elfos=heroe.dado_1(1,2);
        c2_hobi=heroe.dado_1(1,2);
        c3_humanos=heroe.dado_1(1,3);
        c1_orcos= bestia.dado_1(1,3);
        c2_trasgos=bestia.dado_1(1,4); 
    }
    public void creacionPersonajes(){
        totalH=c1_elfos+c2_hobi+c3_humanos;
        for(int i=0;i<c1_elfos;i++){
            totalHeroes[i]=new Heroes("Elfo",250,heroe.dado_1(60, 80));
        }
        for(int i=c1_elfos;i<(c2_hobi+c1_elfos);i++){
           totalHeroes[i]=new Heroes("Hobbit",250,heroe.dado_1(60, 80));
        }
        for(int i=(c2_hobi+c1_elfos);i<totalH;i++){
            totalHeroes[i]=new Heroes("Humano",250,heroe.dado_1(60, 80));
        }
        
        totalB=c1_orcos+c2_trasgos;
        for(int i=0;i<c1_orcos;i++){
            totalBestias[i]=new Bestias("Orco",250,bestia.dado_1(60, 80));
        }
        for(int i=c1_orcos;i<(totalB);i++){
            totalBestias[i]=new Bestias("Trasgo",250,bestia.dado_1(60, 80));
        }
    } 
    public void elegirHeroe(){
        do{
            heroe.mensaje("ID.-   Informacion");
            for(int i=0;i<totalH;i++){
                if(totalHeroes[i].getVida()>0){
                    heroe.mensaje(i+".-  "+totalHeroes[i].toString());
                }
                vidaH=vidaH+totalHeroes[i].getVida();
            }
            heroe.mensaje("¿Que heroe entrara a pelear?");
            op=scanner.nextInt();
        }while(op>=totalH || op<0);
        do{
            x=bestia.dado_1(0, totalB-1);
        }while(totalBestias[x].getVida()>0);
        for(int i=0;i<totalB;i++){
            vidaB=vidaB+totalBestias[i].getVida();
        }
        heroe.mensaje("\n\n La pelea Inicia...."+totalHeroes[op].getNombre()+" Vrs "+totalBestias[x].getNombre());
    }
    public boolean pelea_(){
        if(totalHeroes[op].getNombre()=="Elfo"  && totalBestias[x].getNombre()=="Orco"){
            int armadura=totalHeroes[op].getResistencia()-((10*totalHeroes[op].getResistencia())/100);
            int ataqueBestia=totalBestias[x].getAtaqueBestia();
            int ataqueHeroe=totalHeroes[op].getAtaqueHeroe()+10;
            if(totalBestias[x].getResistencia()<ataqueHeroe){
                totalBestias[x].setVida(totalBestias[x].getVida()-50);
            }
            if(armadura<ataqueBestia){
                totalHeroes[op].setVida(totalHeroes[op].getVida()-50);
            }
        }else if(totalHeroes[op].getNombre()=="Hobbit"  && totalBestias[x].getNombre()=="Trasgo"){
            int ataqueBestia=totalBestias[x].getAtaqueBestia();
            int ataqueHeroe=totalHeroes[op].getAtaqueHeroe()-5;
            if(totalBestias[x].getResistencia()<ataqueHeroe){
                totalBestias[x].setVida(totalBestias[x].getVida()-50);
            }
            if(totalHeroes[op].getResistencia()<ataqueBestia){
                totalHeroes[op].setVida(totalHeroes[op].getVida()-50);
            }
        }else if(totalBestias[x].getNombre()=="Orco"){
            int armadura=totalHeroes[op].getResistencia()-((10*totalHeroes[op].getResistencia())/100);
            int ataqueBestia=totalBestias[x].getAtaqueBestia();
            int ataqueHeroe=totalHeroes[op].getAtaqueHeroe();
            if(totalBestias[x].getResistencia()<ataqueHeroe){
                totalBestias[x].setVida(totalBestias[x].getVida()-50);
            }
            if(armadura<ataqueBestia){
                totalHeroes[op].setVida(totalHeroes[op].getVida()-50);
            }
        }
            if(vidaB<=0 || vidaH<=0){
                return true;
            }else {
                return false;
            }
    }
    public void info(){
        bestia.mensaje("\n....Resultados....");
        bestia.mensaje(totalBestias[x].toString());
        bestia.mensaje(totalHeroes[op].toString());
        
        bestia.mensaje("\n\n");
    }
    public void  resultado(){
        
    if(vidaB<=0){
        bestia.mensaje("Ganaron los Heroe");
    }else if(vidaH<=0){
        
        bestia.mensaje("Ganaron las Bestias");
    }
        
    }
}
