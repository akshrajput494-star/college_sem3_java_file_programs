// Loop showdown — solve identical problems (pattern printing, sum) using for, while, do-while, and enhanced for; compare results

public class problem_09 {
    public static void main(String[] args) {
        // 1. For Loop
        int sumFor = 0;
        for (int i = 1; i <= 5; i++) sumFor += i;
        
        // 2. While Loop
        int sumWhile = 0, j = 1;
        while (j <= 5) sumWhile += j++;
        
        // 3. Do-While Loop
        int sumDo = 0, k = 1;
        do { sumDo += k++; } while (k <= 5);
        
        // 4. Enhanced For Loop
        int sumEnhanced = 0;
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) sumEnhanced += num;

        System.out.println("Sums: " + sumFor + ", " + sumWhile + ", " + sumDo + ", " + sumEnhanced);
    }
}

