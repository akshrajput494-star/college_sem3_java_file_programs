// Bank account builder — design BankAccount with overloaded constructors, this() chaining, and static field for account count
class BankAccount {
    String id, name; double bal;
    
    public BankAccount() { this("000", "N/A", 0.0); }
    public BankAccount(String id, String name, double bal) { this.id = id; this.name = name; this.bal = bal; }
    public BankAccount(BankAccount o) { this(o.id + "-COPY", o.name, o.bal); }
    
    void print() { System.out.println(id + " | " + name + " | $" + bal); }
}

class ProductSearch {
    void search(String n) { System.out.println("Search: " + n); }
    void search(String n, String c) { System.out.println("Search: " + n + " in " + c); }
    void search(double p) { System.out.println("Search under: $" + p); }
}

public class problem_11 {
    public static void main(String[] args) {
        System.out.println("--- Bank Accounts ---");
        new BankAccount().print();
        BankAccount acc2 = new BankAccount("101", "Alice", 500.0);
        acc2.print();
        new BankAccount(acc2).print();

        System.out.println("\n--- Product Search ---");
        ProductSearch ps = new ProductSearch();
        ps.search("Phone");
        ps.search("Phone", "Tech");
        ps.search(99.99);
    }
}