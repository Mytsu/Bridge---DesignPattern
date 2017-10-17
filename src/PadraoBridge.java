
// Cliente

class PadraoBridge {
    public static void main(final String[] args) {
        Forma[] formas = new Forma[] {
            new FormaCirculo(1, 2, 3, new DesenhoAPI1()),
            new FormaCirculo(5, 7, 11, new DesenhoAPI2())
        };

        for (Forma forma: formas) {
            forma.alterarTamanhoPorPorcentagem(2.5);
            forma.desenhar();
        }
    }
}