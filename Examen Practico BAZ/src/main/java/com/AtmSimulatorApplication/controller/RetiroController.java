package com.AtmSimulatorApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AtmSimulatorApplication.dto.Operacion;
import com.AtmSimulatorApplication.model.Retiro;
import com.AtmSimulatorApplication.service.RetiroService;

@RestController
@RequestMapping("/api/retiro")
public class RetiroController {

    @Autowired
    private RetiroService retiroService;

    @GetMapping()
    public ResponseEntity<List<Retiro>> obtenerListaRetiros() {
        List<Retiro> retiros = retiroService.obtenerTodosLosRetiros();
        return ResponseEntity.ok(retiros);
    }

    @GetMapping("/{usuarioId}")
    public ResponseEntity<List<Retiro>> obtenerRetirosPorUsuario(@PathVariable Long usuarioId) {
        List<Retiro> retiros = retiroService.obtenerRetirosPorUsuario(usuarioId);
        return ResponseEntity.ok(retiros);
    }

    @PostMapping("/operacion")
    public ResponseEntity<Retiro> realizarRetiro(@RequestBody Operacion operacion) {
        Retiro retiro = retiroService.realizarRetiro(operacion.getNombreUsuario(), operacion.getMontoRetirado());
        return ResponseEntity.ok(retiro);
    }

}
