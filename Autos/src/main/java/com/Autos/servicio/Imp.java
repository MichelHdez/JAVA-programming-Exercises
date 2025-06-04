package com.Autos.servicio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Autos.dao.AutosDao;
import com.Autos.dominio.Autos;

@Service
public class Imp implements Metodos {

	@Autowired
	AutosDao dao;

	@Override
	public void guardar(Autos a) {
		List<Autos> lista = new ArrayList<Autos>();
		lista = (List<Autos>) dao.findAll();
		if (lista.isEmpty()) {
			dao.save(a);
		} else {
			for (Autos c : lista) {
				if (c.getModelo().equals(a.getModelo()) || (c.getId() == a.getId())) {
					System.out.println("Ya existe una auto con ese modelo");
					return;
				}
			}
			dao.save(a);
		}
	}

	@Override
	public void editar(Autos a) {
		dao.save(a);

	}

	@Override
	public void eliminar(Autos a) {
		dao.delete(a);

	}

	@Override
	public Autos buscar(Autos a) {
		return dao.findById(a.getId()).orElse(null);
	}

	@Override
	public List<Autos> listar() {
		List<Autos> listaA = (List<Autos>) dao.findAll();
		return listaA;
	}

	@Override
	public Autos buscarXNombre(Autos a) {
		Autos auto = null;

		for (Autos au : dao.findAll()) {
			if (au.getMarca().equals(a.getMarca())) {
				auto = au;
			}
		}

		return auto;
	}

	@Override
	public List<Autos> buscarXAtributo(Autos a) {
		List<Autos> ListaMarca = new ArrayList<>();

		for (Autos au : dao.findAll()) {

			if (au.getColor().equals(a.getColor())) {
				ListaMarca.add(au);
			}
			if (au.getMarca().equals(a.getMarca())) {
				ListaMarca.add(au);
			}
		}
		return ListaMarca;
	}

	@Override
	public Autos elimiXNombre(Autos a) {
		Autos auto = null;

		for (Autos au : dao.findAll()) {

			if (au.getModelo() == (a.getModelo())) {
				dao.delete(auto);
			}
		}
		return auto;
	}

	@Override
	public List<Autos> listarxMarca(Autos a) {
		List<Autos> ListaMarca = new ArrayList<>();

		for (Autos au : dao.findAll()) {
			if (au.getMarca().equals(a.getMarca())) {
				ListaMarca.add(a);
			}
		}

		return ListaMarca;
	}

}
