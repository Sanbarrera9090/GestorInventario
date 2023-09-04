package com.co.gestor.inventario.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class MovimientoInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String tipo;
    private Date fecha;
    private Producto producto;
    private int cantidad;


    public MovimientoInventario() {
    }

    public MovimientoInventario(String tipo, Date fecha, Producto producto, int cantidad) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
    }


    // Otros métodos o lógica relacionados con los movimientos de inventario
}
