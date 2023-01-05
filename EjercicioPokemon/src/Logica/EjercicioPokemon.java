/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Mike
 */
public class EjercicioPokemon {
    public static void main(String [ ] args){
       Squirtle squirtle = new Squirtle();
       Charmander charmander = new Charmander();
       Bulbasaur bulba = new Bulbasaur();
       Pikachu pika = new Pikachu();
       
       squirtle.atacarAraniazo();
       squirtle.atacarHidrobomba();
       charmander.atacarAraniazo();
       charmander.atacarLanzallamas();
       bulba.atacarAraniazo();
       bulba.atacarDrenaje();
       pika.atacarAraniazo();
       pika.atacarImpactrueno();
    }
}
