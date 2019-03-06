package dam.iesvdc.teoria.serializacionDeClase;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class LectorPersonaSerializable {

	public static void main(String[] args) {
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(new File("datos/persona.dat"))));){
			PersonaSerializacion persona = (PersonaSerializacion) in.readObject();
			System.out.println(persona);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
