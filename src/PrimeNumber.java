public class PrimeNumber {

    public static void main(String[] args) {
        int n, count;
        int s = 1000;
        System.out.println("prime number between 1 to " + s + " are");
        for (int j = 2; j <= s; j++) {
            count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println(j + " ");

            }
        }
    }
}
