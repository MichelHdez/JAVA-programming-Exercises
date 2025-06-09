package com.mx.CrudComputadoras;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mx.CrudComputadoras.dominio.Computadoras;
import com.mx.CrudComputadoras.servicio.Implementacion;

@RunWith(SpringRunner.class) // estereotipo que le indica a la clase que va arrancar para realizar puebas
@SpringBootTest
class CrudComputadorasApplicationTests {
	
	@Autowired
	Implementacion imp;

	@Test
	public void guardar() {
		
		Computadoras compu = new Computadoras();
		
		// guardar
		compu.setId(3);
		compu.setMarca("Pueba");
		compu.setModelo("Pueba");
		compu.setColor("Pueba");
		compu.setPeso("Pueba");
		compu.setPrecio(2222);
		compu.setSo("Pueba");
		
		imp.guardar(compu);
		
		// Crud
		
	}	

}
