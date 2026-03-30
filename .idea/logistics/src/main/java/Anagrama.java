import java.util.Arrays;


public class Anagrama {
    public static boolean saoAnagramas(String palavra1, String palavra2){
        //testa se as palavras tem o mesmo tamanho
        if (palavra1.length() != palavra2.length()){
            return false;
        }
        palavra1 = palavra1.toLowerCase();
        palavra2 = palavra2.toLowerCase();
        //quebras as palavras
        char[] arrayPalavras1 = palavra1.toCharArray();
        char[] arrayPalavras2 = palavra2.toCharArray();
        //ordena as palavras
        Arrays.sort(arrayPalavras1);
        Arrays.sort(arrayPalavras2);

        //verifica se e iguais
        return Arrays.equals(arrayPalavras1, arrayPalavras2);
    }

    public static void main(String[] args) {
        String teste1A = "Roma";
        String teste1B = "amor";

        String teste2A = "java";
        String teste2B = "vaja";

        String teste3A = "carro";
        String teste3B = "corpo";

        System.out.println("'" + teste1A + "'" + " e " + teste1B + " sao anagramas?" + saoAnagramas(teste1A, teste1B));
        System.out.println("'" + teste2A + "'" + " e " + teste2B + " sao anagramas?" + saoAnagramas(teste2A, teste2B));
        System.out.println("'" + teste3A + "'" + " e " + teste3B + " sao anagramas?" + saoAnagramas(teste3A, teste3B));
    }
}
