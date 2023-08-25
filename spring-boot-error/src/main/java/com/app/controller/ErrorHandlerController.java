package com.app.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.errors.UsuarioNoEncontradoException;

// Captura los lanzamientos de excepciónm no a una ruta a diferencia de @Controller
@ControllerAdvice
public class ErrorHandlerController {
    @ExceptionHandler(ArithmeticException.class)
    public String aritmeticaError(ArithmeticException ex, Model model){
        model.addAttribute("error", "Error de aritmética");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        // return "error/aritmetica";
        return "error/generica";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String aritmeticaError(NumberFormatException ex, Model model){
        model.addAttribute("error", "Error: formato número inválido!!!");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        // return "error/numero";
        return "error/generica";
    }
    
    @ExceptionHandler(UsuarioNoEncontradoException.class)
    public String aritmeticaError(UsuarioNoEncontradoException ex, Model model){
        model.addAttribute("error", "Error: Usuario no encontrado!!!");
        model.addAttribute("message", ex.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        // return "error/numero";
        return "error/generica";
    }
}
