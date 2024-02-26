package tareacd3;
//a ver 

public class CtaCte {
    public static void main(String[] args) {
         
    	CtaCte miCuenta = new CtaCte();
    	
    	System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
    	miCuenta.ingresar(-100);
    	System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
    	miCuenta.ingresar(100);
    	System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
    	miCuenta.ingresar(200);
    	System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
    	miCuenta.ingresar(300);
    	System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
    	miCuenta.retirar(50);
    	System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");
    }
// Propiedades de la Clase Cuenta
    public double dSaldo;
 
    /* Metodo para ingresar cantidades en la cuenta. Modifica el saldo */
    public int ingresar(double cantidad) 
    {
    	int iCodErr;
    	
        if (cantidad < 0)
        {
        	System.out.println("No se puede ingresar una cantidad negativa");
        	iCodErr = 1;
        }
        else if (cantidad == -3)
        {
            System.out.println("Error detectable en pruebas de caja blanca");
        	iCodErr = 2;
        }
        else
        {
        	dSaldo = dSaldo + cantidad;
        	iCodErr = 0;
        }
        
        return iCodErr;
    }
    /* Metodo para retirar cantidades en la cuenta. Modifica el saldo */
    public void retirar (double cantidad) 
    {
        if (cantidad <= 0)
        {
            System.out.println("No se puede retirar una cantidad negativa");
        }
        else if (dSaldo < cantidad)
        {
            System.out.println("No se hay suficiente saldo");
        }
        else
        {
        	dSaldo = dSaldo - cantidad;
        }
    }
    
}    