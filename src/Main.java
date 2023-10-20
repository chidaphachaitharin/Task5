public class Main {
    public static void main(String[] args) {

        double net = 9.99;
        double tax = 0.23;
        int quantity = 10000;

        double gross = 9.99 + (9.99 * tax);
        double TotalGross = gross * quantity;
        double TotalNet = TotalGross - (TotalGross * tax);

        System.out.println("Net Value (excluding VAT): " + net);
        System.out.println("Gross Value (including VAT 23%): " + gross);
        System.out.println("Total Net Value (excluding VAT) for 10,000 products: " + TotalNet);
        System.out.println("Total Gross Value (including VAT 23s%) for 10,000 products: " + TotalGross);

    }
}