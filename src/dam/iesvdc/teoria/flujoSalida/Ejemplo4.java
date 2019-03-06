package dam.iesvdc.teoria.flujoSalida;

import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo4 {

	public static void main(String[] args) {
		String frase = "Ejemplo con un eñe";
		try (FileWriter out = new FileWriter ("datos/fichero2.txt");){
			out.write(frase);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hecho");
	}

}
