package Methods;

public class SumDigits {
    public static int sumDigits (int x){
        int sum = 0;
        while (x > 0){
            int digit = x % 10;
            sum += digit;

            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }
}
