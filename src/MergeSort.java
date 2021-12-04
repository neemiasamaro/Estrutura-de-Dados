import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int tamanho = 15000;
		int valores = 100;
		int[] valor = new int[tamanho];

		for (int i = 0; i < valor.length; i++) {

			valor[i] = (int) (Math.random() * valores) + 1;

		}
		Instant inicio = Instant.now();
		mergeSort(valor, 0, valor.length);
		Instant termino = Instant.now();
		Duration tempoDecorrido = Duration.between(inicio, termino);
		imprime(valor);
		System.out.println("Tempo decorrido: " + tempoDecorrido);
	}

	static void mergeSort(int[] vetor, int inicio, int termino) {

		if (termino - inicio > 1) {

			int quebra = (inicio + termino) / 2;

			mergeSort(vetor, inicio, quebra);

			mergeSort(vetor, quebra, termino);

			intercalacao(vetor, inicio, quebra, termino);
		}
	}

	static void intercalacao(int original[], int inicio, int quebra, int termino) { // 2n

		int tamanhoEsquerda = quebra;
		int tamanhoDireita = termino;
		int tamanhoResultante = termino - inicio;

		int resultante[] = new int[tamanhoResultante];

		int posicaoEsquerda = inicio,
				posicaoDireita = quebra,
				posicaoResultante = 0;

		// intecalacao ordenada
		while (posicaoEsquerda < tamanhoEsquerda && posicaoDireita < tamanhoDireita) {
			int professorEsquerda = original[posicaoEsquerda];
			int professorDireita = original[posicaoDireita];

			if (professorEsquerda < professorDireita) {
				resultante[posicaoResultante++] = original[posicaoEsquerda++];
			} else {
				resultante[posicaoResultante++] = original[posicaoDireita++];
			}
		}

		while (posicaoEsquerda < tamanhoEsquerda) {
			resultante[posicaoResultante++] = original[posicaoEsquerda++];
		}

		while (posicaoDireita < tamanhoDireita) {
			resultante[posicaoResultante++] = original[posicaoDireita++];
		}

		for (int atual = 0; atual < resultante.length; atual++) {

			original[atual + inicio] = resultante[atual];
		}
	}

	//
	static void imprime(int vetor[]) {

		System.out.println(vetor.length + ": ");

		System.out.println(Arrays.toString(vetor));
	}
}