public class FizzBuzz {
    public void fizzBuzz(){
        for (int numero = 1 ; numero <= 20; numero++){

            boolean divisivelPor3 = numero % 3 == 0;
            boolean divisivelPor5 = numero % 5 == 0;

            if (divisivelPor3 && divisivelPor5){
                System.out.println("FizzBuzz");
            }
            else if (divisivelPor3){
                System.out.println("Fizz");
            }
            else if (divisivelPor5){
                System.out.println("Buzz");
            }
            else {
                System.out.println(numero);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz teste = new FizzBuzz();
        teste.fizzBuzz();
    }
}