
// Implementador Concreto 1

class DesenhoAPI1 implements DesenhoAPI {
    public void desenharCirculo(final double x, final double y, final double radius) {
        System.out.printf("API1.circulo em %f:%f - radius %f\n", x, y, radius);
    }
}