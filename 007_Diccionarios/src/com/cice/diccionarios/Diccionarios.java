package com.cice.diccionarios;

import java.util.Hashtable;

public class Diccionarios {
    
    public static void main(String[] args){
        
        Hashtable<String,String> diccionario = new Hashtable<>();
        
        String dentroDelCajon = diccionario.put("cajon", "calculadora");
        System.out.println(dentroDelCajon);
        dentroDelCajon = diccionario.put("cajon", "linterna");
        System.out.println(dentroDelCajon);
        dentroDelCajon = diccionario.put("cajon", "estuche");
        System.out.println("habia "+ dentroDelCajon);
        System.out.println("hay " + diccionario.get("cajon"));
        
        diccionario.remove("cajon");
        System.out.println(diccionario.size());
    }
    
    
}
