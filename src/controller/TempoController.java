package controller;

public class TempoController {

	public TempoController() {
		super();
	}

	public void responseTime(int[] arr) {
		int i;
		
		double tInicial = System.nanoTime();
		for(i=0; i < 1000; i++) {
			arr[i] = 0;
		}
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = tTotal / Math.pow(10, 9);
		
		System.out.println("Tempo em segundos que demorou para preencher o vetor de 1000 foi de: " + tTotal);
	}
	
	public void responseTime2(int[] arr) {
		int i;
		
		double tInicial = System.nanoTime();
		for(i=0; i < 10000; i++) {
			arr[i] = 0;
		}
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = tTotal / Math.pow(10, 9);
		
		System.out.println("Tempo em segundos que demorou para preencher o vetor de 10000 foi de: " + tTotal);
	}
	
	public void responseTime3(int[] arr) {
		int i;
		
		double tInicial = System.nanoTime();
		for(i=0; i < 100000; i++) {
			arr[i] = 0;
		}
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = tTotal / Math.pow(10, 9);
		
		System.out.println("Tempo em segundos que demorou para preencher o vetor de 100000 foi de: " + tTotal);
	}
	
	
}
