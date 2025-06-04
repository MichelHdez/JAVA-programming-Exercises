package com.mx.CrudCarros.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudCarros.dao.CarrosDao;
import com.mx.CrudCarros.dominio.Carros;
@Service
public class CarrosServImp implements Metodos {
	@Autowired
	
	CarrosDao carrosDao;
	
    @Transactional
	@Override
	public void guardar(Carros carro) {
		// TODO Auto-generated method stub
		carrosDao.save(carro);
	}
    @Transactional
	@Override
	public void editar(Carros carro) {
		// TODO Auto-generated method stub
    	carrosDao.save(carro);
	}
    @Transactional
	@Override
	public void eliminar(Carros carro) {
		// TODO Auto-generated method stub
    	carrosDao.delete(carro);
	}
    @Transactional(readOnly = false)
	@Override
	public Carros buscar(Carros carro) {
		// TODO Auto-generated method stub
		return carrosDao.findById(carro.getId()).orElse(null);
	}

	@Override
	public List<Carros> listar() {
		// TODO Auto-generated method stub
		List<Carros> listaCar=(List<Carros>) carrosDao.findAll();
		return listaCar;
	}

	@Override
	public List<Carros> buscarXNombre(Carros carro) {
		// TODO Auto-generated method stub
		List<Carros> ListaNueva = new ArrayList<>();
		
		for(Carros cr : carrosDao.findAll()) {
			if (cr.getNombre().equals(carro.getNombre())) {
				ListaNueva.add(cr);
			}
		}
		
		return ListaNueva;
	}

	@Override
	public Carros buscarXAtributo(Carros carro) {
		// TODO Auto-generated method stub
		Carros carr = null;
		
		for ( Carros cr : carrosDao.findAll() ) {
			
			if(cr.getId()== (carro.getId())) {
				carr = cr;
			}
			if(cr.getNombre().equals(carro.getNombre())) {
				carr = cr;
			}
			if (cr.getColor().equals(carro.getColor())) {
				carr = cr;
			}
			
		}
	
		
		return carr;
	}

	@Override
	public Carros elimiXNombre(Carros carro) {
		// TODO Auto-generated method stub
		Carros dl = null;
		
		for(Carros cs : carrosDao.findAll()) {
			
			if(cs.getNombre() == (carro.getNombre())) {
				carrosDao.delete(carro);
			}
			
			
		}
		
		return dl;
	}

	
}
