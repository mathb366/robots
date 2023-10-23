import java.util.ArrayList;
import java.util.List;

public class Terreno {
    private int larguraTerreno = 100;
    private int alturaTerreno = 100;
    private Celula terreno[][];
    private List<Time> time;

    public void setTerreno(int larguraTerreno, int alturaTerreno, List<Time> time) {
        this.larguraTerreno = larguraTerreno;
        this.alturaTerreno = alturaTerreno;
        initializeTerrain();
    }

    private void initializeTerrain() {
        for (int x = 0; x < larguraTerreno; x++) {
            for (int y = 0; y < alturaTerreno; y++) {
                terreno[x][y] = new Celula();


            }
        }
    }
    public double getConcentracaoHelio3(int x, int y){
        return terreno[x][y].getHeliumConcetration();
    }

    public double getRugosidade(int x, int y){
        return terreno[x][y].getRugosidadeTerreno();
    }
    //retorna uma celula do terreno
    public Celula[][] getCelulaTerreno() {
        return terreno;
    }
}
