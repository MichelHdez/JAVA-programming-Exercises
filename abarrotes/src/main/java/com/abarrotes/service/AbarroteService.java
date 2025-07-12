package com.abarrotes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abarrotes.entity.Abarrote;

@Service
public interface AbarroteService {

	public void gurdar(Abarrote abarrote);
	public void editar(Abarrote abarrote);
	public void eliminar(Abarrote abarrote);
	
	public Abarrote buscar(Abarrote abarrote);
	public List<Abarrote> listar();
}
