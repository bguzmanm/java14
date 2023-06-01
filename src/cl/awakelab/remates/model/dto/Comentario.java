package cl.awakelab.remates.model.dto;

public class Comentario {
  private String comentario;
  private Usuario usuario;

  public Comentario() {
  }

  public Comentario(String comentario, Usuario usuario) {
    this.comentario = comentario;
    this.usuario = usuario;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }
}
