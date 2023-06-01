package cl.awakelab.remates.model.dto;


import java.util.List;

public abstract class Producto {
  private String nombre;
  private Double precio;
  private List<Comentario> comentarios;
  private List<Calificacion> calificaciones;

  public Producto() {

  }

  public Producto(String nombre, Double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public Producto(String nombre, Double precio, List<Comentario> comentarios, List<Calificacion> calificaciones) {
    this.nombre = nombre;
    this.precio = precio;
    this.comentarios = comentarios;
    this.calificaciones = calificaciones;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public List<Comentario> getComentarios() {
    return comentarios;
  }

  public void setComentarios(List<Comentario> comentarios) {
    this.comentarios = comentarios;
  }

  public List<Calificacion> getCalificaciones() {
    return calificaciones;
  }

  public void setCalificaciones(List<Calificacion> calificaciones) {
    this.calificaciones = calificaciones;
  }
}
