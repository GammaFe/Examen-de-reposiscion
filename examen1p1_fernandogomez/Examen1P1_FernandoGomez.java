
package com.mycompany.examen1p1_fernandogomez;

import java.util.Scanner;


   public class Examen1P1_FernandoGomez {

 public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
       // ejercicio 3
       System.out.println("Ingrese n");
       int n =entrada.nextInt();
       System.out.println("Ingrese el contorno");
        String cont =entrada.nextLine();
        char c = cont.charAt(0);
        System.out.println(c);
     int i, n2 = 2 * n,j;
        for (i=0; i < n2; i++){
        System.out.print(" "+c);
            System.out.println(" "+c);
            for (j=0; j < n2; j++){
                while (n >= n2){
                if (j==i){
                    System.out.println("*");
                }else{ 
                    System.out.println(" ");
                }
                    
                }
            }
 
        
    
 
 
 //ejercico 2
 public static int ejercico2(char E[]);
 
         System.out.println("Ingrese una cadena");    
        String A =entrada.nextLine();
        int i;
        for(i=0;i<A.length();i++){ 
        char B = A.charAt(i);
        int C = B;
        if (C <= 109){
            int j;
            int sum2 = 0, sum1 = 1;  
           for(j=109; j >= C;j--){  
               sum2 = sum1 + 2;
               int D = C + sum2;         
                       char E = (char) D;
           }
           
         
        }else{
            
            if(C >= 110){
                int j;
               int sum3, sum4 = 1; 
                 for(j=110; j >= C;j--){  
              sum3 = sum4 + 2;         
               int D = C - sum4;         
                       char E = (char) D;
                }
            }
                if (C <= 77){
          int j;
                    int sum2 = 0, sum1 = 1;  
           for(j=77; j >= C;j--){  
               sum2 = sum1 + 2;
               int D = C + sum2;         
                       char E = (char) D;
           }        
        }else{
            
            if(C >= 78){
                int j;
               int sum3, sum4 = 1; 
                 for(j=78; j >= C;j--){  
              sum3 = sum4 + 2;         
               int D = C - sum4;         
                       char E = (char) D;
                }
            }
        System.out.print(" "+C);
        }
            }
}
       return E;
       
   }
 //ejercicio 1
     System.out.println("Ingrese el primer conjuto ");
        String cadena1= Sc.nextLine();
     System.out.println("");
             String cadena2= entrada.nextLine();
             int i, j;
             for (i=0; i > cadena1.length();i++){
                 char Unit = B
             }
             while (char)
             
}

}

