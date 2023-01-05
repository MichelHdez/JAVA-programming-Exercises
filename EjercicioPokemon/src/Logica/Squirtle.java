/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Mike
 */
public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
       System.out.println("Soy Squirtle y este mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("Soy Squirtle y este mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y este mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y este mi ataque hidro bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y este mi ataque pistola de agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y este mi ataque burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Soy Squirtle y este mi ataque hidro pulso");
    }
    
}
