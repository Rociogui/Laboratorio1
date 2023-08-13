/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1;

/**
 *
 * @author Rocio Lopez
 */
public class Taller {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2023, "Blanco", 25000);
        Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", 2022, "Gris", 22000);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Focus", 2023, "Azul", 23000);
        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", "Cruze", 2022, "Rojo", 24000);
        Vehiculo vehiculo5 = new Vehiculo("Nissan", "Sentra", 2023, "Negro", 26000);
        
        // Prueba de funcionalidad de los vehículos
        System.out.println(vehiculo1.getMarca() + " " + vehiculo1.getModelo() + " - Precio: $" + vehiculo1.getPrecio());
        System.out.println(vehiculo2.getMarca() + " " + vehiculo2.getModelo() + " - Precio: $" + vehiculo2.getPrecio());
        System.out.println(vehiculo3.getMarca() + " " + vehiculo3.getModelo() + " - Precio: $" + vehiculo3.getPrecio());
        System.out.println(vehiculo4.getMarca() + " " + vehiculo4.getModelo() + " - Precio: $" + vehiculo4.getPrecio());
        System.out.println(vehiculo5.getMarca() + " " + vehiculo5.getModelo() + " - Precio: $" + vehiculo5.getPrecio());
    }
}
