package com.AtmSimulatorApplication.dto;

import java.math.BigDecimal;

public class Operacion {

    private String nombreUsuario;
    private BigDecimal montoRetirado;
    
    public BigDecimal getMontoRetirado() {
        return montoRetirado;
    }
    public void setMontoRetirado(BigDecimal montoRetirado) {
        this.montoRetirado = montoRetirado;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    

}
