public class Main {
    public  static void main(String[] args) {
        Product product = new Product();
        PrintProduct printer = new PrintProduct();
        printer.PrintReport(product);
    }
}