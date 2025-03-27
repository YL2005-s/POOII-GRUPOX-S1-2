import java.util.ArrayList;
import java.util.List;

class SuperficiePlana {
    private final List<FiguraGeometrica> figuras;

    public SuperficiePlana() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public double calcularAreaTotal() {
        double totalArea = 0;
        for (FiguraGeometrica figura : figuras) {
            totalArea += figura.calcularAreaFigura();
        }
        return totalArea;
    }
}
