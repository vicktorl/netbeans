package salario;

import java.util.Scanner;

public class Salario {
   final static int trabajador=10;
    public static void main(String[] args) {
        int [] salario= new int[trabajador];
        int [] salario2= new int[trabajador];
        
        ingresar(salario);
        horastrabajadas(salario);
        System.out.println("--------------------");
        salariotrabaj(salario,salario2);
        System.out.println("--------------------");
        salariofinal(salario,salario2);    }
   public static void ingresar (int []x){
       Scanner intro =new Scanner(System.in);
       for (int i = 0; i < 10; i++) {
           System.out.println("horas totales trabajador "+(i+1));
           x[i]=intro.nextInt();
        } 
    }
   public static void horastrabajadas (int []x){
        for (int i = 0; i < 10; i++) {
            System.out.println("trabajador "+(i+1)+" horas "+x[i]);
        }
    }
    public static void salariotrabaj (int []x,int []y){
        for (int i = 0; i < 10; i++) {
            x[i]=x[i]*5000;
            System.out.println("trabajador "+(i+1)+" salario "+x[i]);
        }
    }
   
    public static void salariofinal(int []x,int[]y){
        
        for (int i = 0; i < 10; i++) {
           
            while (x[i]>40) {
                
                if (x[i]>=40 && x[i]<=43) {
                    y[i]=(x[i]-40)*2000;
                    System.out.println("trabajador "+"salario total $:"+x[i]);
                    
                }else if(x[i]>=44&& x[i]<=47){
                    y[i]=(x[i]-40)*3000;
                    System.out.println("trabajador "+"salario total $:"+x[i]); 
                    
                }else if(x[i]>47){
                      y[i]=(x[i]-40)*3500;
                    System.out.println("trabajador "+(i+1)+" salario total $:"+x[i]);
               
               }  
                 break;
        }  
    }
}
}
