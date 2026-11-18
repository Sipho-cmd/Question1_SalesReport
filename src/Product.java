public class Product implements IProduct {

    private int [][] salesData ={{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
    private String [] productNames = {"Cozy Nights Monarch mattress", "Restonic Barbados, mattress", "Sealy Phuket mattress"};

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] row : salesData) {
            for (int val : row) total += val;
        }
        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        return  (double) GetTotalProductsSold() / 9;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = 0;
        String mostPopular = "";
        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                mostPopular = productNames[i] = "(" + maxSales + ")";
            }
        }
        return mostPopular;
    }
}