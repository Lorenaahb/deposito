/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        double cantidadEsperada = 0;
        
        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        
		probarIngresar(objetoCuenta, saldoActual, cantidadEsperada);
        probarRetirar(objetoCuenta, saldoActual, cantidadEsperada);
        
    
    }

	public static void probarIngresar(CCuenta objetoCuenta, double saldoActual, double cantidadEsperada) {
		
		try {
			objetoCuenta.ingresar(saldoActual);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void probarRetirar(CCuenta objetoCuenta, double saldoActual, double cantidadEsperada) {
		
        try {
			objetoCuenta.retirar(saldoActual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
