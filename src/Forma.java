// Abstração

abstract class Forma {
    protected DesenhoAPI desenhoAPI;
    
    protected Forma(final DesenhoAPI desenhoAPI) {
        this.desenhoAPI = desenhoAPI;
    } 

    public abstract void desenhar(); // baixo nivel
    public abstract void alterarTamanhoPorPorcentagem(final double pct); // alto nivel
}