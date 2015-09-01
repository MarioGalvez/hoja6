/*
|-------------------------------------------|
|Universidad del Valle de Guatemala         |  
|Mario Galvez                               |
|Luisa Arboleda                             |
|-------------------------------------------|
|Clase HJ6 (main)                           |
|Hoja de Trabajo No. 6 Estructuras de Datos |
|-------------------------------------------
*/

package hoja6;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Conjunto<String>{
    
    public Set<String> GetConjunto(int numero){
// Factory para  la implementacion de Set
// e imprime que implementacion es
        if(numero==1){
           //System.out.println("HashSet");
           return new HashSet<String>();
        }
        if(numero==2){
           //System.out.println("TreeSet");
           return new TreeSet<String>();  
        }
        if (numero==3){
           //System.out.println("LinkedHashSet");
           return new LinkedHashSet<String>();
        }
        System.out.println("null");
        return null;
    }
}
