package cl.awakelab.remates.test;


import cl.awakelab.remates.model.dto.Producto;
import cl.awakelab.remates.model.dto.Vehiculo;
import cl.awakelab.remates.model.service.ProductoService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProductoServiceTest {

  @Test
  void getProductos() {
    ProductoService productoService = new ProductoService();
    List<Producto> lista = productoService.getProductos();

    assertEquals(3, lista.size());
  }

  @Test
  void addProducto() {
    ProductoService productoService = new ProductoService();
    Vehiculo v = new Vehiculo("BMW JJ", 5000d, "BMW", "JJ", 2023);
    productoService.addProducto(v);
    assertEquals(4, productoService.getProductos().size());
  }
}