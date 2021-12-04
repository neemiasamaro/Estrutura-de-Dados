import java.time.Instant;
import java.time.Duration;

public class InsertionSort {

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String a[]) {
        int tamanho = 15000;

        int valores = 100;

        int[] valor = new int[tamanho];

        for (int i = 0; i < valor.length; i++) {

            valor[i] = (int) (Math.random() * valores) + 1;
        }
        Instant inicio = Instant.now();

        insertionSort(valor);

        Instant termino = Instant.now();
        Duration tempoDecorrido = Duration.between(inicio, termino);

        for (int i : valor) {
            System.out.print(i + "-");
        }
        System.out.println("\nTempo decorrido: " + tempoDecorrido);
    }
}