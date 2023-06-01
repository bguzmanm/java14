package cl.awakelab.remates.model.dto;

public class Calificacion {
  private int estrellas;
  private Usuario usuario;

  public Calificacion() {
  }

  public Calificacion(int estrellas, Usuario usuario) {
    this.estrellas = estrellas;
    this.usuario = usuario;
  }

  public int getEstrellas() {
    return estrellas;
  }

  public void setEstrellas(int estrellas) {
    this.estrellas = estrellas;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
