import java.util.Random;
public class Celula {
    Random random = new Random();
    private int x, y;
    private double concentracaoHelio = 0.0;
    private double[] limiteErroConcetracao = new double[]{0.02, 0.02};
    ;
    private double rugosidadeTerreno = 1.0;
    ;

    public void Cell() {
        this.concentracaoHelio = random.nextDouble(1);
        this.limiteErroConcetracao = new double[]{random.nextDouble(0, 0.1)};
        this.rugosidadeTerreno = random.nextDouble(1);
    }

    public double getHeliumConcetration() {
        return this.concentracaoHelio;
    }

    public double getRugosidadeTerreno() {
        return this.rugosidadeTerreno;
    }

}