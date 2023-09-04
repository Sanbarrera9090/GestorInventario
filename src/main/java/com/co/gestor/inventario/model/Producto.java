package com.co.gestor.inventario.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;
    private String categoria;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, double precio, int cantidadEnStock, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.categoria = categoria;
    }


}
