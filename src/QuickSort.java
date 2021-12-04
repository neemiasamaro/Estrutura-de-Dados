import java.time.Duration;
import java.time.Instant;

public class QuickSort {
    public static void main(String[] args) {

        int tamanho = 15000;
        int valores = 100;
        int[] valor = new int[tamanho];

        for (int i = 0; i < valor.length; i++) {

            valor[i] = (int) (Math.random() * valores) + 1;

        }

        Instant inicio = Instant.now();
        quickSort(valor, 0, valor.length);
        Instant termino = Instant.now();

        Duration tempoDecorrido = Duration.between(inicio, termino);
        imprime(valor);
        System.out.println("Tempo decorrido: " + tempoDecorrido);
    }

    public static void quickSort(int[] valor, int inicio, int termino) {

        if (termino - inicio > 1) {

            int posicaoPivo = particiona(valor, inicio, termino);

            quickSort(valor, inicio, posicaoPivo);

            quickSort(valor, posicaoPivo + 1, termino);
        }
    }

    public static int particiona(int[] valor, int inicio, int termino) {

        int menoresEncontrados = inicio;
        int posicaoDoPivo = termino - 1;

        int pivo = valor[posicaoDoPivo];

        for (int atual = inicio; atual < posicaoDoPivo; atual++) {

            int nota = valor[atual];

            if (nota < pivo) {

                troca(valor, atual, menoresEncontrados);

                menoresEncontrados++;
            }
        }

        troca(valor, posicaoDoPivo, menoresEncontrados);

        return menoresEncontrados;
    }

    //
    public static void troca(int[] valor, int origem, int destino) {

        int notaOrigem = valor[origem];
        int notaDestino = valor[destino];

        valor[origem] = notaDestino;
        valor[destino] = notaOrigem;
    }

    //
    public static void imprime(int[] valor) {

        for (int fim : valor) {

            System.out.print(fim + " ");
        }

        System.out.println();
    }
}