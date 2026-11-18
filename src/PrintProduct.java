public class PrintProduct {
    public void PrintReport(IProduct product){
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("**********************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalIproductSold());
        System.out.println("AVERAGE PRODUCT SALES: %.0f%n" + product.GetAverageProductSold());
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
