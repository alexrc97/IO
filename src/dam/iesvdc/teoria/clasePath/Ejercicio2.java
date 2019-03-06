package dam.iesvdc.teoria.clasePath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* Clase que copia ficheros usando las utilidades del paquete
 * nio, en este caso con la clase Files
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// Definir los path de entrada y de salida
		Path inPath = Paths.get("datos", "FundacionElImperio.txt");
		Path outPath = Paths.get("datos","FundacionOut.txt");
		// Si no existe el path de entrada, salir del programa
		if (Files.notExists(inPath)){
			System.err.println("Hasta luego Lucas el fichero no existe" + inPath.toString());
			return;
		}
		// Usando el metodo copy de la clase Files copiamos inPath a outPath
		try {
			Files.copy(inPath, outPath, StandardCopyOption.REPLACE_EXISTING); // el copy se encarga de abrir y de cerrar los flujos el solo
			System.out.printf("Tamaño del fichero de entrada %s %d bytes %n",inPath.toString(),Files.size(inPath));
			System.out.printf("Tamaño del fichero de salida %s %d bytes %n",outPath.toString(),Files.size(outPath));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Mostramos el tamaño del fichero de salida y de entrada
		//	controlamos si los ficheros son iguales

	}

}
