import java.time.Duration;
import java.time.Instant;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
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
        selectionSort(valor);
        Instant termino = Instant.now();
        Duration tempoDecorrido = Duration.between(inicio, termino);
        for (int i : valor) {
            System.out.print(i + "-");
        }
        System.out.println("\nTempo decorrido: " + tempoDecorrido);
    }
}