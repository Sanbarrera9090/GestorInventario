package com.co.gestor.inventario.logica;
import com.co.gestor.inventario.controller.dto.ProductoDTO;
import com.co.gestor.inventario.model.Producto;
import org.springframework.stereotype.Service;
import com.co.gestor.inventario.model.ProductoRepository;

@Service
public class ProductoLogica {


    private ProductoRepository productoRepository;


    public ProductoLogica(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;

    }

    public void guardarProducto(ProductoDTO productoDTO){
        if ("papel".equals(productoDTO.getNombre())){
            throw new IllegalArgumentException("Esto no es una papeleria");
    }

        Producto productoBD = new Producto();
        productoBD.setId(productoDTO.getId());
        productoBD.setNombre(productoDTO.getNombre());
        productoBD.setCategoria(productoDTO.getCategoria());
        productoBD.setCantidadEnStock(productoDTO.getCantidadEnStock());
        productoBD.setDescripcion(productoDTO.getDescripcion());
        productoBD.setPrecio(productoDTO.getPrecio());
       productoRepository.save(productoBD);




}}
