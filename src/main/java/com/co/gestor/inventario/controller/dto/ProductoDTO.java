package com.co.gestor.inventario.controller.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProductoDTO {
    int id;
    String nombre;
    String descripcion;
    double precio;
    int cantidadEnStock;
    String categoria;


}
