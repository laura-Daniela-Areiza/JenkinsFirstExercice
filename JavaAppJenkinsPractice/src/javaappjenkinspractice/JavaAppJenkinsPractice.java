/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappjenkinspractice;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class JavaAppJenkinsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello earlings! \nThis is my first project with GitHub and Jenkins. \nHere we will create a small calculator.");
        System.out.println("");
        
        Scanner read = new Scanner(System.in);
        
        int rta;
        boolean salir = false;
              
        System.out.println("Ingrese dos números enteros");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        
        do {
            System.out.println("=====");
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            rta = read.nextInt();
            
            switch (rta){
                case 1:
                    System.out.println("La suma de los números ingresados es : " + (num1 + num2));   
                    System.out.println(" ");
                    continue;
                case 2:
                    System.out.println("La resta de los números ingresados es : " + (num1 - num2));
                    System.out.println(" ");
                    continue;
                case 3:
                    System.out.println("La multiplicación de los números ingresados es : " + (num1 * num2));
                    System.out.println(" ");
                    continue;
                case 4:
                    System.out.println("La división de los números ingresados es : " + (num1 / num2));
                    System.out.println(" ");  
                case 5: 
                    System.out.println("¿Está seguro que desea salir? Responda S si su respuesta es Si o N si su repsuesta es no");
                    String rta2 = read.next();
                        if (rta2.equalsIgnoreCase("S")){
                            System.out.println("Ha salido exitosamente del programa");
                            salir = true;
                        } else {
                            System.out.println("");
                            salir = false;
                        }
            }
        }while (salir == false);
    }
    
}
