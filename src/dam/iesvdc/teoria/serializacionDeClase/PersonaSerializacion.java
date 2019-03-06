package dam.iesvdc.teoria.serializacionDeClase;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

@SuppressWarnings("serial")
public class PersonaSerializacion implements Serializable{
	private String nombre;
	private String apellidos;
	private LocalDate fechaNac;
	public PersonaSerializacion(String nombre, String apellidos, LocalDate fechaNac) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	@Override
	public String toString() {
		return nombre + "," + apellidos + "," + CalcularAnnosTranscurrido(fechaNac);
	}
	
	public static int CalcularAnnosTranscurrido (LocalDate fecha) {
		Period period = Period.between(fecha, LocalDate.now());		
		return period.getYears();
	}
	public static void main(String[] args) {
		PersonaSerializacion persona =
				new PersonaSerializacion("Alex", "Ruiz Cueto", LocalDate.parse("1997-11-09"));
	System.out.println(persona);
	}
}
