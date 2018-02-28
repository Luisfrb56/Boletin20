
package boletin20;

import com.luis.libros.Libros;
import com.luis.mantemento.*;
import static java.lang.Float.parseFloat;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Boletin20 {

    public static void main(String[] args) {
     ArrayList<Libros>datosLibros=new ArrayList();
      boolean exit=true;
ClaseMantenemento obx=new ClaseMantenemento();
      int opcion=8;
        do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Opciones:\n " +"1. Engadir libros\n " +"2. Consulta precio \n"+"3. Visualizar ficheiros\n"+"4. Borrar libro da libreria por falta de unidades\n"+"5. Modificar precio\n"+"6. Salir"));

                switch (opcion) {
                    case 1:
                        obx.engadirLibro(new Libros(
                               JOptionPane.showInputDialog("Titulo"),
                               JOptionPane.showInputDialog("Autor"),
                               Float.parseFloat(JOptionPane.showInputDialog("Prezo")),
                               Integer.parseInt(JOptionPane.showInputDialog("Unidades"))));
                        break;
                    case 2:
                       obx.visualizarPrecio(JOptionPane.showInputDialog("Titulo"));
                         
                        break;
                    case 3:
                        obx.visualizarFicheiro();
                        break;

                    case 4:
                        obx.borrarLibro();
                        break;
                    case 5:
                       obx.modificarPrecio(JOptionPane.showInputDialog("Titulo"),parseFloat(JOptionPane.showInputDialog("Nuevo Precio")));
                        break;
                    case 6:

                        exit=false;
                        break;

                }
            } catch (NumberFormatException excepcion) {
                System.out.println("Programa cerrado");
                exit=false;
            }

        } while (exit==true);
    }
}