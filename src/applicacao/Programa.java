package applicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.Terceirizado;

public class Programa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de Funcionários # ");
		int n = leitor.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionário #" + i + " de: " + n);
			System.out.print("Terceirizado? (s/n) ");
			char sn = leitor.next().toUpperCase().charAt(0);
			System.out.print("Nome: ");
			leitor.nextLine();
			String nome = leitor.nextLine();
			System.out.print("Horas: ");
			int horas = leitor.nextInt();
			System.out.print("Valor por hora: ");
			double valorHora = leitor.nextDouble();
			
			if (sn == 'S') {
				System.out.print("Valor Adicional: ");
				double despesaAdicional = leitor.nextDouble();
				lista.add(new Terceirizado(nome, horas, valorHora, despesaAdicional));
			}
			else {
				lista.add(new Funcionario(nome, horas, valorHora));
			}
						
		}
		
		System.out.println();
		
		System.out.println("Pagamentos: ");
		
		for (Funcionario l: lista) {
			System.out.println(l.getNome() + " - " + "$ " + String.format("%.2f", l.pagamento()));
		}
		

		
		leitor.close();
	}

}
