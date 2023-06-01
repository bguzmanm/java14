package cl.awakelab.remates.view;

import cl.awakelab.remates.model.dto.Postura;
import cl.awakelab.remates.model.dto.Remate;
import cl.awakelab.remates.model.dto.Usuario;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class RemateView {
  public Postura mostrarRemates(List<Remate> remates){
    int i = 1;
    for (Remate remate: remates) {
      System.out.println(i + ". " + remate.getNombre() + " $" + remate.getPrecioBase());
      i++;
    }
    System.out.println("Selecciona el remate al que harás postura. 0 para salir.");
    Scanner entrada = new Scanner(System.in);
    int op = entrada.nextInt();

    if (op == 0){
      return null;
    }

    System.out.println("Ingresa tu postura: ");
    double valorPostura = entrada.nextDouble();

    Postura postura = new Postura(new Usuario(),remates.get(op-1), valorPostura, LocalDate.now());

    return postura;

  }
}
