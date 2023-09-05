package com.co.gestor.inventario.controller;
import com.co.gestor.inventario.controller.dto.ProductoDTO;
import com.co.gestor.inventario.controller.dto.RespuestaDTO;
import com.co.gestor.inventario.logica.ProductoLogica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class ProductoController {

@Autowired
    private ProductoLogica productoLogica;

    public ProductoController(ProductoLogica productoLogica) {
        this.productoLogica = productoLogica;
    }

    @PostMapping("/productos/agregar")
    public RespuestaDTO guardarProducto (@RequestBody ProductoDTO productoDTO){
try {
productoLogica.guardarProducto(productoDTO);
return new RespuestaDTO("Producto guardado");

}catch ( IllegalArgumentException e){return new RespuestaDTO(" no se pudo guardar " + e.getMessage() );
}

    }

}

