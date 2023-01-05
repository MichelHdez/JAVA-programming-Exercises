/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Mike
 */
public class Charmander  extends Pokemon implements IFuego{

    public Charmander() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y este mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Soy Charmander y este mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y este mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y este mi ataque puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y este mi ataque ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y este mi ataque lanza llamas");
    }
    
}
