public class Triangulo extends FiguraGeometrica {
    private Punto punto1, punto2, punto3;

    public Triangulo() {
        super("Triangulo");
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    private double distancia(Punto a, Punto b) {
        return a.calcularDistancia(b);
    }

    @Override
    public double calcularAreaFigura() {
        double a = distancia(punto1, punto2);
        double b = distancia(punto2, punto3);
        double c = distancia(punto3, punto1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public boolean esRegular() {
        double a = distancia(punto1, punto2);
        double b = distancia(punto2, punto3);
        double c = distancia(punto3, punto1);
        return a == b && b == c;
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " + punto1.toString() + ", " + punto2.toString() + ", " + punto3.toString();
    }
}
