package cl.awakelab.remates.view;

import cl.awakelab.remates.controller.Controlador;
import cl.awakelab.remates.model.dto.Producto;

import java.util.Scanner;

public class Menu {
  Controlador controlador = new Controlador();

  public void orquestaMenu() {
    int op;

    do {
      muestraMenu();
      System.out.println("Selecciona la opción del menú: ");
      op = opcionDeMenu();
      switch (op){
        case 1: {
          controlador.mostrarRemates();
          break;
        }
        case 2: {
          controlador.mostrarProductos();
          break;
        }
        case 3: {
          controlador.agregarProducto();
          break;
        }
        case 0: {
          System.out.println("Sabemos donde vives, no nos acuses... ");
          break;
        }
        default: {
          System.out.println("mete bien los deditos, o ¿ya te los cortamos?");
        }
      }
    } while (op != 0);

  }

  public void muestraMenu(){
    System.out.println("===========================");
    System.out.println(" MENÚ PRINCIPAL");
    System.out.println("---------------------------");
    System.out.println("1. Listar Remates Vigentes");
    System.out.println("2. Listar Productos");
    System.out.println("3. Agregar Producto");
    System.out.println("0. Salir");
    System.out.println("---------------------------");
  }

  public int opcionDeMenu(){
    Scanner entrada = new Scanner(System.in);
    return entrada.nextInt();
  }

}
