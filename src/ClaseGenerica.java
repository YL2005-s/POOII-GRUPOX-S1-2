public class ClaseGenerica {

    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(8, 4);
        Punto p3 = new Punto(3, 7);
        Triangulo triangulo = new Triangulo("Triangulito", p1, p2, p3);
        SuperficiePlana superficiePlana = new SuperficiePlana();
        superficiePlana.agregarFigura(triangulo);

        System.out.println("====================");
        System.out.println("\t" + triangulo.getNombre());
        System.out.println("====================");
        System.out.println("Área del triángulo: " + triangulo.calcularAreaFigura());
        System.out.println("Triángulo equilátero: " + triangulo.esRegular());
        System.out.println("Área total de la superficie: " + superficiePlana.calcularAreaTotal());
        System.out.println("====================");
    }
}