/*
Como ejemplo de utilización de colecciones basadas en índices vamos a desarrollar un
programa que nos permita registrar una serie de precios de productos en una colección,
ofreciéndonos además la posibilidad de obtener unos datos estadísticos sobre los mismos.
Al iniciarse el programa se presentara al usuario en un menú como el que se indica a
continuación:
1. Nuevo precio
2. Precio medio
3. Precio máximo
4. Precio mínimo
5. Mostrar todos los precios
6. Salir
Menú que volverá a ser mostrado al usuario después de realizarse la opción correspondiente; así
hasta que elija ”salir”
Con la opción 1 se le pedirá al usuario que introduzca el precio que quiere almacenar, mientras
que las demás opciones mostraran los datos solicitados. Como veremos a continuación en el
listado de código, en vez de incluir todo el código en el interior del método main() se realizara la
gestión de cada una de las opciones en métodos independientes para facilitar la claridad del
código y hacerlo mas estructurado.

        //Mostrar menú
        //solicitar al usuario que elija una opción. Opción 6 debemos salir de la aplicación
        //ejecutar la opción elegida
        //volver a mostrar el menú (siempre que la opción 6 no sea elegida)
 */
package com.cice.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejercicio07 {

    //variables de la clase 
    static ArrayList<Double> precios = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int opcion = 0;
    public static void main(String[] args) {
        

        
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            opcionElegida(opcion);
            
        } while (opcion != 6);
        
    }
    
    public static void mostrarMenu() {
        
        System.out.println("Menu ejercicio 7");
        System.out.println("================");
        System.out.println("Elige una opción");
        System.out.println("1. Nuevo precio");
        System.out.println("2. Precio medio");
        System.out.println("3. Precio maximo");
        System.out.println("4. Precio minimo");
        System.out.println("5. Mostrar todos los precios");
        System.out.println("6. Salir");
        System.out.println("");
        System.out.println("================");
        
        System.out.print("Tu opción es: ");
        
    }
    
    public static void opcionElegida(int opcion) {
        
        switch (opcion) {
            case 1:
                System.out.print("Introduce el nuevo precio: ");
                addPrecio(sc.nextDouble());
                break;
            
            case 2:
                
                System.out.println("El precio medio es: " + calcularMedio());
                break;
            
            case 3:
                System.out.println("El precio maximo es: " + calcularMaximo());
                break;
            
            case 4:
                System.out.println("El precio minimo es: " + calcularMinimo());
                break;
            
            case 5:
                System.out.println("Lista de precios: " + precios.toString());
                break;
            
            case 6:
                System.out.println("Gracias por utilizar nuestro programa");
                break;
            default:
                System.out.println("Opción no valida");
        }
        
    }
    
    public static boolean addPrecio(double precio) {
        boolean resultado = false;
        
        resultado = precios.add(precio);
        
        return resultado;
    }
    
    public static double calcularMaximo() {
        double maximo = 0;
        
        for (Double precio : precios) {
            maximo = Math.max(maximo, precio);
        }
        
        return maximo;
        
    }
    
    public static double calcularMinimo() {
        double minimo = Double.MAX_VALUE;
        for (Double precio : precios) {
            minimo = Math.min(minimo, precio);
        }
        return minimo;
        
    }

    public static double calcularMedio() {
        double precioMedio = 0;
        for (Double precio : precios) {
            precioMedio += precio;
        }
        return precioMedio / precios.size();
        
    }
    
}
