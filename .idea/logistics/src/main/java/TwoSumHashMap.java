import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {


    public int[] calcularValoresOtimizado(List<Integer> lista) {
        int alvo = 100;
        Map<Integer, Integer> vistos = new HashMap<>(); // valor → índice

        for (int i = 0; i < lista.size(); i++) {
            int numero = lista.get(i);
            int complemento = alvo - numero;

            if (vistos.containsKey(complemento)) {
                return new int[]{vistos.get(complemento), i};
            }

            vistos.put(numero, i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum teste = new TwoSum();

        int[] resultado = teste.calcularValoresOtimizado(List.of(30,40,50,60,70));
        System.out.println(Arrays.toString(resultado));
    }
}
