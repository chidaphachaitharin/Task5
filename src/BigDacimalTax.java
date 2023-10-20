import java.math.BigDecimal;

public class BigDacimalTax {
    public static void main(String[] args) {
        BigDecimal net = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23"); // 23% VAT
        BigDecimal quantity = new BigDecimal("10000");

        BigDecimal gross = net.multiply(vat.add(BigDecimal.ONE));
        BigDecimal totalGross = gross.multiply(quantity);
        BigDecimal totalNet = totalGross.subtract(totalGross.multiply(vat));

        System.out.println("Net Value (excluding VAT): " + net);
        System.out.println("Gross Value (including VAT): " + gross);
        System.out.println("Total Net Value (excluding VAT) for 10,000 products: " + totalNet);
        System.out.println("Total Gross Value (including VAT) for 10,000 products: " + totalGross);
    }
}
