package cl.awakelab.remates.controller;

import cl.awakelab.remates.model.dto.Postura;
import cl.awakelab.remates.model.dto.Producto;
import cl.awakelab.remates.model.dto.Remate;
import cl.awakelab.remates.model.dto.Usuario;
import cl.awakelab.remates.model.service.ProductoService;
import cl.awakelab.remates.model.service.RemateService;
import cl.awakelab.remates.view.ProductoView;
import cl.awakelab.remates.view.RemateView;

import java.util.List;

public class Controlador {

  private ProductoService productoService = new ProductoService();
  private RemateService remateService = new RemateService();
  private ProductoView productoView = new ProductoView();
  private RemateView remateView = new RemateView();

  /**
   * tiene que llamar a alguien en Modelo, que le retorne los remates.
   * retornar esos remates a al vista.
   */
  public void mostrarRemates(){
    List<Remate> lista = remateService.getRemates();
    Postura postura = remateView.mostrarRemates(lista);
    if (postura == null){
      System.out.println("se te hizo hacer una postura... cobarde");
      return;
    }

    remateService.addPostura(postura);
  }

  /**
   * tiene que llamar a alguien en Modelo, que le retornará los productos
   * retornar estos productos a la vista.
   */
  public void mostrarProductos(){
    List<Producto> lista = productoService.getProductos();

    for (Producto producto : lista) {
      System.out.println(producto.getNombre() + " " + producto.getPrecio());
    }
  }

  public void agregarProducto(){
    Producto p = productoView.agregarProducto();
    productoService.addProducto(p);
  }

  public void hacerPostura(String remate, Usuario usuario){

  }
}
