public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Juan David Molina Ruano", 10000, new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
