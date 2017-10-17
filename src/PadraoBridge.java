
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

/*
	
	Resultado esperado:

API1.circle em 1.000000:2.000000 - radius 3.075000
API2.circle em 5.000000:7.000000 - radius 11.275000

*/