/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sbf.domain.Usuario;

import jakarta.validation.Valid;

/**
 *
 * @author Mike
 */
@Controller
public class FormController {
    @GetMapping("/form")
    public String form(Model model){
    	Usuario usuario = new Usuario();
        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }
 
    // @Valid - para validar un usuario en este caso
    /*BindingResult result - interfaz y es propio de Spring, nos permite validar los objetos
    y SIEMPRE tiene que setar despues del objeto a validar, así como en el ejemplo*/
//   @PostMapping("/form")
//   public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {
	// Una forma de pasar los valores para el usuario
	//           @RequestParam String username,
	//           @RequestParam String password,
	//           @RequestParam String email){
	   
	   // Una forma de pasar los valores para el usuario
	   /*Usuario usuario = new Usuario();
	   usuario.setUsername(username);
	   usuario.setPassword(password);
	   usuario.setEmail(email);*/
       
//       model.addAttribute("titulo", "Resultado form");
//       
// Se crea una lista asociativa <String, String> con el primer valor de nombre campo y el mensaje de error
//       if (result.hasErrors()) {
//    	UNA FORMA DE VALIDAR LOS ERRORES CON MAP
//		Map<String, String> errores = new HashMap<>();
//		result.getFieldErrors().forEach(err ->{
//			errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
//		});
//		model.addAttribute("error", errores);
//		 se retorna a la vista en caso de algún error y el usuario pueda corregir
//		return "form";
//	}
//       
//       model.addAttribute("usuario", usuario);
//        return "resultado";
//    }
   
   @PostMapping("/form")
   public String procesar(@Valid Usuario usuario, BindingResult result, Model model) { 
       model.addAttribute("titulo", "Resultado form");
       if (result.hasErrors()) {
		return "form";
	}
       model.addAttribute("usuario", usuario);
        return "resultado";
    }
 
}
