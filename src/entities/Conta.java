package entities;

public class Conta {
	
	private String numero;
	private String titular;	
	private double saldo;
	
	
	public Conta(String numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public Conta(String numero, String titula, double depositoInicial) {
		super();
		this.numero = numero;
		this.titular = titula;
		deposita(depositoInicial);;
	}
	
	public String getNumero() {
		return numero;
	}	
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor + 5.00;
	}
	
	@Override
	public String toString() {		
		return "Conta " + numero + ", Titular: " + titular + ", Saldo: $ " + String.format("%.2f", saldo);
	}

}
