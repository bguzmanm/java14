package cl.awakelab.remates.model.service;

import cl.awakelab.remates.model.dto.Producto;
import cl.awakelab.remates.model.dto.Tecnologia;
import cl.awakelab.remates.model.dto.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class ProductoService {
  List<Producto> lista = new ArrayList<Producto>();

  public ProductoService(){
    lista.add(new Vehiculo("Bronco", 250d, "Ford", "Bronco GTD Full Power Shift", 2023));
    lista.add(new Vehiculo("Corolla", 25d, "Toyota", "Toyota Corolla SE", 2004));
    lista.add(new Tecnologia("Macbook Pro M2 Pro mid 2023", 26d, "Apple", "Macbook Pro", "laptop"));
  }

  public List<Producto> getProductos(){
    return lista;
  }

  public void addProducto(Producto p){
    lista.add(p);
  }


}
