package dam.iesvdc.teoria.flujoES;

import java.io.*;

public class EjemploFlujoES {

	public static void main(String[] args) {
		File file = new File ("datos/fichero1.dat");
		try (RandomAccessFile inOut =new RandomAccessFile (file, "rw");) {
			for (int i = 0; i < 100; i++) {
				System.out.printf("escribiendo el numero %d en la posicion %d %n",i,inOut.getFilePointer());
				inOut.writeInt(i);				
			} 
			System.out.println("Posicion final del puntero: " + inOut.getFilePointer());
			System.out.println("Leyendo un valor entero" + inOut.readInt());
			int posicion = 16;
			inOut.seek(posicion);
			System.out.printf("Valor de la posicion %d es: %d%n", posicion, inOut.readInt());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.printf("El tamaño del fichero %s es: %d bytes%n",file.getName(), file.length());
	}

}
