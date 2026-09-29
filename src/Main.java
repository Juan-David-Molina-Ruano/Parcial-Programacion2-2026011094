public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Juan David Molina Ruano", 12000, new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
