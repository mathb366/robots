public class Movimentacao {
    public Movimentacao(Robo robo, Terreno terreno) {
    }

    public void movimentacao(int deltaX, int deltaY) {
        switch (comando) {
            case "anda":
                // Implemente a lógica para mover o robô para frente.
                break;
            case "esquerda":
                // Implemente a lógica para virar o robô para a esquerda.
                break;
            case "direita":
                // Implemente a lógica para virar o robô para a direita.
                break;
            default:
                System.out.println("Comando de movimentação inválido.");
        }
    }
}
