package com.celulares.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.celulares.dominio.Pedido;

@Repository
public interface PedidosDao extends CrudRepository<Pedido, Integer>{

}
