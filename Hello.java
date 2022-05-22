public class Hello {
    public static void main(String[] args) {
        // boolean value = isPrime(15);
        // System.out.println(value);
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {

                
                count++;
System.out.println(i+"r prime");

            }
            if (count == 3) {
System.out.println("exiting the loop");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        // if (n == 1) {
        // return false;
        // }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

}
