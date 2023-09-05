package com.co.gestor.inventario.controller;

import com.co.gestor.inventario.model.Producto;
import com.co.gestor.inventario.service.ProductServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @Autowired
    private ProductServive productServive;

    @PostMapping("/productos")
    public String saveProduct(@RequestBody Producto producto) throws ExecutionException, InterruptedException {
        return productServive.saveProduct(producto);
    }
}
