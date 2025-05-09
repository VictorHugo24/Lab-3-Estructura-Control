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
        lea.useDelimiter("\n");
        int op = 0, op1=0, op2=0, op3=0, op4=0;
        int contadorNumeroPerfecto = 0;
        
        do {
            System.out.println("****MENU****");
            System.out.println("1) Palabra alreves");
            System.out.println("2) Numero Perfecto");
            System.out.println("3) Primos");
            System.out.println("4) Votaciones");
            System.out.println("5) Salir");
            System.out.print("Por favor ingrese una opcion: ");
            op = lea.nextInt();
            
            if (op > 5) {
                System.out.println("Opcion no valida!!!");
            }
            
            switch (op) {
                case 1:
                    System.out.print("Por favor ingrese la cantidad de palabras: ");
                    int cantidad = lea.nextInt();
                    int cont = 0;
                    String palabraMayor = "";
                    int maxLength = 0;
                    while (cont != cantidad) {
                        System.out.print("Palabra #" + (cont + 1) + ": ");
                        String palabra = lea.next();
                        
                        
                        String palabraLower = palabra.toLowerCase();
                        String palabraInvertida = "";
                        int recorrido = palabra.length() - 1;
                        
                        while (recorrido >= 0) {
                            palabraInvertida += palabra.charAt(recorrido);
                            recorrido--;
                        }
                        System.out.println("Palabra invertida: " + palabraInvertida);

                        if (palabra.length() > maxLength) {
                            maxLength = palabra.length();
                            palabraMayor = palabra;  
                        }
                        
                        cont++;
                    }
                    System.out.println("La palabra mas larga es: " + palabraMayor + " con " + maxLength + " caracteres");

                    String palabraLower = palabraMayor.toLowerCase();
                    String palabraInvertida = "";

                    int recorrido = palabraMayor.length() - 1;
                    while (recorrido >= 0) {
                        palabraInvertida += palabraMayor.charAt(recorrido);
                        recorrido--;
                    }

                    if (palabraLower.equals(palabraInvertida.toLowerCase())) {
                        System.out.println("La palabra mas larga es palindromo");
                    } else {
                        System.out.println("La palabra mas larga no es palindromo");
                    }

                    break; 

              case 2:
                   System.out.print("Ingrese un numero: ");
                int numero = lea.nextInt();
                int sumaDivisores = 0; 
                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) sumaDivisores += i;
                }
                System.out.println(numero + (sumaDivisores == numero ? " es un número perfecto." : " no es un número perfecto."));
                contadorNumeroPerfecto++;
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
