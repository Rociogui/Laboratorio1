/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1;

/**
 *
 * @author Rocio Lopez
 */
public class PruebaPersonaje {
      public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Héroe", 180, 75, "Blanco");
        Personaje personaje2 = new Personaje("Villano", 185, 80, "Moreno");
        Personaje personaje3 = new Personaje("Aliado", 170, 70, "Negro");
        Personaje personaje4 = new Personaje("Enemigo", 175, 85, "Blanco");

        // Prueba por cada uno
        personaje1.atacar();
        personaje2.correr();
        personaje3.saltar();
        personaje4.esquivar();

        personaje2.morir();
    }
}