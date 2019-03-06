package dam.iesvdc.teoria.clasePath;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Path path = new Path ("datos"); no se puede crear objetos de una interfaz
		Path path = Paths.get("datos", "fichero1.txt");
		System.out.println(path);
		Path pahtParent = path.getParent();
		System.out.println(pahtParent);
		System.out.println(path.getNameCount());
		System.out.println(path.endsWith("fichero1.txt"));
		File filePath = path.toFile();
	}

}
