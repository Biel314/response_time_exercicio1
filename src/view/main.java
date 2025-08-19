package view;

import controller.TempoController;

// Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor de 1000
// posições inteiras (Preencher todas as posições com valor 0) e gere o tempo gasto, em
// Segundos, para percorrer o vetor. Repetir para 10000 e 100000 posições. A aplicação deve
// ter uma classe de controle com métodos para operações e uma classe de visão que instancie
// a classe de controle para a comunicação. A resposta da tarefa deve ser o print do console
// com cada tempo.

public class main {

	public static void main(String[] args) {
		TempoController tempoController = new TempoController();
		
		int[] test1 = new int[1000]; //vetor com 1000
		int[] test2 = new int[10000]; //vetor com 10000
		int[] test3 = new int[100000]; //vetor com 100000
	
		tempoController.responseTime(test1);
		
		tempoController.responseTime2(test2);
		
		tempoController.responseTime3(test3);
		
	}

}
