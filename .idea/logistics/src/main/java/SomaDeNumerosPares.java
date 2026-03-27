import java.util.List;

public class SomaDeNumerosPares {
    public Integer somarPares(List<Integer> soma) {
        int somaDeValoresPares = 0;

        for (int numero : soma) {
            if (numero % 2 == 0){
                somaDeValoresPares += numero;
            }

        }return somaDeValoresPares;
    }

    public static void main(String[] args) {
        SomaDeNumerosPares somaDeNumerosPares = new SomaDeNumerosPares();


        System.out.println(somaDeNumerosPares.somarPares(List.of(2,3,4,5,6)));
    }
}