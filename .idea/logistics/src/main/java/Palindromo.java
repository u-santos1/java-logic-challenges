

public class Palindromo {
    public static boolean ehUmPalindromo(String palavras){
        String limpo = palavras.replaceAll("[^a-zA-Z0-0]", "").toLowerCase();


        int inicio = 0;
        int fim = limpo.length() - 1;

        while (inicio < fim){
            if (limpo.charAt(inicio) != limpo.charAt(fim)){
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    public static void main(String[] args) {
        String teste1 = "arara";
        String teste2 = "radar";
        String teste3 = "java";
        String teste4 = "ana";
        String teste5 = "racecar";
        String teste6 = "Socorram-me, subi no ônibus em Marrocos";
        String teste7 = "A man, a plan, a canal: Panama";


        System.out.println(teste1 + " " + ehUmPalindromo(teste1));
        System.out.println(teste2 + " " + ehUmPalindromo(teste2));
        System.out.println(teste3 + " " + ehUmPalindromo(teste3));
        System.out.println(teste4 + " " + ehUmPalindromo(teste4));
        System.out.println(teste5 + " " + ehUmPalindromo(teste5));
        System.out.println(teste6 + " " + ehUmPalindromo(teste6));
        System.out.println(teste7 + " " + ehUmPalindromo(teste7));




    }
}
