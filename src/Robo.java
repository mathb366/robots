public class Robo {
    private int x, y;
    private String nomeTime;
    private int helioColetado;

    public void robo(int x, int y, String nomeTime) {
        this.x = x;
        this.y = y;
        this.nomeTime = nomeTime;
        this.helioColetado = 0;
    }

    public int getPosicaoXRobo(){
        return this.x;
    }

    public int getPosicaoYRobo(){
        return this.y;
    }
}
