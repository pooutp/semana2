package utp.edu.pe.poo.semanados;

import utp.edu.pe.poo.cuentas.Cuenta;
import utp.edu.pe.poo.pantalla.Pantalla;

public class SemanaDos {
    public static void main(String[] args) {     
      
        Pantalla pantalla = new Pantalla();
        Cuenta cuenta = new Cuenta();
        double monto;
        char respuesta;
        boolean  apagado = true;
        int opcion;
        do{
            opcion = pantalla.Menu();
            switch(opcion){
                case 1:
                    monto = pantalla.Ingreso();
                    cuenta.abonarCuenta(monto);
                    break;
                case 2:
                    monto = pantalla.Ingreso();
                    if(!cuenta.retirarCuenta(monto)){
                        System.out.println("Saldo insuficiente " );
                    };
                    break;
            }
            respuesta = pantalla.Respuesta();
            if(respuesta=='N' || respuesta=='n'){        
                System.out.println("El saldo disponible es " + cuenta.monto);
                apagado=false;
            }
        } while(apagado);
    }
}

/*Cuenta cuenta = new Cuenta();
       
        */
        /*Coche coche1 = new Coche("Toyota", "Corolla", 2020);
        Coche coche2 = newgithubCoche("Honda", "Civic", 2021);

        System.out.println("Marca del coche 1: " + coche1.marca);
        System.out.println("Marca del coche 2: " + coche2.marca);
        System.out.println("Número total de coches: " + Coche.numeroDeCoches);*/