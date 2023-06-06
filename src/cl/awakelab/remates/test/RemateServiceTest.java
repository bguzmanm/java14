package cl.awakelab.remates.test;

import cl.awakelab.remates.model.dto.*;
import cl.awakelab.remates.model.service.ProductoService;
import cl.awakelab.remates.model.service.RemateService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RemateServiceTest {

  static Usuario usuario;
  static Vehiculo vehiculo;
  static Remate remate;

  @BeforeAll
  static void beforeAll(){
    usuario = new Usuario(1, "Usuario 1", "Chile", 5000d);
    vehiculo = new Vehiculo("BMW JJ", 5000d, "BMW", "JJ", 2023);
    remate = new Remate("El Remate", LocalDate.now(), vehiculo, 5000d);
  }

  @Test
  void getRemates() {
    RemateService remateService = new RemateService();
    assertEquals(2, remateService.getRemates().size());
  }

  @Test
  void addPostura() {
    //Usuario usuario, Remate remate, double valor, LocalDate fecha
    Postura postura = new Postura(usuario, remate, 2000d, LocalDate.now());

    RemateService remateService = new RemateService();
    remateService.addRemate(remate);
    remateService.addPostura(postura);
    assertNull(remate.getPosturas());

    postura.setValor(5500d);
    remateService.addPostura(postura);
    assertEquals(1, remate.getPosturas().size());

    Postura postura2 = new Postura(usuario, remate, 5100d, LocalDate.now());
    remateService.addPostura(postura2);
    assertEquals(1, remate.getPosturas().size());

    Postura postura3 = new Postura(usuario, remate, 6000d, LocalDate.now());
    remateService.addPostura(postura3);
    assertEquals(2, remate.getPosturas().size());
  }
}