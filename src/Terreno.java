import java.util.ArrayList;
import java.util.List;

public class Terreno {
    private int larguraTerreno = 100;
    private int alturaTerreno = 100;
    private Celula terrain[][];
    private List<Time> time;
    private ArrayList<ArrayList<Celula>> terreno = new ArrayList<>();

    public void setTerreno(int larguraTerreno, int alturaTerreno, List<Time> time) {
        this.larguraTerreno = larguraTerreno;
        this.alturaTerreno = alturaTerreno;
        initializeTerrain();
    }

    private void initializeTerrain() {
        // Inicializar as células do terreno com valores de concentração aleatórios
        for (int x = 0; x < larguraTerreno; x++) {
            for (int y = 0; y < alturaTerreno; y++) {
                terrain[x][y] = new Celula();


            }
        }
    }
    //retorna uma celula do terreno
    public Celula getCelula_terreno(){

    }
    // Métodos para executar o jogo
    public void startGame() {
        // Implementar a lógica do jogo
    }
}
