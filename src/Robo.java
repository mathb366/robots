public class Robo {
    private int x, y;
    private int direcao;
    private int helioColetado;
    public Robo(int x, int y, int direcao) {
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    public int getPosicaoXRobo() {
        return this.x;
    }
    public int getPosicaoYRobo(){
        return this.y;
    }

    public int getDirecao() {
        return direcao;
    }
    class ControladorRobo {
        private Robo robo;
        private Terreno terreno;

        public ControladorRobo(Robo robo, Terreno terreno) {
            this.robo = robo;
            this.terreno = terreno;
        }

        public void executarComando(String comando) {
            switch (comando) {
                case "posicao":
                    int x = robo.getPosicaoXRobo();
                    int y = robo.getPosicaoYRobo();
                    System.out.println("Posição: (" + x + ", " + y + ")");
                    break;
                case "concentracao":
                    double concentracao = terreno.getConcentracaoHelio3(robo.getPosicaoXRobo(), robo.getPosicaoYRobo());
                    System.out.println("Concentração de Hélio-3: " + concentracao);
                    break;
                case "rugosidade":
                    double rugosidade = terreno.getRugosidade(robo.getPosicaoXRobo(), robo.getPosicaoYRobo());
                    System.out.println("Rugosidade: " + rugosidade);
                    break;
                case "tempo":
                    // Implemente a lógica para obter o tempo decorrido.
                    break;
                default:
                    System.out.println("Comando de sensoriamento inválido.");
            }
        }
    }
}

