// Equality detective — compare strings and objects using == vs.equals(), demonstrating reference vs value equality.

public class problem_07 {


    public static void main(String[] args) {
        // String Constant Pool vs Heap
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1 == s2: " + (s1 == s2)); // true (Same pool reference)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (Different memory locations)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (Same value)

        // Wrapper Classes caching
        Integer a = 100, b = 100;
        Integer c = 200, d = 200;
        System.out.println("100 == 100: " + (a == b)); // true (Cached)
        System.out.println("200 == 200: " + (c == d)); // false (Outside cache)
    }

}
