import java.util.Scanner;

public class Revisao0 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
	
		String nomeUsuario;
		
		System.out.println("Por favor, escreva seu nome:");
		nomeUsuario = leitor.next();
		
		System.out.println("Obrigado por utilizar o meu programa" + nomeUsuario);
		
		
		leitor.close();
	}

}
