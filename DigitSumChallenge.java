public class DigitSumChallenge {
    public static void main(String[] args) {
        int value = sumDigits(125);
        System.out.println(value);
    }

    public static int sumDigits(int num) {
        if (num < 10) {
            return -1;
        }
        int sum = 0;
        while (num >= 10) {
int digit=num%10;
            sum += digit;
        }
        return sum;
    }

}