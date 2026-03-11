public class CalculadoraFaturamento {
    public double calcularFaturamentoTotal(List<Pacote> pacotes) {
        return pacotes.stream()
                .filter(pacote -> !(pacote.getPeso() > 50 && pacote.getDistancia() > 500))
                .mapToDouble(pacote -> {
                    double custo = 15.00 + (pacote.getPeso() * 3);
                    if(pacote.getDistancia() > 100){
                        custo += (pacote.getDistancia() - 100) * 0.50;
                    }
                    return pacote.isFragil() ? custo * 1.20 : custo;
                })
                .sum();
    }

    public static void main(String[] args) {

        List<Pacote> pacotesDoDia = new ArrayList<>();
        pacotesDoDia.add(new Pacote(2, 200, true));

        CalculadoraFaturamento calc = new CalculadoraFaturamento();
        double total = calc.calcularFaturamentoTotal(pacotesDoDia);
        System.out.println("Faturamento Total do Dia: R$ " + total);

    }
}