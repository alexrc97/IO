package dam.iesvdc.teoria.clasePath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio3 {

	public static void main(String[] args) {
		//crear el path del fichero
		Path inPath = Paths.get("datos", "FundacionElImperio.txt");
		if (Files.notExists(inPath)){
			System.err.println("Hasta luego Lucas el fichero no existe" + inPath.toString());
			return;
		}
		//usando el metodo readAllLines, leemos todas las lineas
		try {
			List <String> lineas = Files.readAllLines(inPath);
			//mostrar cuantas lineas tiene el fichero
			System.out.printf("El fichero %s tiene %d lineas %n",inPath.toString(),lineas.size());
			//mostrar el numero de ocurrencias de un palabra, Trántor
			String ocurrencia = "Trántor";
			int contador = 0;
			for (String string : lineas) {
				if (lineas.contains("Trántor")) {
					contador++;
				}
			System.out.printf("El numero de veces que aparece "
					+ "la palabra %s es %d%n",ocurrencia, contador);
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
