package com.Lista.servicios;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.Lista.entidad.Nombres;

public interface Metodos {

	public List<Nombres> listar();
	
	void guardar() throws IOException;
	
	public Nombres buscar(Nombres nombres);
	
	public void guardarNombre(Nombres nombres);
	
	Map<String, Object> ScoreNombres(int id);
	
	Map<String, Object> ScoreNombres(int id, int index);
	
	Integer nombresScore(int id);
	
	List<Map<String, Object>> GeneralScore();
}
