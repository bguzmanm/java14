package cl.awakelab.remates.model.dto;

import java.time.LocalDate;

public class Postura {
  private Usuario usuario;
  private Remate remate;
  private double valor;
  private LocalDate fecha;

  public Postura() {
  }

  public Postura(Usuario usuario, Remate remate, double valor, LocalDate fecha) {
    this.usuario = usuario;
    this.remate = remate;
    this.valor = valor;
    this.fecha = fecha;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  public Remate getRemate() {
    return remate;
  }

  public void setRemate(Remate remate) {
    this.remate = remate;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }
}
