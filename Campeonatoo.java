package campeonatoo;

import java.util.Scanner;
public class Campeonatoo {
public static void main(String[] args) {
    
        Scanner into =new Scanner(System.in);
         int acumulador=0;
         int numero;
         int acumulador2=0;
         int numero2;
         int ganados=0;
         int perdidos=0;
         int empatados=0;
         int puntos;
        for(int i=1;i<=10;i++) {  
        System.out.println("goles dia :"+i);
        numero=into.nextInt();
        System.out.println("goles encontra :"+i);
        numero2=into.nextInt();
    { 
    acumulador=acumulador+numero;
    //    System.out.println(acumulador);
    acumulador2=acumulador2+numero2;
       // System.out.println(acumulador2);
    }    
        if (numero>numero2){
             ganados++;
       // System.out.println("ganados"+ganados);
          
        }else if (numero==numero2){
             empatados++; 
      // System.out.println("empatados"+empatados);           
        }else{ 
             perdidos++;  
       // System.out.println("perdidos:"+perdidos);           
    }        
     }    
    System.out.println ("goles a fabor total: " + acumulador);
    System.out.println ("goles encontra total: " + acumulador2); 
    System.out.println("partidos ganados"+ganados);
    System.out.println("partidos empatados"+empatados);
    System.out.println("partidos perdidos"+perdidos);
    
        ganados=ganados*3;
        perdidos=perdidos*0;
        empatados=empatados;
        
        puntos =ganados+empatados+perdidos;
        System.out.println("puntos"+puntos);
     
     if(puntos<10){
         System.out.println("liguilla de Promoción");
     }else if (puntos>=10 && puntos<20){
         System.out.println("no liguilla");
     }else if(puntos>20 && puntos<31){
         System.out.println("liguilla de campeonato");
     }
   }
}   
    
    
    


