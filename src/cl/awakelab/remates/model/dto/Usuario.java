package cl.awakelab.remates.model.dto;

public class Usuario {
  private int id;
  private String nombre;
  private String paisResidencia;
  private double credito;

  public Usuario() {
  }

  public Usuario(int id, String nombre, String paisResidencia, double credito) {
    this.id = id;
    this.nombre = nombre;
    this.paisResidencia = paisResidencia;
    this.credito = credito;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPaisResidencia() {
    return paisResidencia;
  }

  public void setPaisResidencia(String paisResidencia) {
    this.paisResidencia = paisResidencia;
  }

  public double getCredito() {
    return credito;
  }

  public void setCredito(double credito) {
    this.credito = credito;
  }
}
