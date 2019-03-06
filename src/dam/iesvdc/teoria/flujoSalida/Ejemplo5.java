package dam.iesvdc.teoria.flujoSalida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo5 {

	public static void main(String[] args) {
		//crear un objeto File para el fichero de salida
		File outFile = new File ( "datos/fichero3.txt" );
		//crear una lista de String para añadir distintas lineas
		List<String> list = new ArrayList<>();
		//añadis las lineas
		list.add("Hola");
		list.add("estoy");
		list.add("probando");
		//definimos bufferedwriter y excepciones segun java 7	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter (outFile));){
			//escribimos en el bufer 
			for (String string : list) {
				bw.write(string);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hecho");
	}

}
