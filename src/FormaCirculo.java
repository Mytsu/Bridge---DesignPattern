// Abstração Refinada

class FormaCirculo extends Forma() {
    private double x, y, radius;

    public FormaCirculo(final double x, final double y, final double radius, final DesenhoAPI desenhoAPI) {
        super(desenhoAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // implementação de baixo nivel (específico da implementação)
    public void desenhar() {
        desenhoAPI.desenharCirculo(x, y, radius);
    }

    // implementação de alto nivel (específico da abstração)
    public void alterarTamanhoPorPorcentagem(final double pct) {
        radius *= (1.0 + pct/100.0);
    }
}