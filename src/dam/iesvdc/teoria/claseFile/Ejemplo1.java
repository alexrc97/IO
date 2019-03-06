package dam.iesvdc.teoria.claseFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		//crear objeto file que apunte a la carpeta datos
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la ruta del fichero que quieres saber los datos");
		String ruta = sc.nextLine();
		sc.close();
		File fichero = new File (ruta);
		if (!fichero.exists()) {
			System.err.println("No existe el fichero");
			System.exit(1);
		}
		//obtener lista de ficheros
		File[] ficheros =fichero.listFiles();
		//llamar a un metodo estatico con argumento otro File que nos de atributos
		//del fichero: tamaño,si es un directorio, saber los permisos
//		for (File file : ficheros) {
//		mostrarDatosFichero(file);
//		}
		List<File> listaFicheros = Arrays.asList(ficheros);
//		for (File file : listaFicheros) {
//			mostrarDatosFichero(file);
//		}
		listaFicheros.forEach(file -> mostrarDatosFichero(file));
	}
	public static void mostrarDatosFichero(File file) {
		System.out.println("==================");
		System.out.printf("Ruta del fichero  o directorio %s %n",file.getAbsoluteFile());
		System.out.printf("¿Es un directorio? %b %n",file.isDirectory());
		System.out.printf("El tamaño del fichero es: %d %n", file.length());
		System.out.printf("¿Permiso ejecucion? %b %n ¿Permiso lectura? %b %n ¿Permiso escritura? %b %n", file.canExecute(),file.canRead(),file.canWrite());
		System.out.println("==================");
	}
}
