public class NumerosPrimos {
    public static boolean verifivarSeEhPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        for (int numero = 1 ; numero <= 20; numero ++ ){
            if (verifivarSeEhPrimo(numero)){
                System.out.println(numero + " e primo");
            }else {
                System.out.println(numero + " nao e primo");
            }
        }
    }
}
