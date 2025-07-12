package com.abarrotes.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.abarrotes.dao.AbarroteDao;
import com.abarrotes.entity.Abarrote;

@Service
public class AbarroteServiceImpl implements AbarroteService{

	private Logger logger = LoggerFactory.getLogger(AbarroteServiceImpl.class);
	
	private AbarroteDao dao;

	public AbarroteServiceImpl(AbarroteDao dao) {
		this.dao = dao;
	}

	@Override
	public void gurdar(Abarrote abarrote) {
		dao.save(abarrote);
	}

	@Override
	public void editar(Abarrote abarrote) {
		dao.save(abarrote);
	}

	@Override
	public void eliminar(Abarrote abarrote) {
		if(dao.findByNombreProducto(abarrote.getNombreProducto()) != null) {
			dao.delete(abarrote);
		}
	}

	
	@Override
	public Abarrote buscar(Abarrote abarrote) {
		Abarrote producto = null;
		if(dao.findByNombreProducto(abarrote.getNombreProducto()) != null) {
			producto = dao.findByNombreProducto(abarrote.getNombreProducto());
		}
		if(dao.findByMarca(abarrote.getMarca()) != null) {
			producto = dao.findByMarca(abarrote.getMarca());
		}
		logger.info("{}", producto);
		return producto;
	}

	@Override
	public List<Abarrote> listar() {
		return dao.findAll();
	}

}
