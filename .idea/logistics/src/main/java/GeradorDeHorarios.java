
import java.time.LocalTime;

public class GeradorDeHorarios {
    public static void gerarHorario(){
        LocalTime inicioDoExpediente = LocalTime.of(9,0);

        LocalTime fimDoExpediente = LocalTime.of(18,0);

        while (inicioDoExpediente.isBefore(fimDoExpediente)){
            System.out.println("Horario disponivel: " + inicioDoExpediente);

            inicioDoExpediente = inicioDoExpediente.plusMinutes(30);
        }
    }

    public static void main(String[] args) {
        gerarHorario();
    }
}
