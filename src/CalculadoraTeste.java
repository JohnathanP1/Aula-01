import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double primeiroValor;
		double segundoValor;
		double soma;
		System.out.println("Por favor, digite um valor:");
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor, digite o segundo valor");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores é " + soma);
		
		
		
		
		leitor.close();
		
	}

}
