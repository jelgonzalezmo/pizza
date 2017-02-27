/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Estudiante
 */
public class Pizza {
    private String ingredientes;
    private int tamano;
    private double precio;

    public Pizza(String ingredientes, int tamano, double precio) {
        this.ingredientes = ingredientes;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public int getTamaño() {
        return tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTamaño(int tamano) {
        this.tamano = tamano;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" + "ingredientes=" + ingredientes + ", tamano=" + tamano + ", precio=" + precio + '}';
    }
            
    
}
