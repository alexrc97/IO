package dam.iesvdc.teoria.serializacionDeClase;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class EscribePersonaSerializacion {

	public static void main(String[] args) {
		List<PersonaSerializacion> listaPersonas = new ArrayList<>(); //se podria hacer una coleccion y añadir objetos y luego esa lista serializarla como objeto para poder hacer flujos con ella
		File outFile = new File ("datos/persona.dat");
		//DateTimeFormatter formatter = new DateTimeFormatter.ofPattern("10/10/2010", formatter);
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream (new FileOutputStream(outFile)));){
			PersonaSerializacion persona =
					new PersonaSerializacion("Alex", "Ruiz Cueto", LocalDate.parse("1997-11-09"));
			out.writeObject(persona);
			out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
