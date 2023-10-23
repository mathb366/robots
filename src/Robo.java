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
    }
}
