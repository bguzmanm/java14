package cl.awakelab.remates.view;

import cl.awakelab.remates.model.dto.Producto;
import cl.awakelab.remates.model.dto.Tecnologia;
import cl.awakelab.remates.model.dto.Vehiculo;

import java.util.Scanner;

public class ProductoView {

  public Producto agregarProducto(){

    System.out.println("Elige el tipo de Producto:");
    System.out.println("1. Vehiculo");
    System.out.println("2. Tecnológico");
    Scanner entrada = new Scanner(System.in);
    int op = entrada.nextInt();

    Producto p;

    switch (op){
      case 1:
        p = new Vehiculo();
        p = agregarVehiculo(p);
        break;
      case 2:
        p = new Tecnologia();
        p = agregarTecnologia(p);
        break;
      default:
        System.out.println("Eligiste mal...");
        return null;
    }
    return p;
  }
  private Vehiculo agregarVehiculo(Producto producto){

    Vehiculo v = (Vehiculo) producto;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingresa el nombre:");
    v.setNombre(entrada.nextLine());

    System.out.println("Ingresa el precio:");
    v.setPrecio(entrada.nextDouble());

    entrada.nextLine();
    System.out.println("Ingresa el marca:");
    v.setMarca(entrada.nextLine());

    System.out.println("Ingresa el modelo:");
    v.setModelo(entrada.nextLine());

    System.out.println("Ingresa el año:");
    v.setAno(entrada.nextInt());

    return v;
  }

  private Tecnologia agregarTecnologia(Producto producto){

    Tecnologia t = (Tecnologia) producto;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingresa el nombre:");
    t.setNombre(entrada.nextLine());

    System.out.println("Ingresa el precio:");
    t.setPrecio(entrada.nextDouble());
    entrada.nextLine();

    System.out.println("Ingresa el marca:");
    t.setMarca(entrada.nextLine());

    System.out.println("Ingresa el modelo:");
    t.setModelo(entrada.nextLine());

    System.out.println("Ingresa el tipo:");
    t.setTipo(entrada.nextLine());

    return t;
  }
}
