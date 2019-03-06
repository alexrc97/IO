package dam.iesvdc.teoria.flujoEntrada;

import java.io.*;

public class EjemploReader {

	public static void main(String[] args) {
		//crear el objeto File que apunte a fundacion.txt
		//crear el flujo de entrada tipo caracter bufferreader
		File inFile = new File("datos/FundacionElImperio");
//		try (BufferedReader in = new BufferedReader(new FileReader(inFile));){
//			String lineaLeida;
//			int cantidadLinea = 0;
//			int cantidadMallow = 0;
//			while ((lineaLeida= in.readLine()) != null) {
//				System.out.println(lineaLeida);
//				cantidadLinea++;
//				if (lineaLeida.contains("Mallow")){
//					cantidadMallow++;
//				}
//			}
//			System.out.println("La cantidad de lineas es: " + cantidadLinea);
//			System.out.println("Numero de lineas donde aparece la palabra Mallow" + cantidadMallow);
//
//		} catch (FileNotFoundException e) {
//			System.out.println("Archivo no encontrado");
//		} catch (IOException e1) {
//			System.out.println("Error de entrada y salida");
//		}
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));){
			int caracterLeido;
			while ((caracterLeido=in.read()) != -1) {
				System.out.print( (char) caracterLeido);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
