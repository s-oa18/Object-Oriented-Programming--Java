public class Lab10 {

    public static void main(String[] args) {

        double originalPrice = 20.0;
        double discountMultiplier = 0.3;

        CustomerType customer = CustomerType.COMPANY;
        DiscountLevel discountLevel = DiscountLevel.FOUR;

        double totalDiscountLevel = (customer.ordinal() + 1) * (discountLevel.ordinal() + 1);
        double newCost = originalPrice - (totalDiscountLevel * discountMultiplier);

        System.out.println("Customer Type: " + customer.toString() + " Discount Level: " + discountLevel);
        System.out.println("Original Price: " + originalPrice + " New Price: " + newCost);
        ;

        double[] discountValues = { 0.1, 0.2, 0.3, 0.4 };
        double baseDiscountPercent = discountValues[discountLevel.ordinal()];

        double[] customerDiscountValues = { 1, 1.2 };
        double finalDiscountPercent = baseDiscountPercent * (customerDiscountValues[customer.ordinal()]);
    }
}
