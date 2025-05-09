/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rodriguez_victor_estructura;

import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author t0cin
 */
public class Rodriguez_Victor_Estructura {

    public static void main(String[] args) {
        
       Scanner lea = new Scanner(System.in);
       
       int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulo = 0;
        lea.useDelimiter("\n");
        Random random = new Random();
        int op = 0, op1=0, op2=0, op3=0, op4=0;
        
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
                    System.out.println("====PALABRA ALREVES====");
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
                   System.out.println("====NUMERO PERFECTO====");
                   System.out.print("Ingrese un numero: ");
                int numero = lea.nextInt();
                int sumaDivisores = 0; 
                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) sumaDivisores += i;
                }
                System.out.println(numero + (sumaDivisores == numero ? " es un numero perfecto" : " no es un numero perfecto"));
                
                  op2++;
                  break;
              case 3:
                  
                  System.out.println("====PRIMOS====");
                int numeros = random.nextInt(100)+1;
                int divisores = 0;
                System.out.print("Divisores de " + numeros + ": ");
                for (int i = 1; i <= numeros; i++) {
                    if (numeros % i == 0) {
                        System.out.print(i + " ");
                        divisores++;
                    }
                }
                
                System.out.println("\n" + numeros + (divisores == 2 ? " es un numero primo." : " no es un numero primo.")); 

                  op3++;
                  break;
              case 4:
                  
                  System.out.println("====VOTACIONES====");
                  System.out.print("Ingrese la cantidad de votantes: ");
                int votantes = lea.nextInt();
                for (int i = 1; i <= votantes; i++) {
                    System.out.print("Voto " + i + " (AZUL, ROJO, NEGRO, AMARILLO): ");
                    String voto = lea.next().toUpperCase();
                    switch (voto) {
                        case "AZUL": azul++; break;
                        case "ROJO": rojo++; break;
                        case "NEGRO": negro++; break;
                        case "AMARILLO": amarillo++; break;
                        default: nulo++; break;
                    }
                }
                int totalVotosValidos = azul + rojo + negro + amarillo;
                double porcentajeValido = (totalVotosValidos * 100.0) / votantes;
                if (porcentajeValido >= 60) {
                    System.out.println("Ganador: " + 
                        (azul > rojo && azul > negro && azul > amarillo ? "AZUL" : 
                        rojo > azul && rojo > negro && rojo > amarillo ? "ROJO" : 
                        negro > azul && negro > rojo && negro > amarillo ? "NEGRO" : 
                        amarillo > azul && amarillo > rojo && amarillo > negro ? "AMARILLO" : "EMPATE"));
                } else {
                    System.out.println("VOTACIÓN FALLIDA");
                }
                  
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
