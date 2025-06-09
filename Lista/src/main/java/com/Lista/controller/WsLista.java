package com.Lista.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lista.dao.ListaDao;
import com.Lista.entidad.Nombres;
import com.Lista.servicios.Implementacion;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class WsLista {
	
	@Autowired
	Implementacion imp;
	
	@Autowired
	ListaDao dao;

	// LISTA SIN ORDENAR	
	// http://localhost:9001/api/lista
	@GetMapping("lista")
	public List<Nombres> listar() {
		return imp.listar();
}
	
	// METODO PARA GUARDAR TXT EN BD	
	// http://localhost:9001/api/guardarBD
	@GetMapping("guardarBD")
	public void guardar() throws IOException{
		imp.guardar();
	}
	
	// http://localhost:9001/api/guardar
	@PostMapping("guardar")
    public ResponseEntity<Object> guardarNombre(@RequestBody Nombres nombres) {
        imp.guardarNombre(nombres);
        return new ResponseEntity<Object>("Guardado", HttpStatus.OK);
	}
	
	// METODO QUE DEVUELVE ID Y NOMBRE		
	// http:localhost:9001/api/id
	 @GetMapping("/{id}")
	    public ResponseEntity<Object> buscarPorId(@PathVariable int id) {
	        Optional<Nombres> usuarioOptional = imp.buscarXId(id);
	        
	        if (usuarioOptional.isPresent()) {
	            Nombres usuario = usuarioOptional.get();
	            Nombres usuarioN = new Nombres(usuario.getId(), usuario.getNombres());
	            return ResponseEntity.ok(usuarioN);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	 
	// LISTA ORDENADA ALFABETICAMENTE SIN SCORE
	// http:localhost:9001/api/nombres
	 @GetMapping("nombres")
	    public List<Nombres> findAllOrderByNombresAsc() {
	        return imp.findAllOrderByNombresAsc();
	    }
	
	// USUARIO CON SCORE, ALFABETO, NOMBRE Y ID	 
	// http:localhost:9001/api/score/id
	 @GetMapping("score/{id}")
	 public Map<String, Object> nombresScore(@PathVariable int id){
		 Optional<Nombres> nombres = dao.findById(id);
		 return imp.ScoreNombres(id);
	 }
	 	 
	// LISTA ORDENADA ALFABETICAMENTE CON SCORE
	// http:localhost:9001/api/score
	 @GetMapping("score")
	 public ResponseEntity<List<Map<String, Object>>> GeneralScore(){
		 return ResponseEntity.ok(imp.GeneralScore());
	 }
	 
	// http://localhost:9001/api/buscar
	@PostMapping(path = "buscar")
	public Nombres buscar(@RequestBody Nombres nombres) {
		nombres = imp.buscar(nombres);
		return nombres;
	}
}
