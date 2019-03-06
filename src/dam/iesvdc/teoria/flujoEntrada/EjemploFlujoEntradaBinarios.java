package dam.iesvdc.teoria.flujoEntrada;

import java.io.*;

public class EjemploFlujoEntradaBinarios {

	public static void main(String[] args) {
		//file para el fichero de entrada
		File inFile = new File ("datos/imagen.png");
		//file para el fichero de salida (copiaimagen.png)
		File outFile = new File("datos/copiaimagen.png");
		//flujo binario de entrada ( fileinputstream )
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile))){
			//a medida que leemos byte del flujo de entrada (read)
			int byteALeer;
			while ((byteALeer = in.read())!=-1) { 
				//flujo binario de salida ( fileoutputstream )
				;
				//escribimos en bytes en el flujo de salida (write)
				out.write(byteALeer);
			}
			out.flush();
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra fichero");
		}
		catch (IOException e1) {
			System.out.println("Error de entrada y salida");
		}
		System.out.println("Hecho");
		if (inFile.length() == outFile.length()) {
			System.out.println("Ficheros de igual capacidad");
		}
			
	}

}
