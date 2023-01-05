/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Mike
 */
public class Bulbasaur  extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y este mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y este mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y este mi ataque mordisco");
    }

    @Override
    public void atacarParalizar() {
       System.out.println("Soy Bulbasaur y este mi ataque paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y este mi ataque dranaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Soy Bulbasaur y este mi ataque hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Soy Bulbasaur y este mi ataque latigo cepa");
    }
    
}
