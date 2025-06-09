package com.AtmSimulatorApplication.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Denominacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private Integer cantidad;
    private BigDecimal valor;

    public void reducirCantidad(int cantidadAReducir) {
        if (cantidadAReducir > this.cantidad) {
            throw new IllegalArgumentException("Cantidad a reducir excede la disponible.");
        }
        this.cantidad -= cantidadAReducir;
    }

    public Denominacion() {
    }

    public Denominacion(Long id, String tipo, Integer cantidad, BigDecimal valor) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
