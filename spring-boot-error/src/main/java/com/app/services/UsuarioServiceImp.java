package com.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.domain.Usuario;

@Service
public class UsuarioServiceImp implements UsuarioService {

	private List<Usuario> lista;
	
	
	
	public UsuarioServiceImp() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Andrés", "García"));
		this.lista.add(new Usuario(2, "Lucy", "Bravo"));
		this.lista.add(new Usuario(3, "Pato", "González"));
		this.lista.add(new Usuario(4, "Paco", "Rodríguez"));		
		this.lista.add(new Usuario(5, "Juan", "Gómez"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	
	/*al utilizar equals para comparar se usa de forma correcta con Integer equals (referencia) 
	 * y no siempre con int (tipo primitivo) ==
	 *  si la lista no supera los 128 elementos se puede usar ==
	 * 
	 * */
	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario u : listar()) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}
}
