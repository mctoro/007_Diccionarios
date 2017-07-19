/*
Como ejemplo practico de uso de colecciones basadas en claves, vamos a realizar un
programa que permita realizar la gestión de un lista de contactos. Cada contacto esta
caracterizado por un nombre de persona (valor) con un DNI (clave) que lo identifica y que será
de tipo numérico, pudiéndose localizar los contactos a partir de ese campo clave.
Al iniciar el programa se mostrara el siguiente menú de opciones:
1. Añadir contacto
2. Eliminar contacto
3. Mostar contactos
4. Salir
Menú que volverá a ser mostrado al usuario después de realizarse la opción correspondiente; así
hasta que elija “salir”.
 */
package com.cice.diccionarios;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre ="";
        int opcion=0;
        int DNI=0;
    Hashtable<Integer,String> datos = new Hashtable<>();
    do {
    
        System.out.println("Ejercicio8");
        System.out.println("==========");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Mostrar contactos");
        System.out.println("4. Salir");
        System.out.println("==========");
        
        opcion = sc.nextInt();
        
           switch (opcion) {
            case 1:
                System.out.println("has elegido añadir contacto. Introduce un DNI");
                DNI = sc.nextInt();
                nombre = sc.next();
                String datosPersona1 = datos.put(DNI, nombre);
                System.out.println(DNI + nombre);

                break;
            
            case 2:
                
                break; 
            
            case 3:
                System.out.println(datos.get(DNI));
                break;
                
            
            case 4:
                break;

            default:
                System.out.println("Opción no valida");
        }        } while (true);
        }
    
            

    
}
