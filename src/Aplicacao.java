/*
73) A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos
para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população
b) Média do número de filhos
c) Maior salário dos habitantes
d) Percentual de pessoas com salário menor que R$ 150,00
Obs.: O final da leituras dos dados se dará com a entrada de um “salário negativo”.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
	public static void main (String args[]) {
		ArrayList<Habitante> todosOsHabitantes = new ArrayList<Habitante>();		
		try (Scanner scanner = new Scanner(System.in)) {
			double salario = 0;
			while (salario >= 0) {
				System.out.print("Informe o salario: ");
				salario = Double.valueOf(scanner.next());
				if (salario < 0)
					break;
				System.out.print("Informe a quantidade de filhos: ");
				int quantidadeFilhos = Integer.valueOf(scanner.next());
				Habitante habitante = new Habitante(salario, quantidadeFilhos);
				todosOsHabitantes.add(habitante);
			}
			Prefeitura prefeitura = new Prefeitura(todosOsHabitantes);			
			String relatorio = String.format("Temos %s habitantes."
					+ "\n A média do número de filhos é de %s."
					+ "\n A média dos salários é de %s. "
					+ "\n O maior salário dos habitantes é %s. "
					+ "\n O percentual de pessoas com salário abaixo de R$ 150,00 é %s",
					prefeitura.calcularHabitantes(),					
					prefeitura.calcularMediaNumeroFilhos(),
					prefeitura.calcularMediaSalarial(),
					prefeitura.calcularMaiorSalario(),
					prefeitura.calcularPercentualSalarios()
					);
			System.out.println(relatorio);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
