import java.util.Arrays;
import java.time.Duration;
import java.time.Instant;

public class ArraySort {
    public static void main(String[] args) {
        int tamanho = 15000;
        int valores = 100;
        int[] valor = new int[tamanho];

        for (int i = 0; i < valor.length; i++) {

            valor[i] = (int) (Math.random() * valores) + 1;

        }
        Instant inicio = Instant.now();
        Arrays.sort(valor);
        Instant termino = Instant.now();
        Duration tempoDecorrido = Duration.between(inicio, termino);

        System.out.printf("Modified arr[] : %s", Arrays.toString(valor));
        System.out.println("Tempo decorrido: " + tempoDecorrido);
    }
}
