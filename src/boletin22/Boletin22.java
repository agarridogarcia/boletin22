
package boletin22;

import java.io.IOException;
import javax.swing.JOptionPane;


public class Boletin22 {

    
    public static void main(String[] args) throws IOException {
        Libreria li=new Libreria();
       
        int opcion;
         li.leerLineas();
         
         do{
             try{
                 
                 opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Engadir \n2 Consultar por titulo \n3 Visualizar \n4 Borrar libros a 0 \n5 Ordenar libros \n6 Consultar autor \n7 Modificar libro \n8 Salir"));
                 
             }catch(Exception ex){
                 System.out.println(ex.getMessage());
                 opcion=0;
             }
            switch(opcion){
            case 1: li.engadir();
                break;
            case 2:li.consultar();
                break;
            case 3:li.visualizar();
                break;
            case 4:li.borrarLibrosAcero();
                break;
            case 5:li.ordenar();
                break;
            case 6:li.consultarAutor();
                break;
            case 7:li.modificar();
             break;
            case 8:{li.escribirTexto("lib.txt");System.exit(0);}
            
    }
    
}while(opcion<8);

    
}
}
   
    

