import java.util.Scanner;

public class Teste0 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double primeiroValor;
		double segundoValor;
		double soma, substracao, divisao , multiplicacao;
		
		System.out.println("Por favor, digite um valor:");
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor, digite o segundo valor:");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores � " + soma);
		
		substracao = primeiroValor - segundoValor;
		System.out.println("A substra��o entre os dois valores � " + substracao);
		
		divisao = primeiroValor / segundoValor;
		System.out.println("A divis�o entre os dois valores � " + divisao);
		
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A multiplica��o entre os dois valores � " + multiplicacao);
		
		
		
		
		
		leitor.close();
		
	}

}
