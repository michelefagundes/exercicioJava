import java.util.Scanner;

public class dadosPessoa {
	public static void main (String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			classePessoa p1, p2;
			p1 = new classePessoa();
			p2 = new classePessoa();
			
			
			System.out.println("Digite seu nome: ");
			p1.name = sc.next();
			System.out.println("Digite seu cpf: ");
			p1.cpf = sc.next();
			
			System.out.println("\n Digite seu nome: ");
			p2.name = sc.next();
			System.out.println("Digite seu cpf: ");
			p2.cpf = sc.next();
			
		}
		
	}
}
