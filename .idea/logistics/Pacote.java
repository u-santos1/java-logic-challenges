public class Pacote {
    private double peso;
    private double distancia;
    private boolean fragil;


    Pacote(double peso, double distancia, boolean fragil) {
        this.peso = peso;
        this.distancia = distancia;
        this.fragil = fragil;
    }

    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}