package es.fplumara.dam1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        //Leer todas las líneas de un fichero como string, si falla puede ser debido a un error en la ruta, requiere de un throws IOException
        Path path = Path.of("C:\\Users\\SoufianAhidarDakkaki\\actividades_ficheros\\src\\main\\java\\es\\fplumara\\dam1\\datos.txt");
        String contenido = Files.readString(path);
        System.out.println(contenido);
        //Leer todas las líneas de un fichero en una lista
        Path pathLista = Path.of("C:\\Users\\SoufianAhidarDakkaki\\actividades_ficheros\\src\\main\\java\\es\\fplumara\\dam1\\datos.txt");
        List<String> lineas = Files.readAllLines(pathLista);
        Integer contador = 0;
        for (String linea : lineas) {
            System.out.println(contador + " " + linea);
            contador++;
        }
}
}