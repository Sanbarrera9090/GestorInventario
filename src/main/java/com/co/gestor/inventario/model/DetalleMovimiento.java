package com.co.gestor.inventario.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class DetalleMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MovimientoInventario movimiento;
    @ManyToOne
    private Producto producto;
    private int cantidad;


    public DetalleMovimiento() {
    }


    public DetalleMovimiento(MovimientoInventario movimiento, Producto producto, int cantidad) {
        this.movimiento = movimiento;
        this.producto = producto;
        this.cantidad = cantidad;
    }



}
