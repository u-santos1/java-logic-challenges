import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public int[] calcularValores(List<Integer> lista){

        int alvo = 100;

        for (int i = 0; i < lista.size(); i++){
            for (int j = i + 1;j <  lista.size(); j++){
                int soma = lista.get(i) + lista.get(j);
                if (soma == alvo){
                    return new int[]{i, j};
                }
            }
        }return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum teste = new TwoSum();

        int[] resultado = teste.calcularValores(List.of(30,40,50,60,70));
        System.out.println(Arrays.toString(resultado));
    }
}