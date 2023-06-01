package cl.awakelab.remates.model.dto;

public class Tecnologia extends Producto {
  private String marca;
  private String modelo;
  private String tipo;

  public Tecnologia() {
  }

  public Tecnologia(String nombre, Double precio, String marca, String modelo, String tipo) {
    super(nombre, precio);
    this.marca = marca;
    this.modelo = modelo;
    this.tipo = tipo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "Tecnologia {" +
            "marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", tipo='" + tipo + '\'' +
            '}';
  }
}
