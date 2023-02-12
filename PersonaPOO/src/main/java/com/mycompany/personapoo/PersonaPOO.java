/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.personapoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class PersonaPOO {
    
    public static void main(String[] args) {
        Persona objPersona = new Persona();
       

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        int edad = Integer.parseInt( JOptionPane.showInputDialog("Introduce tu edad"));
        double peso =  Double.parseDouble(JOptionPane.showInputDialog("Introduce tu peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura"));
        
        objPersona.setNombre(nombre);
        objPersona.setEdad(edad);
        objPersona.setPeso(peso);
        objPersona.setAltura(altura);
        
        JOptionPane.showMessageDialog(null, objPersona.datos() + "\n" 
                + objPersona.calcularIMC()  + "\n" +  mayorDeEdad(objPersona)); 
    }//main
    
     public static String mayorDeEdad(Persona p){
        if (p.esMayorDeEdad()) {
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }
}//principal
