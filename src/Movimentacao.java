public class Movimentacao {
    private Robo robo;
    private Terreno terreno;

    public Movimentacao(Robo robo, Terreno terreno) {
        this.robo = robo;
        this.terreno = terreno;
    }
    public void movimentacao(int deltaX, int deltaY) {
        switch (comando) {
            case "anda":
                moverParaFrente();
                break;
            case "esquerda":
                virarParaEsquerda();
                break;
            case "direita":
                virarParaDireita();
                break;
            default:
                System.out.println("Comando de movimentação inválido.");
        }
    }

    private void moverParaFrente() {
        int x = robo.getPosicaoXRobo();
        int y = robo.getPosicaoYRobo();

        int direcao = robo.getDirecao();

        int novoX = x;
        int novoY = y;

        switch (direcao) {
            case 0: // Norte
                novoY = y - 1;
                break;
            case 1: // Leste
                novoX = x + 1;
                break;
            case 2: // Sul
                novoY = y + 1;
                break;
            case 3: // Oeste
                novoX = x - 1;
                break;
            default:
                System.out.println("Direção inválida.");
                return;
        }

        // Verificar se a nova posição está dentro dos limites do terreno.
        if (novoX >= 0 && novoX < terreno.getTamanho() && novoY >= 0 && novoY < terreno.getTamanho()) {
            robo.getPosicaoXRobo(novoX);
            robo.getPosicaoYRobo(novoY);
        } else {
            System.out.println("Movimento bloqueado: fora dos limites do terreno.");
        }
    }

    private void virarParaEsquerda() {
        int direcao = robo.getDirecao();
        // Virar 90 graus para a esquerda (no sentido horário).
        direcao = (direcao - 1 + 4) % 4;
        robo.setDirecao(direcao);
    }

    private void virarParaDireita() {
        int direcao = robo.getDirecao();
        // Virar 90 graus para a direita (no sentido horário).
        direcao = (direcao + 1) % 4;
        robo.setDirecao(direcao);
    }
}
}
