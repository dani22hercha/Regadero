/*
 */
package sistemaregadero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SistemaRegadero {

    public static void main(String[] args) {
        File archivo = null;
        FileReader palabras = null;
        BufferedReader datos = null;
        
        try {
            archivo= new File ("C:\\Users\\Usuario\\Desktop\\Regadero.txt");
            palabras = new FileReader (archivo);
            datos= new BufferedReader(palabras);
            
            String linea;            
            
            while((linea=datos.readLine())!=null) {
                int e, s, v;
                
                System.out.println(linea);
                
                //Se clasifican los datos
                String[] Datos = linea.split(" ");
                
                //Se hallan los 3 números: #entradas, #salidas, #válvulas
                e= Integer.parseInt(Datos[0]); //#entradas
                s= Integer.parseInt(Datos[1]); //#salidas
                v= Integer.parseInt(Datos[2]); //#válvulas
                
                

                
                
                
                System.out.print("Persona " + Datos[0]);
                System.out.print(" con cédula " + Datos[1]);
                
                
                
                
                
                
                
                
                
            }
            
        }
        
        catch (IOException e) {
            System.out.println("Error en los datos de entrada "+e);
        }
        catch(Exception e) {
            System.out.println("Error en los datos de entrada "+e);
        }
        
        finally {
            try {
                datos.close();
            }
            catch (IOException e) {
                System.out.println("Problema en el cierre del archivo "+e);
            }
        }
    }
    
}
