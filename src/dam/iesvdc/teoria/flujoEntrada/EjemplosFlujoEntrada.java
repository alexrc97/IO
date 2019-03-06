package dam.iesvdc.teoria.flujoEntrada;

import java.io.*;

public class EjemplosFlujoEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File ("datos/fichero3.txt");
		try (FileInputStream in = new FileInputStream(inFile);){
			int byteALeer;
			while ((byteALeer = in.read())!=-1) { //los ficheros binarios terminan cuando se intenta leer un -1
				System.out.print((char) byteALeer);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero " + inFile);
		} catch (IOException e1) {
			System.out.println("Error de lectura");
		}
		
	
	}

}
