import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Director extends Empleado {

	String departamento;
	int personal;

	public Director() {

	}

	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario, String departamento,
			int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}
	
	@Override
	public void incentivar() {
		// TODO Auto-generated method stub
		LocalDate fechaInicio = getFechaIngreso();
		LocalDate fechaVigente = LocalDate.now();
		Period periodo = Period.between(fechaInicio, fechaVigente);
		int diferencia = (periodo.getMonths() + (periodo.getYears() * 12));

		System.out.println("Comparación entre años: " + periodo.getYears());
		System.out.println("Comparación entre meses: " + (periodo.getMonths() + (periodo.getYears() * 12)));

		if (diferencia > 30 && this.personal > 20) {
			this.salario += getBono() * 2;
			System.out.println("El salario es de : " + salario);
		} else if (diferencia > 30 || this.personal > 20) {
			this.salario += getBono();
			System.out.println("El salario es de :  " + salario);

		}
	}
}
