/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Mike
 */
public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y este mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Pikachu y este mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y este mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y este mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y este mi ataque puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy Pikachu y este mi ataque rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Soy Pikachu y este mi ataque rayo carga");
    }
    
}
