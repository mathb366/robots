import java.util.List;
public class Time {
    private String nomeTime;
    private List<Robo> robos;

    public String getNomeTime() {
        return this.nomeTime;
    }
    public List<Robo> getNomesParticipantes() {
        return this.robos;
    }

    // Métodos para controlar a equipe
    public void executarComandos() {
        // Implementar lógica para comandar os robôs
    }

    // Método para calcular a quantidade total de Hélio-3 coletada pela equipe
    public int mostrarHelioColetado() {
        int total = 0;
        for (Robo robo : robos) {
            total += robo.helioColetado();
        }
        return total;
    }
}

