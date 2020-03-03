package ejemploarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjemploArchivo {

    public static void main(String[] args) {

        //Leer un archivo
        File archivo;
        FileReader fr;

        BufferedReader br;

        try {
            archivo = new File("C:\\Users\\JOSEDAGUILA\\Documents\\archivoprueba.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String texto = "";

            while ((texto = br.readLine()) != null) {
                System.out.println(texto);
            }

            
            
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
