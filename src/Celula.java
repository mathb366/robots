import java.util.Random;
public class Celula {
    Random random = new Random();
    private int x, y;
    private double concentracaoHelio = 0.0;
    private double[] limiteErroConcetracao = new double[] { 0.02, 0.02 };;
    private double rugosidaeTerreno = 1.0;;
    public void Cell() {
        this.concentracaoHelio = random.nextDouble(1);
        this.limiteErroConcetracao = new double[]{random.nextDouble(0, 0.1)};
        this.rugosidaeTerreno = random.nextDouble(1);
    }

    public double getHeliumConcetration() {
        return this.concentracaoHelio;
    }

    /*public double[] getErro() {
        return this.limiteErroConcetracao;
    }*/

    public double getrugosidaeTerreno(int x, int y) {
        return this.rugosidaeTerreno;
    }

}
//a função celula será aleatoria pq é nela que cada propriedade vai ficar e são diferentes