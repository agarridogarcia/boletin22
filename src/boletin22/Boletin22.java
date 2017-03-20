
package boletin22;

import javax.swing.JOptionPane;


public class Boletin22 {

    
    public static void main(String[] args) {
        Libreria li=new Libreria();
       
        int opcion;
         
         do{
             try{
                 opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Engadir \n2 Consultar \n3 Visualizar \n4 escribir ficheiro \n5 leer datos ficheiro \n6  \n7 Salir"));
                 
             }catch(Exception ex){
                 System.out.println(ex.getMessage());
                 opcion=0;
             }
            switch(opcion){
            case 1: li.engadir();
                break;
            case 2:li.consultar();
                break;
            case 3:li.visualizar();li.Ler("lib.txt");
                break;
            case 4:li.escribirTexto("lib.txt");
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:System.exit(0);
            
    }
    
}while(opcion<7);

    
}
}
   
    

