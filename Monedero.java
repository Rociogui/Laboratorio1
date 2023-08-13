/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1;

/**
 *
 * @author Rocio Lopez
 */
public class Monedero {
    private double cantidad;

    public Monedero(double cantidadInicial) {
        this.cantidad = cantidadInicial;
    }

    public void meterDinero(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("Se ha añadido $" + cantidad + " al monedero.");
        } else {
            System.out.println("La cantidad a añadir debe ser mayor que cero.");
        }
    }

    public void sacarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " del monedero.");
        } else {
            System.out.println("Cantidad inválida o insuficiente en el monedero.");
        }
    }

    public double consultarDisponible() {
        return cantidad;
    }

    public static void main(String[] args) {
        Monedero miMonedero = new Monedero(100);
        System.out.println("Dinero disponible: $" + miMonedero.consultarDisponible());

        miMonedero.meterDinero(50);
        System.out.println("Dinero disponible: $" + miMonedero.consultarDisponible());

        miMonedero.sacarDinero(30);
        System.out.println("Dinero disponible: $" + miMonedero.consultarDisponible());
    }
}
