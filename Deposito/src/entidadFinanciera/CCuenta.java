
package entidadFinanciera;

/**
 * Clase que representa a una cuenta
 * @author lorena huete
 */

public class CCuenta {

    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
	
    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public static String getErrorcantidadnegativa() {
		return ERRORCANTIDADNEGATIVA;
	}

	/**
	 * Devuelve el estado de la cuenta
	 * @return saldo de la cuenta
	 */
	public double estado(){
        return this.saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
	public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad
     * @param cantidad a retirar
     * @throws Exception si la cantidad es 0 o negativa
     */
	public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("ERRORCANTIDADNEGATIVA");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   