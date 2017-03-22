/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Ara
 */
public class Libreria {
    private Scanner scan;
    private PrintWriter escribe;
    private ArrayList <Libro> libreria = new ArrayList<Libro>();
    
    public String dameTitulo(){
return(JOptionPane.showInputDialog("Titulo: "));
}
public String dameAutor(){
return(JOptionPane.showInputDialog("Autor: "));
}
   public int pedirNumExemplares(){
    return(Integer.parseInt(JOptionPane.showInputDialog("NumExemplares: ")));
}
public float pedirPrecio(){
    return(Float.parseFloat(JOptionPane.showInputDialog("Precio: ")));
}

public void engadir(){
    libreria.add(new Libro(dameTitulo(),dameAutor(), pedirPrecio(),pedirNumExemplares()));
}
public void consultar(){
   
    
    String libros=JOptionPane.showInputDialog("Libro que queres ver si hai: ");
            boolean atopado=false;
            for(int i=0;i<libreria.size();i++){
                if(libreria.get(i).titulo.equals(libros)){
                System.out.println("O libro está na lista");
                atopado=true;
                System.out.println("Titulo do libro: "+libreria.get(i).titulo+" Precio: "+ (libreria.get(i).precio));
                }
            }
            if(atopado==false)
                System.out.println("O libro non está na lista");
            
} 
    
public void consultarAutor(){
   
    
    String libros=JOptionPane.showInputDialog("Autor que queres ver si hai: ");
            boolean atopado=false;
            for(int i=0;i<libreria.size();i++){
                if(libreria.get(i).autor.equals(libros)){
                
                atopado=true;
                System.out.println(libreria.get(i).autor + " titulo:"+ libreria.get(i).titulo);
                }
            }
            if(atopado==false)
                System.out.println("O libro non está na lista");
            
}       

    



public void visualizar(){
     for(int i=0; i<libreria.size();i++)
         System.out.println(libreria.get(i));
     
}
public void amosarIterator(){
Iterator <Libro> meu_iterator=libreria.iterator();
    while(meu_iterator.hasNext()){
            System.out.println(meu_iterator.next().toString());
    }
}
public void borrarLibrosAcero(){
    for(int i=0;i<libreria.size();i++){
        if(libreria.get(i).unidades==0)
            libreria.remove(i);

    }
}
public void ordenar(){
    Collections.sort(libreria);
    
    }
public void escribirTexto(String nombreFichero){
         File fich;
         PrintWriter f = null;
        try{
            fich = new File (nombreFichero);
            f= new PrintWriter(fich);
            for(int i=0;i<libreria.size();i++){
              f.println(libreria.get(i));  
          
            }
           
        }catch (FileNotFoundException ex){
            System.out.println("Error 4 " + ex.getMessage());  
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Error 5: "+ ex.getMessage());
        }
        finally{
            f.close();
        }      
}   
    

    public void leerLineas() throws FileNotFoundException, IOException{
        String s1;
        String s2;
 
        
        BufferedReader br = new BufferedReader (new FileReader ("lib.txt"));
 
       
        do{
        s1 = br.readLine();
        if(s1!=null){
            StringTokenizer st = new StringTokenizer(s1,",");
            System.out.println ("Libros:" + s1);
            while (st.hasMoreTokens()){
                libreria.add(new Libro(st.nextToken(),st.nextToken(),Float.parseFloat(st.nextToken()),Integer.parseInt(st.nextToken())));
               
            }
                
        }
        }
        while(s1!=null);

 
}
    public void ler(String nomFich){
        String[]aux;
        try{
            scan = new Scanner(new File(nomFich));
            while(scan.hasNextLine()){
                aux = scan.nextLine().split(",");
                libreria.add(new Libro (aux[0], Float.parseFloat(aux[1])));
            }
        }catch(Exception ex){
            System.out.println(ex + " File not found");
        }finally{
            scan.close();
        }
    }
    
 public void modificar(){
 String modificar=JOptionPane.showInputDialog("Libro que queres modificar: ");
    for(int i=0;i<libreria.size();i++){
        if(libreria.get(i).getTitulo().equals(modificar)){
            libreria.get(i).setAutor(dameAutor());
            libreria.get(i).setTitulo(dameTitulo());
            libreria.get(i).setPrecio(pedirPrecio());
            libreria.get(i).setUnidades(pedirNumExemplares());
                  
        }
         
    }
 }
 

}
