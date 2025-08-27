public class EvenOddDigitCounter {
    public static void countEvenOddDigits(int num) {
        int even = 0, odd = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0)
                even++;
            else
                odd++;
            num /= 10;
        }

        System.out.println("Even: " + even + ", Odd: " + odd);
    }
    public static void main(String[] args) {
        int input = 462859;
        countEvenOddDigits(input); 
    }
}
