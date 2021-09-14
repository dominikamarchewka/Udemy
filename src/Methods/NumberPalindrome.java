package Methods;

public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        if (number < 0){
            number *= -1;
        }
        int numberOrg = number;
        int reverse = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (numberOrg == reverse){
            return true;
        } else return false;
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int firstDigit = 0;
        int lastDigit = number % 10;
        while (number > 0){
            if (number < 10){
                firstDigit = number;
            }
            number /= 10;
        }
        firstDigit = number;
        sum = firstDigit + lastDigit;
        return sum;
    }

    public static int getEvenDigitSum (int number){
        if(number < 0){
            return -1;
        } else {
            int sum = 0;
            while (number > 0){
                int digit = number % 10;
                if (digit % 2 == 0){
                    sum += digit;
                }
                number /= 10;
            } return sum;
        }
    }

    public static boolean hasSharedDigit (int first, int second){
        if (first < 10 || first > 99 || second < 10 || second > 99){
            return false;
        } else {
            int firstDigit = first % 10;
            int secondDigit = second % 10;
            first /= 10;
            second /= 10;

            if(firstDigit == secondDigit || firstDigit == second || secondDigit == first || first == second){
                return true;
            } else return false;
        }
    }

    public static int getGreatestCommonDivisor (int x, int y){
        if (x < 10 || y < 10){
            return -1;
        } else {
            int divisor = 0;
         for (int i = 1; i <= x; i++){
             if(x%i == 0 && y%i == 0){
                 divisor = i;
             }
         }
         return divisor;
        }
    }

    public static boolean isPerfectNumber (int number) {
        if (number < 0) {
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i < number; i++){
                if(number % i == 0){
                    sum += i;
                }
            }
            if (number == sum){
                return true;
            } else return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));

    }
}
