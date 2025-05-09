/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rodriguez_victor_estructura;

import java.util.Scanner;

/**
 *
 * @author t0cin
 */
public class Rodriguez_Victor_Estructura {

    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        int op=0, op1=0, op2=0, op3=0, op4=0;
        do{
        System.out.println("****MENU****");
        System.out.println("1) Palabra alreves");
        System.out.println("2) Numero Perfecto");
        System.out.println("3) Primos");
        System.out.println("4) Votaciones");
        System.out.println("5) Salir");
        System.out.print("Por favor ingrese una opcion: ");
         op = lea.nextInt();
         
          if(op>5){
              System.out.println("Opcion no valida!!!");
          }
         
          switch (op){
              case 1:
                  op1++;
                  break;
              case 2:
                  op2++;
                  break;
              case 3:
                  op3++;
                  break;
              case 4:
                  op4++;
                  break;
          }            
        }while(op !=5);
        
        System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA!!!!");
        System.out.println("La opcion 1 se ejecuto: "+op1+" veces");
        System.out.println("La opcion 2 se ejecuto: "+op2+" veces");
        System.out.println("La opcion 3 se ejecuto: "+op3+" veces");
        System.out.println("La opcion 4 se ejecuto: "+op4+" veces");
     
        
        
        
    }
}
