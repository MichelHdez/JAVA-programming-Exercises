import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Operario extends Empleado {

	/*
	 * Será un subtipo de empleado que incluirá el siguiente atributo: nivel. Nivel
	 * de seguridad del operario, puede ser un valor entre 1 y 5.
	 */

	int nivel;

	public Operario() {

	}

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	/*
	 * @Override public void incentivar() { if (super.getEdad() > 30 && this.nivel >
	 * 2) { double nuevoSalario = super.getSalario() + super.salario;
	 * super.setSalario(nuevoSalario);
	 * System.out.println("Se le aumento al empleado " + super.getNombre()); }
	 * System.out.println("No se realizó aumento " + super.getNombre()); }
	 */

	@Override
	public void incentivar() {
		// TODO Auto-generated method stub
		LocalDate fechaInicio = getFechaIngreso();
		LocalDate fechaVigente = LocalDate.now();
		Period periodo = Period.between(fechaInicio, fechaVigente);
		int diferencia = (periodo.getMonths() + (periodo.getYears() * 12));

		System.out.println("Comparación entre años: " + periodo.getYears());
		System.out.println("Comparación entre meses: " + (periodo.getMonths() + (periodo.getYears() * 12)));

		if (diferencia > 30 && this.nivel > 1) {
			this.salario += getBono() * 2;
			System.out.println("El salario es de : " + salario);
		} else if (diferencia > 30 || this.nivel > 1) {
			this.salario += getBono();
			System.out.println("El salario es de :  " + salario);

		}
	}
}
