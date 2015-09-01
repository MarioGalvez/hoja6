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
import java.util.Arrays;
import java.util.Iterator;;
import java.util.Scanner;
import java.util.Set;



public class HJ6{

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        boolean entry = false;
        int numero=0;
        int clase=0;
        // TODO code application logic here
        
       while (!entry){
            System.out.println("Escoja la implementacion de Set: \n1.HashSet\n2.TreeSet\n3.LinkedHashSet\n");
            
            String ent = entrada.nextLine();
            // Se pide que ingrese una opcion si lo ingresado es distinto de un numero o es mayor a 3 se mantiene
            // el ciclo para seguir pidion que opcion de implementacion se desea de SET
            try{
                   numero = Integer.parseInt(ent);
                   entry=true;
            }catch(NumberFormatException e){
                 System.out.println("Ingrese solamente numeros");
                 entry=false;
            }
            if (numero>3){
                entry=false;
            }
       }
       clase=numero;
       //Se implementan los tres conjuntos con la implementacion deseada.
        Set<String> JAVA = new Conjunto<String>().GetConjunto(clase);
        Set<String> WEB = new Conjunto<String>().GetConjunto(clase);
        Set<String> CELL = new Conjunto<String>().GetConjunto(clase);
        
        entry = false;
        // ingreso de los desarrolladores
                System.out.println("\n******************************************");
                System.out.println("\nBienvenido al programa ");
                System.out.println("\n********************************************");
                System.out.println();
        
        while (!entry){
            System.out.println("Ingrese el grupo del  desarollador que  pertenece\n(1) java \n(2) web \n(3) cell\n(4) salir");
        
            String ent = entrada.nextLine();
            // Se pide que ingrese una opcion si lo ingresado es distinto de un numero o es mayor a 4 se mantiene
            // el ciclo para seguir pidiendo donde iran cada desarrollador en los conjuntos
            try{
                   numero = Integer.parseInt(ent);
            }catch(NumberFormatException e){
                 System.out.println("Ingrese solamente numeros");
                 entry=false;
            }
            String nombre;
            if(numero==1){
                System.out.println("Ingrese  su nombre del desarrollador ");       
                nombre = entrada.nextLine();
                    
                JAVA.add(nombre);
            }if(numero==2){
                System.out.println("Ingrese  su nombre del desarrollador ");       
                nombre = entrada.nextLine();
                
                WEB.add(nombre);
            }if(numero==3){
                System.out.println("Ingrese  su nombre del desarrollador ");       
                nombre = entrada.nextLine();
                
                CELL.add(nombre);
            }
            if (numero>4){
                entry=false;
            }if (numero==4){
                entry=true;
            }
       }
                
   

     System.out.println("Desarrolladores con experiencia en Java,web y celulares\n"); 
        Set<String> Union = new Conjunto<String>().GetConjunto(clase);
            Union.addAll(WEB);
            Union.addAll(JAVA);
            Union.addAll(CELL);
            Iterator iterador = Union.iterator();
            while(iterador.hasNext()){
                System.out.println(iterador.next());   
            }
            
     System.out.println("\nDesarrolladores con experiencia en Java pero no en web\n");
            Set<String> parte2 = new Conjunto<String>().GetConjunto(clase);
            parte2.addAll(JAVA);
            parte2.removeAll(WEB);
            iterador = parte2.iterator();
             while(iterador.hasNext()){
                    System.out.println(iterador.next());   
                }

     System.out.println("\nDesarrolladores con experiencia en Web y Celulares pero no en java\n");
            Set<String> parte3 = new Conjunto<String>().GetConjunto(clase);
            parte3.addAll(CELL);
            parte3.retainAll(WEB);
            parte3.removeAll(JAVA);
            iterador = parte3.iterator();
             while(iterador.hasNext()){
                    System.out.println(iterador.next());   
                }
             
     System.out.println("\nDesarrolladores con experiencia en Web o Celulares pero no en java\n");
            Set<String> parte4 = new Conjunto<String>().GetConjunto(clase);
            parte4.addAll(CELL);
            parte4.addAll(WEB);
            parte4.removeAll(JAVA);
            iterador = parte4.iterator();
             while(iterador.hasNext()){
                    System.out.println(iterador.next());   
                }

     System.out.println("\nEs el conjunto de desarrolladores Java un subconjunto de desarrolladores Web");
            if(WEB.containsAll(JAVA)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
              
     System.out.println("\nMayor conjunto de desarrolladores: ");
            boolean conjJava=false,conjWeb=false,conjCell=false;

            if(JAVA.size()>WEB.size() && JAVA.size()>CELL.size()){
                conjJava=true;
                System.out.print("JAVA\n");
            }if(WEB.size()>JAVA.size() && WEB.size()>CELL.size()){
                conjWeb=true;
                System.out.print("WEB");
            }if(CELL.size()>WEB.size() && CELL.size()>JAVA.size()){
                conjCell=true;
                System.out.print("CELULARES");
            }
      
    System.out.println("\nLista de integrantes");         
            String[] lista = new String[10]; //lista a guardar los integrantes de el grupo mas grande
             if(conjJava){
                iterador = JAVA.iterator();
                lista = JAVA.toArray(new String[JAVA.size()]);
             while(iterador.hasNext()){
                    System.out.println(iterador.next()); 
                }
            }if(conjWeb){
                iterador = WEB.iterator();
                lista = WEB.toArray(new String[WEB.size()]);
             while(iterador.hasNext()){
                    System.out.println(iterador.next());   

                }
            }if(conjCell){
                iterador = CELL.iterator();
                lista = CELL.toArray(new String[CELL.size()]);
             while(iterador.hasNext()){
                    System.out.println(iterador.next()); 

                }
            }
            
            
            Set<String> ordenada = new Conjunto().GetConjunto(2); //se crea un conjunto de treeset par que al impirmir los resultados esten ordenados
            ordenada.addAll(Arrays.asList(lista)); // se agregan los string del conjunto mas grande
            iterador = ordenada.iterator();
            System.out.println("\nLista Ordenada"); // se imprimen
             while(iterador.hasNext()){
                    System.out.println(iterador.next()); 

                }
            //fin del programa
       
    }
}


