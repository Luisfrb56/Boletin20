
package com.luis.mantemento;

import com.luis.libros.Libros;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;




public class ClaseMantenemento {
    File fich=new File("fichlibros.txt");;
    Scanner sc;  
 ArrayList<Libros>datosLibros=new ArrayList();
FileWriter fw;
 String cargarFichero;
    public void visualizarFicheiro(){
        String[]listaLibros;
        Libros li;
        try{
            
    sc=new Scanner(new File("fichlibros.txt"));
        while(sc.hasNextLine()){
            
            cargarFichero=sc.nextLine();
                   listaLibros=cargarFichero.split("\\s*,\\s*");
                  li=new Libros(listaLibros[0],listaLibros[1],Float.parseFloat(listaLibros[2]),Integer.parseInt(listaLibros[3]));
                  System.out.println(li);
	} 
    }catch(FileNotFoundException ex){
            System.out.println("Erro lectura ficheiro "+ex.getMessage());
        }
    }
   
public void engadirLibro(Libros libro){

       try {
           fw=new FileWriter(new File("fichlibros.txt"), true);
           fw.write(libro.toString()+"\n");
           fw.close();
       } catch (IOException ex) {
           System.out.println("Error 4");
       } 
   
    }
    
    public void visualizarPrecio(String titulo){
         String[]listaLibros;  
        Boolean encontrado = false; 
      try{
            
    sc=new Scanner(new File("fichlibros.txt"));
        while(sc.hasNextLine()){
            
            cargarFichero=sc.nextLine();
                   listaLibros=cargarFichero.split("\\s*,\\s*");
                  if(titulo.equalsIgnoreCase(listaLibros[0])){
                    System.out.println(listaLibros[2]);  
                    encontrado=true;
                  } 
	} if(encontrado==false){
                      System.out.println("Ese titulo no lo tenemos");
                              }
        sc.close();
    }catch(FileNotFoundException ex){
            System.out.println("Erro lectura ficheiro "+ex.getMessage());
        }
    }
    public void borrarLibro(){
        Iterator<Libros> it = datosLibros.iterator();
        while (it.hasNext()) {
            if (it.next().getUnidades() == 0) {
                it.remove();
            }
        }
    }
    
    public void modificarPrecio(String titulo, Float nuevoPrecio){
       String[]listaLibros; 
       Boolean encontrado = false;
   try{
            
    sc=new Scanner(new File("fichlibros.txt"));
        while(sc.hasNextLine()){
            
            cargarFichero=sc.nextLine();
                   listaLibros=cargarFichero.split("\\s*,\\s*");
                  if(titulo.equalsIgnoreCase(listaLibros[0])){

                      listaLibros[2]=String.valueOf(nuevoPrecio);
                      
                              System.out.println(listaLibros[2]);
                     encontrado=true;
                  }
	} if(encontrado==false){
                      System.out.println("Ese titulo no lo tenemos");
                              }
        sc.close();
    }catch(FileNotFoundException ex){
            System.out.println("Erro lectura ficheiro "+ex.getMessage());
        }
    }
}
