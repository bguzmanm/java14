package cl.awakelab.remates.model.service;

import cl.awakelab.remates.model.dto.Postura;
import cl.awakelab.remates.model.dto.Producto;
import cl.awakelab.remates.model.dto.Remate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RemateService {

    public List<Remate> remates = new ArrayList<Remate>();
    ProductoService productoService = new ProductoService();

    public RemateService(){
      List<Producto> productos = productoService.getProductos();

      remates.add(new Remate("Corolla flamante, bien cuidado, sin choques, papeles al día",
              LocalDate.now(), productos.get(1), productos.get(1).getPrecio()));
      remates.add(new Remate("Macbook Pro 1 mes de uso, batería al 100%, sin rayones ni bloqueos",
              LocalDate.now(), productos.get(2), productos.get(2).getPrecio()));
    }

    public List<Remate> getRemates(){
      return remates;
    }
    public void addPostura(Postura postura){
      // comparamos con el precio base
      if (postura.getRemate().getPrecioBase() < postura.getValor()){
        int pos = remates.indexOf(postura.getRemate());

        Remate elRemate = remates.get(pos);

        if (postura.getRemate().getPosturas() == null){
          elRemate.setPosturas(new ArrayList<Postura>());
          elRemate.getPosturas().add(postura);
          System.out.println("No habían otras posturas, en hora buena!");
        } else {
          Postura ultimaPostura = elRemate.getPosturas().get(elRemate.getPosturas().size()-1);
          if (ultimaPostura.getValor() < postura.getValor()){
            elRemate.getPosturas().add(postura);
            System.out.println("Superaste la última postura, wuena choro");
          } else {
            System.out.println("quedaste corto wuacho...");
          }
        }
      }
    }

}
