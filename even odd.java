interface PerformOperation {
    boolean check(int a);
}

public class Solution {

    public static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public static void main(String[] args) {
        PerformOperation op = isOdd();

        System.out.println(op.check(5)); // true
        System.out.println(op.check(8)); // false
        System.out.println(op.check(11)); // true
        System.out.println(op.check(20)); // false
    }
}
