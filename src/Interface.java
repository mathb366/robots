public class Interface {
    private int tempoJogo;
    public String getNomeEquipe(){
        return this.NomeEquipe;
    }
    public String getNomeUsuario(){
        return this.nomeUsuarios;
    }

    public int getVolumeHelioEquipe(){
        // Método para calcular a quantidade total de Hélio-3 coletada pela equipe
        int total = 0;
        for (Robo robo : robos) {
            total += robo.helioColetado();
        }
        return total;
    }

    public int getVolumeHelioRobo(){
        // Método para calcular a quantidade total de Hélio-3 coletada por cada participante
        int total = 0;
        for (Robo robo : robos) {
            total += robo.helioColetado();
        }
        return total;
    }

    public String relatorio(){
        //retorna o nome das equipes, de cada jogador com sua pontuação(helio adiquirido)
    }
}
