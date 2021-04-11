import java.util.Scanner;

public class RecebendoDadosRevisao {

	public static void main(String[] args) { 
		Scanner leitor =  new Scanner(System.in);
		
		String nomeUsuario;
		
		System.out.println("Por favor, escrever seu nome");
		leitor.next();
		nomeUsuario = leitor.next();
		
		System.out.println("Obrigado por utilizar o programa, " + nomeUsuario);
	
		
		
		
		leitor.close();
		
	}

}
