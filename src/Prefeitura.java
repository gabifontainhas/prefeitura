import java.util.ArrayList;

public class Prefeitura {
	private ArrayList<Habitante> todosOsHabitantes = new ArrayList<Habitante>();
	private double salarioComparacao = 150.0;
	
	public Prefeitura(ArrayList<Habitante> todosOsHabitantes) {
		this.todosOsHabitantes = todosOsHabitantes;
	}

	public int calcularHabitantes() {
		return todosOsHabitantes.size();
	}

	public double calcularMediaNumeroFilhos() {
		double totalFilhos = 0;		
		for (Habitante habitante : todosOsHabitantes) 
			totalFilhos += habitante.getQuantidadeFilhos();		
		return totalFilhos/todosOsHabitantes.size();
	}

	public double calcularMediaSalarial() {
		double totalSalarios = 0;		
		for (Habitante habitante : todosOsHabitantes) 
			totalSalarios += habitante.getQuantidadeFilhos();		
		return totalSalarios/todosOsHabitantes.size();
	}

	public double calcularMaiorSalario() {
		double salarioMaior = 0;
		for (Habitante habitante : todosOsHabitantes) {
			if (salarioMaior < habitante.getSalario()) 
				salarioMaior = habitante.getSalario();
		}
		return salarioMaior;
	}

	public double calcularPercentualSalarios() {
		double pessoasSalarioMenor = 0;
		for (Habitante habitante : todosOsHabitantes) 
			if (habitante.getSalario() < salarioComparacao)
				pessoasSalarioMenor++;		
		return pessoasSalarioMenor*100/todosOsHabitantes.size();
	}
}
