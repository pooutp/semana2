package utp.edu.pe.poo.pantalla;

import java.util.Scanner;

public class Pantalla {
    public double ingreso;
    Scanner scanner = new Scanner(System.in);
    
    public double Ingreso(){
        System.out.println("DEPOSITO");
        System.out.println("Ingrese el monto a depositar");
        ingreso = scanner.nextDouble();
        return ingreso;
    }
    
    public double Retiro(){
        System.out.println("RETIRO");
        System.out.println("Ingrese el monto a retitar");
        ingreso = scanner.nextDouble();
        return ingreso;
    }
    
    public int Menu(){
        System.out.println("Realizar un depósito o un retiro");
        System.out.println("Para depósito ingrese [1] ");
        System.out.println("Para retiro ingrese [2]");
        int opcion = scanner.nextInt();
        return opcion;
    }
    public char Respuesta(){
        System.out.println("¿Desea realizar otra transacción? S/N");
        char respuesta = scanner.next().charAt(0);
        return respuesta;
    }
}

/*
public double lectura(String Titulo, String Mensaje){
        System.out.println(Titulo);
        System.out.println(Mensaje);
        valorIngresado = lectura.nextDouble();
        return valorIngresado;
    }
  
    public int menu(){
        System.out.println("Realizar un depósito o un retiro");
        System.out.println("Para depósito ingrese [1] ");
        System.out.println("Para retiro ingrese [2]");
        int opcion = lectura.nextInt();
        return opcion;
    }
    public char lectura(String Mensaje){
        System.out.println(Mensaje);
        char respuesta = lectura.next().charAt(0);
        return respuesta;
    }
*/