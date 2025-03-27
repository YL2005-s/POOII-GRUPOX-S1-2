public class Punto {
    private int x, y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Punto punto) {
        return Math.sqrt(Math.pow(punto.getCoordenadaX() - this.x, 2) + Math.pow(punto.getCoordenadaY() - this.y, 2));
    }

    public double calcularDistancia() {
        return calcularDistancia(new Punto());
    }

    public int getCoordenadaX() {
        return x;
    }

    public int getCoordenadaY() {
        return y;
    }

    public void setCoordenadaX(int x) {
        this.x = x;
    }

    public void setCoordenadaY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + x + "," + y;
    }

}
