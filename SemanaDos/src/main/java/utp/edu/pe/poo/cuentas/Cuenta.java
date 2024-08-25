package utp.edu.pe.poo.cuentas;

public class Cuenta {
    public double monto;
    public Cuenta(){
        monto=0;
    }
    public boolean retirarCuenta(double montoRetirar){
        if(monto> montoRetirar){
            monto-= montoRetirar;
            return true;
        } 
        return false;
    }
    public void abonarCuenta(double montoAbonar){       
        monto+= montoAbonar;
    }
}
