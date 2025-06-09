package com.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

	
}
