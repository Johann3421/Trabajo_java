/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hello_world;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Hello_world {

    public static void main(String[] args) {
        System.out.println("Mi primera calculadora");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora basica");
        System.out.println("Operaciones disponibles");
        System.out.println("1: suma");
        System.out.println("2: resta");
        
        System.out.println("Selecciona una operacion: (1/2)");
        int opcion = scanner.nextInt();
        System.out.println("Ingrese el primer numero: ");
        double numero1= scanner.nextDouble();
        System.out.println("Ingrese el Segundo Numero: ");
        double numero2= scanner.nextDouble();
        double resultado=0.0;
        
        switch (opcion){
            case 1:
                resultado=numero1+numero2;
                break;
            case 2:
                resultado=numero1-numero2;
                break;
            default:
                System.out.println("Opcion no valida");
                return;
        }
        System.out.println("Resultado: "+numero1+" Operacion "+numero2+" = "+resultado);
        
    
    }
}
