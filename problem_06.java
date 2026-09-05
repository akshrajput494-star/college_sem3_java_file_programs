// Operator playground — test arithmetic, relational, logical, and bitwise operators with precedence tracing.

public class problem_06 {
    public static void main(String[] args) {
        double unitPrice = 50.0;
        int quantity = 15;
        double taxRate = 0.05; // 5%
        int stock = 100;

        // Base cost
        double totalCost = unitPrice * quantity;

        // Compound multiplication for dynamic bulk discount (>10 items)
        if (quantity > 10) totalCost *= 0.88; // 12% discount

        // Compound addition for sales tax
        totalCost += (totalCost * taxRate);

        // Explicit cast to cents & modulus for change
        int totalCents = (int) (totalCost * 100);
        double changeUnderDollar = totalCost % 1.0;

        // Compound subtraction for inventory
        stock -= quantity;

        System.out.println("Total Cents: " + totalCents);
        System.out.printf("Change under $1: $%.2f%n", changeUnderDollar);
        System.out.println("Remaining Stock: " + stock);
    }
}