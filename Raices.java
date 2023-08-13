/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1;

/**
 *
 * @author Rocio Lopez
 */
public class Raices {
    private final double a;
    private final double b;
    private final double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else {
            System.out.println("No existen raíces reales.");
        }
    }

    public void obtenerRaiz() {
        double discriminante = getDiscriminante();
        if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Raíz única: " + raiz);
        } else {
            System.out.println("No existe una única raíz real.");
        }
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existen raíces reales.");
        }
    }

    public static void main(String[] args) {
        Raices ecuacion1 = new Raices(1, -3, 2);  // x^2 - 3x + 2
        Raices ecuacion2 = new Raices(2, 4, 2);   // 2x^2 + 4x + 2
        Raices ecuacion3 = new Raices(1, 2, 5);   // x^2 + 2x + 5

        System.out.println("Ecuación 1:");
        ecuacion1.calcular();

        System.out.println("\nEcuación 2:");
        ecuacion2.calcular();

        System.out.println("\nEcuación 3:");
        ecuacion3.calcular();
    }
}
