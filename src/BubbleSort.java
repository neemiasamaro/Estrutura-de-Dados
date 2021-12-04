import java.time.Duration;
import java.time.Instant;

public class BubbleSort {

	public static void main(String[] args) {
		int tamanho = 15000;
		int valores = 100;
		int[] vet = new int[tamanho];
		for (int n = 0; n < vet.length; n++) {

			vet[n] = (int) (Math.random() * valores) + 1;
		}

		int aux = 0;
		int i = 0;
		Instant inicio = Instant.now();
		for (i = 0; i < vet.length; i++) {
			for (int j = 0; j < (vet.length - 1); j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		Instant termino = Instant.now();
		Duration tempoDecorrido = Duration.between(inicio, termino);
		for (i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i]);
		}
		System.out.println("\nTempo decorrido: " + tempoDecorrido);
	}
}