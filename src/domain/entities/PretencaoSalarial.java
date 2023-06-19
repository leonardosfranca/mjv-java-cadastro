package domain.entities;

public class PretencaoSalarial {

    private Double pretencaoMinima;
    private Double pretencaoMaxima;

    public PretencaoSalarial() {
    }

    public PretencaoSalarial(Double pretencaoMinima, Double pretencaoMaxima) {
        this.pretencaoMinima = pretencaoMinima;
        this.pretencaoMaxima = pretencaoMaxima;
    }

    public Double getPretencaoMinima() {
        return pretencaoMinima;
    }

    public void setPretencaoMinima(Double pretencaoMinima) {
        this.pretencaoMinima = pretencaoMinima;
    }

    public Double getPretencaoMaxima() {
        return pretencaoMaxima;
    }

    public void setPretencaoMaxima(Double pretencaoMaxima) {
        this.pretencaoMaxima = pretencaoMaxima;
    }
}
