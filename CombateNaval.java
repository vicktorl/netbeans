/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatenaval;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class CombateNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner intro=new Scanner(System.in);
        int barco=1;
        int filas=5,columnas=5;
        int barco_destruido=0;
        int barco_destruido_random=5;
        int i=0,j=0;
        int usuario[][]=new int[filas][columnas];
        int cpu[][]=new int [filas][columnas];
        for ( i = 0; i < usuario.length; i++) {
            for ( j = 0; j < usuario[i].length; j++) {
                usuario[i][j]=(int)(Math.random()*0);
            }    
        }
        System.out.println("ingrese ubicacion barcos");
        for (int k = 0; k <6; k++) {  
           do{
            System.out.println("filas entre 0 a 4");
            i=intro.nextInt();
           }while(i<0||i>4);
           do{
           System.out.println("columna entre 0 a 4");
           j=intro.nextInt();
           }while(j<0||j>4);
           usuario[i][j]=barco;
        }
        
        System.out.println("ubicacion barcos usuario");
        for ( i = 0; i < usuario.length; i++) {
            System.out.println("");
            for ( j = 0; j < usuario[i].length; j++) {
                System.out.print("|"+usuario[i][j]+"|");
            }
        }
        System.out.println("");
        for (i = 0; i < cpu.length; i++) {
            for ( j = 0; j < cpu[i].length; j++) {
                cpu[i][j]=(int)(Math.random()*0);   
            }
        }
        for (int k = 0; k < 5; k++) { 
        i=(int)(Math.random()*5);
        j=(int)(Math.random()*5);
        cpu[i][j]=barco;
        }  
        System.out.println("");
        while(barco_destruido>0 || barco_destruido_random>0){
            System.out.println("***ataque usuario***");
            do{
            System.out.println("fila");
            i=intro.nextInt();
            }while(i<0||i>4);
            do{
            System.out.println("columna");
            j=intro.nextInt();
            }while(j<0||j>5);
                if(cpu[i][j]==1){
                System.out.println("ataque en ["+i+"]["+j+"]");
                System.out.println("BARCO DESTRUIDO");
                 barco_destruido--;
                 cpu[i][j]=0;
        }else{
                System.out.println(" ataca espacio sin barcos");
                System.out.println("");
            }
                System.out.println("***ataque rival***");
                System.out.println("");
                i=(int)(Math.random()*5);
                j=(int)(Math.random()*5);
                if(usuario[i][j]==1) {
                    System.out.println("ataque en ["+i+"]["+j+"]");
                System.out.println("BARCO DESTRUIDO");
                barco_destruido_random--;
                cpu[i][j]=0;
        }else{
                System.out.println(" ataca espacio sin barcos");
            }
                 
            
        }
        if(barco_destruido==0){
                    System.out.println("ganaste destruiste toda la flota enemiga");
                }else
                    if(barco_destruido_random==0){
                    System.out.println("toda tu flota fue destruida"); 
                } 
        System.out.println("ubicacion barcos enemigo");
        for ( i = 0; i < cpu.length; i++) {
            System.out.println("");
            for ( j = 0; j < cpu[i].length; j++) {
                System.out.print("|"+cpu[i][j]+"|");
            }
        }
    }
}

