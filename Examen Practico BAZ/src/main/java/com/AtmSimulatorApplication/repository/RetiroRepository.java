package com.AtmSimulatorApplication.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.AtmSimulatorApplication.model.Retiro;

public interface RetiroRepository extends JpaRepository<Retiro, Long>{

    List<Retiro> findByUsuarioId(Long usuarioId);

    @Query("SELECT SUM(r.montoRetirado) FROM Retiro r WHERE r.usuario.id = :usuarioId")
    BigDecimal getTotalRetiradoByUsuarioId(@Param("usuarioId") Long usuarioId);
 
}
