package banca;
/**
 * Representa una cuenta bancaria
 * @author Alejandro Perez
 * @version 1.0
 * @since 2026
 */
public class Cuenta {
	private Cliente cliente;
	private String iban;
	private double saldo;
	
	/**
	 * Constructor que recibe todos los datos para abrir la cuenta
	 * @param cliente
	 * @param iban 
	 * @param saldo
	 */
	/**
	 * Constructor que recibe todos los datos para abrir la cuenta.
	 * @param cliente
	 * @param iban
	 * @param saldo
	 */
	public Cuenta(Cliente cliente, String iban, double saldo) {
		super();
		this.cliente = cliente;
		this.iban = iban;
		this.saldo = saldo;
	}
	
	public Cuenta(Cliente cliente, String iban) {
		super();
		this.cliente = cliente;
		this.iban = iban;
		this.saldo = 0;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	/**
	 * Realiza un ingreso en la cuenta
	 * @param saldo a ingresar
	 * @return saldo actualizado
	 */
	public double ingresar(double cantidad) {
		this.saldo += cantidad;
		return this.saldo;
	}
	/**
	 * Realiza un retiro de la cuenta
	 * @param saldo a retirar
	 * @return saldo actualizado
	 */
	public double retirar(double cantidad) {
		this.saldo -= cantidad;
		return this.saldo;
	}
	
	
}
