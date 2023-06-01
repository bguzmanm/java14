package cl.awakelab.remates.model.dto;

import java.time.LocalDate;
import java.util.List;

public class Remate {
  private String nombre;
  private LocalDate fecha;
  private Producto producto;
  private double precioBase;
  private List<Postura> posturas;

  public Remate() {
  }

  public Remate(String nombre, LocalDate fecha, Producto producto, double precioBase) {
    this.nombre = nombre;
    this.fecha = fecha;
    this.producto = producto;
    this.precioBase = precioBase;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public double getPrecioBase() {
    return precioBase;
  }

  public void setPrecioBase(double precioBase) {
    this.precioBase = precioBase;
  }

  public List<Postura> getPosturas() {
    return posturas;
  }

  public void setPosturas(List<Postura> posturas) {
    this.posturas = posturas;
  }
}
