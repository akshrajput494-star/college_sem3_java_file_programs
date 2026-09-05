// Data type explorer — declare all primitives, perform implicit/explicit casting, and observe overflow behavior.

public class problem_02 {
    public static void main(String[] args) {
        // Task 1: 8 Primitive Types
        byte age = 25;
        short defense = 300;
        int score = 50000;
        long totalCoins = 15000000000L;
        float speed = 12.5f;
        double exactHealth = 99.5;
        char rank = 'S';
        boolean isAlive = true;

        System.out.println("Age: " + age + ", Rank: " + rank);
        System.out.println("Defense: " + defense + ", Coins: " + totalCoins + ", Speed: " + speed + ", Alive: " + isAlive);
        
        // Task 2: Implicit Casting
        long savedScore = score; 
        System.out.println("Saved Score (Implicit): " + savedScore);

        // Task 3: Explicit Casting
        int displayHealth = (int) exactHealth;
        System.out.println("Display Health (Explicit): " + displayHealth);

        // Task 4: Overflow Behavior
        int maxCoins = 2147483647;
        maxCoins += 1;
        System.out.println("Overflowed Coins (Max + 1): " + maxCoins); // Prints -2147483648
    }
}
