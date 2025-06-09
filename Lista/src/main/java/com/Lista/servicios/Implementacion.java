package com.Lista.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Lista.dao.ListaDao;
import com.Lista.entidad.Nombres;

@Service
public class Implementacion implements Metodos{

	@Autowired
	ListaDao dao;
	
	String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	@Override
	public void guardar() throws IOException{ 
        File n = new File("D:\\Documentos\\Recursos Web\\Java\\Enucom\\nombres.txt");
 		@SuppressWarnings("resource")
		BufferedReader lista = new BufferedReader(new FileReader(n));
 		String nombres;
 		
 		while((nombres = lista.readLine()) != null) {
 			nombres =  nombres.replace("\"", "");
 			nombres = nombres.replace(",", " ");
 			
 		String[] e = nombres.split(" ");
 			
 		List<String> listaNombres = new ArrayList<>();
 		
 		for (int i = 0; i < e.length; i++) {
			listaNombres.add(e[i]);
		}
 		int ind = 1;
		for (String nombreLista : listaNombres) {
			Nombres nombre=  new Nombres(ind++, nombreLista);
			dao.save(nombre);
//          System.out.println(nombre);
		}
     }
}

	@Override
	public List<Nombres> listar() {
		return (List<Nombres>) dao.findAll();
	}

	@Override
	public void guardarNombre(Nombres nombres) {
		if (nombres.getNombres().equals(nombres.getNombres())) {
			System.out.println("Se guardó exitosamente en la BD");
		} else {
			System.out.println("Ese nombre ya existe en la BD");
		}
		dao.save(nombres);
	}

	public Optional<Nombres> buscarXId(int id) {
		return dao.findById(id);
	}

	
	public List<Nombres> findAllOrderByNombresAsc() {
		return dao.findAllOrderByNombresAsc();
	}
	
	public Integer sumaIndex(String nombres) {
		Integer suma = 0;
		for (int i = 0; i < nombres.length(); i++) {
			suma = (abecedario.indexOf(nombres.charAt(i))+1) + suma;
		}
		return suma;
	}
	
	public Integer nombresScore(int id) {
		Optional<Nombres> n = dao.findById(id);
		if (n.isPresent()) {
			Nombres nombres = n.get();
			return sumaIndex(nombres.getNombres());
		}
		return 0;
	}

	@Override
	public Map<String, Object> ScoreNombres(int id) {
		Optional<Nombres> n = dao.findById(id);
		Map<String, Object> nombresInf = new HashMap<>();
		if (n.isPresent()) {
			Nombres nombres = n.get();
			int index = getIndex(nombres);
			nombresInf.put("user", nombres.getNombres());
			nombresInf.put("Suma del alfabeto", nombresScore(id));
			nombresInf.put("score", (nombresScore(id) * index));
			nombresInf.put("id", nombres.getId());
		}
		return nombresInf; 
	}
	
	@Override
	public Map<String, Object> ScoreNombres(int id, int index) {
		Optional<Nombres> n = dao.findById(id);
		Map<String, Object> nombresInf = new HashMap<>();
		if (n.isPresent()) {
			Nombres nombres = n.get();
			nombresInf.put("user", nombres.getNombres());
			nombresInf.put("Suma del alfabeto", nombresScore(id));
			nombresInf.put("score", (nombresScore(id) * index));
			nombresInf.put("id", nombres.getId());
		}
		return nombresInf;
	}
	
	public Integer getIndex(Nombres nombres) {
		List<Nombres> nombreList = dao.findAllOrderByNombresAsc();
		for (int i = 0; i < nombreList.size(); i++) {
			if (nombreList.get(i) == nombres) {
				return i + 1;
			}
		}
		return 0;
	}

	public List<Map<String, Object>> GeneralScore() {
		List<Nombres> nombreList = dao.findAllOrderByNombresAsc();
		List<Map<String, Object>> Usuarios = new ArrayList<>();
		
		for (int i = 0; i < nombreList.size(); i++) {
			if (nombreList.get(i).getNombres() != null) {
				Map<String, Object> UsuariosM = ScoreNombres(nombreList.get(i).getId(), (i+1));
				Usuarios.add(UsuariosM);
			}
		}
		return Usuarios;
	}

	@Override
	public Nombres buscar(Nombres nombres) {
		nombres = dao.findById(nombres.getId()).orElse(null);
		return nombres;
		}
}

