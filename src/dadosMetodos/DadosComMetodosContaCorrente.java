package dadosMetodos;
import java.util.Locale;
import java.util.Scanner;

public class DadosComMetodosContaCorrente {

	private String titular = "Vinicius";
	private String agencia = "Nubank";
	private double saldo = 4000;
	
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar() {	
		System.out.print("Digite o valor a ser depositado: ");
		double valorDeposito = scanner.nextDouble();
		double saldoFinal = valorDeposito + getSaldo();
		setSaldo(saldoFinal);
	}
	
	public void sacar() {
		System.out.print("Digite o valor a ser sacado: ");
		double valorSaque = scanner.nextDouble();
		if (valorSaque > getSaldo()) {
			System.out.println("\nSaldo insuficiente tente novamente...\n");
			sacar();
		} else {
			double saldoFinal = getSaldo() - valorSaque;
			setSaldo(saldoFinal);
		}
		
	}
	
	public void transferir() {
		
	}
}
