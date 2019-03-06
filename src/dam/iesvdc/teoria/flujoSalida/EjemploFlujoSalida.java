package dam.iesvdc.teoria.flujoSalida;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFlujoSalida {

	public static void main(String[] args) {
		File file = new File("datos/fichero1.txt");
		String cadenaAGuardar = "Sigo probando a introducir datos \n" ;
		if (file.exists()) {
			System.out.printf("El fichero %s existe%n", file.getName());
		} else {
			System.out.println("No existe el fihcero procedemos a crearlo");
			
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("No se puede manipular el fichero");
			}
		}
		//FORMA CLASICA
//		FileOutputStream out = null;
//		try {
//			out = new FileOutputStream(file);
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} finally {
//			try {
//				if (out != null)
//				out.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		//FORMA JAVA 7
		try (FileOutputStream out = new FileOutputStream(file, true);){  // el true sirve para que se añade en el fichero sin sobreescribir lo que ya haia
			out.write(cadenaAGuardar.getBytes());
			out.flush();
			System.out.println("\n Hecho");
			System.out.printf("Fichero escrito %s de tamaño %d bytes%n",file.getName(),file.length());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
