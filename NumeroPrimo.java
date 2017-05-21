package numero.primo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        
        int num2; 
        int user;
        int cont=0;
        int num3;
        do{
           System.out.println("ingrese numero");
           num2=sc.nextInt();
           for (int i=1; i<=num2; i++) { 
   
           num3=num2/i;
           if (num2%i==0){
           cont++;   
          }
        }
        if(cont>2){
                System.out.println("**numero no primo**");
        }else{
            System.out.println("**numero primo**");
        }
            System.out.println("desea continuar si:1 ");
            user=sc.nextInt();
    }while(user==1);
    }
}