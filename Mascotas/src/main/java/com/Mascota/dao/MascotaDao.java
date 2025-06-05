package com.Mascota.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mascota.dominio.Mascota;

@Repository
public interface MascotaDao extends JpaRepository<Mascota, Integer>{

}
