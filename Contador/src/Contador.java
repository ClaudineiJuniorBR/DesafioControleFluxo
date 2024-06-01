import java.util.Scanner; //importa o pacaote do scanner	
							// sem isso não funciona

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in); // para funcionar o escanner temos que definir o nome
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		System.out.println("######################################################################");
		try { // vai tentar isso, caso tenha um erro ele vai para o catch
				// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			// chama o metodo contar, pega os dois valores e insere no metodo
		} catch (ParametrosInvalidosException e) { // caso apareça um erro temos a exceção ParametrosInvalidosException
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		System.out.println("######################################################################");
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException { // criação do metodo
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm) { // primeira condição, caso o n2 < n1 ele vai rodar a excecão
			throw new ParametrosInvalidosException(); // sem isso não funciona

		} else if (parametroDois > parametroUm) { // segunda condição
			int resultado = 0;
			resultado = parametroDois - parametroUm; // faz a conta
			System.out.println("contagem " + resultado);
		} else { // caso tenha erro
			System.out.println("ERRO TENTE NOVAMENTE !");
		}
		int contagem = parametroDois - parametroUm; // igual o resultado, usamos para fazer o for
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i + 1));
		}
	}

}