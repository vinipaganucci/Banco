package executavel;
import java.util.Locale;
import java.util.Scanner;

import dadosMetodos.DadosComMetodosContaCorrente;
import dadosMetodos.Escolha;

public class Caixa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		DadosComMetodosContaCorrente dados = new DadosComMetodosContaCorrente();
		
		int chave = 0;
		while (chave == 0) {
			System.out.print("Digite o nome do titular: ");
			String nomeCedido = scanner.next();
			
			if (dados.getTitular().equals(nomeCedido)) {
				System.out.println("\nTitular encontrado!\n");
				chave = 1;
			} else {
				System.out.println("\nTitular não encontrado tente novamente...\n");
			}

		}
		
		Escolha funcao = new Escolha();
		
		funcao.escolherFuncao();
		scanner.close();
		
		
	}

}
