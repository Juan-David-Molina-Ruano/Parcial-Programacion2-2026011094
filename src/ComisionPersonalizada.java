public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        // (5 + N)% donde N = letras del primer nombre.
        // Juan = 4 letras -> 9%
        return montoVenta * 0.09;
    }
}
