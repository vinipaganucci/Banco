package dadosMetodos;
import java.util.Locale;
import java.util.Scanner;

public class Escolha {

	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	DadosComMetodosContaCorrente dados = new DadosComMetodosContaCorrente();

	public void escolherFuncao() {
		System.out.println("Depositar [1]  |  Sacar [2]  |  Transferir [3]  |  Dados [4]  |  Sair [5]");
		System.out.print("==> ");
		int numeroChave = scanner.nextInt();
		
		if (numeroChave == 1) {
			dados.depositar();
			System.out.println("\nDeposito realizado com sucesso!");
			System.out.println("Saldo atual: " + dados.getSaldo() + "\n");
			escolherFuncao();
		} else if (numeroChave == 2) {
			dados.sacar();
			System.out.println("\nSaque realizado com sucesso!");
			System.out.println("Saldo atual: " + dados.getSaldo() + "\n");
			escolherFuncao();
		} else if (numeroChave == 3) {
			dados.transferir();
		} else if (numeroChave == 4) {
			System.out.println("\nTitular: " + dados.getTitular());
			System.out.println("Agência: " + dados.getAgencia());
			System.out.println("Saldo: " + dados.getSaldo() + "\n");
			escolherFuncao();
		} else if (numeroChave == 5) {
			System.out.println("\nVolte sempre!");
		} else {
			System.out.println("Valor inválido tente novamente");
			escolherFuncao();
		}
	}
	
}
