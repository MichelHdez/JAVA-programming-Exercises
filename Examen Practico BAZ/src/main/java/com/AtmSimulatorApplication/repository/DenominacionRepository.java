package com.AtmSimulatorApplication.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.AtmSimulatorApplication.model.Denominacion;

public interface DenominacionRepository extends JpaRepository<Denominacion, Long>{

    @Query("SELECT d FROM Denominacion d WHERE d.valor <= :valor ORDER BY d.valor DESC")
    List<Denominacion> findDenominacionesParaRetiro(@Param("valor") BigDecimal valor);

}
