import java.time.LocalDate;
import java.util.Date;

public abstract class Empleado {

	/*
	 * nombre. Nombre del empleado edad. Edad del empleado fechaIngreso. Fecha en la
	 * que ingresó en la empresa salario. Salario anual
	 */

	String nombre;
	int edad;
	LocalDate fechaIngreso;
	double salario;
	final double bono = 1000;

	public Empleado() {

	}

	public Empleado(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", fechaIngreso=" + fechaIngreso + ", salario="
				+ salario + ", bono=" + bono + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBono() {
		return bono;
	}

	abstract public void incentivar();

}
