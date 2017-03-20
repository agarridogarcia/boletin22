/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ara
 */
public class Libreria {
    ArrayList <Libro> libreria = new ArrayList<Libro>();
    
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
                if(libreria.get(i).titulo.equals(libros));
                System.out.println("O libro está na lista");
                atopado=true;
                System.out.println("Titulo do libro: "+libreria.get(i).titulo+" Precio: "+ (libreria.get(i).precio));
            }
            if(atopado=false)
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
File fich;
    Scanner sc;

    public void Ler(String nombreFich) {
       
        fich = new File(nombreFich);
        try {
            sc = new Scanner(fich);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            sc.close();
        }
    }

   
}
